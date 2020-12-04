import React from 'react';
import { useForm } from 'react-hook-form';
import { ErrorMessage } from '@hookform/error-message';
import Api from '../../../Api';
import { useHistory } from 'react-router-dom';
import { getToken } from '../../../Auth'

function ClientInsert() {

    const { handleSubmit, register, errors } = useForm();
    const history = useHistory();

    const onSubmit = data => {
        console.log(data);
        Api.post('/clients', {
            address: data.address,
            email: data.email,
            name: data.name,
            phone: data.phone,
        }, {
            headers: {
                Authorization: "Bearer " + getToken()
            }
        })
            .then(function (response) {
                console.log(response);
            })
            .catch(function (errors) {
                console.log(errors);
            })
            .finally(function () {
                history.push('/admin/clients/view');
                window.location.reload(true);
            })
    }


    return (
        <div className="row">
            <div className="col-md-1"></div>
            <div className="col-md-10">
                <h1>Adicionar Cliente</h1>
                <form onSubmit={handleSubmit(onSubmit)}>
                    <div className="form-group">
                        <label>Nome: </label>
                        <input
                            ref={register({
                                required: "Required"
                            })}
                            className="form-control"
                            type="text"
                            name="name"
                        />
                        <ErrorMessage errors={errors} name="name" />
                    </div>

                    <div className="form-group">
                        <label>Email: </label>
                        <input
                            ref={register({
                                required: "Required"
                            })}
                            className="form-control"
                            type="text"
                            name="email"
                        />
                        <ErrorMessage errors={errors} name="email" />
                    </div>

                    <div className="form-group">
                        <label>Telefone: </label>
                        <input
                            ref={register({
                                required: "Required"
                            })}
                            className="form-control"
                            type="text"
                            name="phone"
                        />
                        <ErrorMessage errors={errors} name="phone" />
                    </div>

                    <div className="form-group">
                        <label>Endereço: </label>
                        <input
                            ref={register({
                                required: "Required"
                            })}
                            className="form-control"
                            type="text"
                            name="address"
                        />
                        <ErrorMessage errors={errors} name="address" />
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

export default ClientInsert;