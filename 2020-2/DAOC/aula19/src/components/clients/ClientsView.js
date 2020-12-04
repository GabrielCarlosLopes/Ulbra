import React, { useEffect, useState } from 'react';
import Api from '../../Api';
import { getToken } from '../../Auth';
import { useHistory } from 'react-router-dom';

function ClientsView() {

    const [clients, setClients] = useState([]);
    const history = useHistory();

    useEffect(() => {
        Api.get('/clients',
            {

                params: {},
                headers: {
                    Authorization: 'Bearer ' + getToken()
                }

            })
            .then((response) => {
                console.log(response);
                setClients(response.data);
            })
            .catch((errors) => {

            })
            .finally(() => {

            });
    }, []);

    const handleClickEdit = (id) => {
        history.push(`/admin/clients/edit/${id}`)
    }

    const handleClickDelete = (id) => {
        Api.post(`/clients/delete/${id}`,
            {},
            {
                headers: {
                    Authorization: 'Bearer ' + getToken()
                }
            }
        ).finally(function () {
            history.push('/admin/clients/view')
            window.location.reload(true)
        })
    }

    const teste = () => {
        history.push('/admin/clients/insert')
    }

    return (
        <div className="row">
            <div className="col-md-1"></div>
            <div className="col-md-10">
                <h1>Listagem de Clients</h1>
                <button type="button"className="btn btn-primary" onClick={teste} >Adicionar Cliente</button>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nome</th>
                            <th>Email</th>
                            <th>Telefone</th>
                            <th>Endereço</th>
                            <th colSpan="2">Ações</th>
                        </tr>
                    </thead>
                    <tbody>
                        {clients.map((clients, index) =>
                            <tr key={index}>
                                <td>{clients.idClient}</td>
                                <td>{clients.name}</td>
                                <td>{clients.email}</td>
                                <td>{clients.phone}</td>
                                <td>{clients.address}</td>
                                <td>
                                    <button
                                        className="btn btn-primary"
                                        onClick={() => handleClickEdit(clients.idClient)}
                                    >
                                        Editar
                                    </button>
                                </td>
                                <td>
                                    <button
                                        className="btn btn-danger"
                                        onClick={() => handleClickDelete(clients.idClient)}
                                    >
                                        Excluir
                                    </button>
                                </td>
                            </tr>
                        )}
                    </tbody>
                </table>
            </div>
        </div>
    );
}

export default ClientsView;