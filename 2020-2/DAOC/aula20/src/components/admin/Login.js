import React from 'react';
import { useForm } from 'react-hook-form';
import { ErrorMessage } from '@hookform/error-message';
import Api from '../../Api';
import { setToken } from '../../Auth';
import { useHistory } from 'react-router-dom';

function Login() {

    const history = useHistory();

    const { handleSubmit, register, errors } = useForm();

    const onSubmit = data => {
        Api.post('users/login', {
            user: data.user,
            pass: data.pass
        })
            .then(function (response) {
                if (response.data.acess === 'true') {
                    setToken(response.data.token);
                    console.log(response.data.token);
                }
            })
            .finally(function () {
                history.push('/admin/home')
                window.location.reload(true);
            })
    }

    return (
        <div className="row">
            <div className="col-md-1"></div>
            <div className="col-md-10">
                <h1 className="center-title">Login</h1>
                <form onSubmit={handleSubmit(onSubmit)}>
                    <div className="form-group">
                        <label>Usuário</label>
                        <input
                            type="text"
                            className="form-control"
                            name="user"
                            ref={
                                register({
                                    required: "Required"
                                })
                            }
                        />
                        <ErrorMessage errors={errors} name="user" />
                    </div>
                    <div className="form-group">
                        <label>Senha</label>
                        <input
                            type="password"
                            className="form-control"
                            name="pass"
                            ref={
                                register({
                                    required: "Required"
                                })
                            }
                        />
                        <ErrorMessage errors={errors} name="pass" />
                    </div>
                    <button type="submit" className="btn btn-primary">Enviar</button>
                    <br />
                    <br />
                </form>
            </div>
            <div className="col-md-1"></div>
        </div>
    );
}

export default Login;