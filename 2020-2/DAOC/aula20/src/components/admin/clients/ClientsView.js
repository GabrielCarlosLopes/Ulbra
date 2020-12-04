import React, { useEffect, useState } from 'react';
import Api from '../../../Api';
import { getToken } from '../../../Auth';
import { useHistory } from 'react-router-dom';
import SearchBar from '../../common/SearchBar';
import ReactLoading from 'react-loading';

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
                setClients(response.data);
            })
    }, []);


    const handleDeleteButton = (id) => {
        Api.post(`/clients/delete/${id}`,
            {},
            {
                headers: {
                    Authorization: 'Bearer ' + getToken()
                }
            }
        ).finally(function () {
            history.push('/admin/clients/view')
            window.location.reload();
        })
    }

    const handleAddButton = () => {
        history.push('/admin/clients/insert')
    }

    const handleEditButton = (id) => {
        history.push(`/admin/clients/edit/${id}`)
    }

    return (
        <div className="row">
            <div className="col-md-1"></div>
            <div className="col-md-10">
                <h1>Listagem de Clientes</h1>
                <br />
                {clients.length === 0 ? (
                    <ReactLoading
                        type="spin"
                        color="blue"
                        className="loading"
                    />
                ) : (
                        <>
                            <SearchBar
                                path='/clients/search'
                                handle={
                                    function (data) {
                                        setClients(data)
                                    }
                                }
                            />
                            <br />
                            <button
                                type="button"
                                className="btn btn-primary"
                                onClick={handleAddButton}
                            >
                                Adicionar Cliente
                            </button>
                            <br /><br />
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
                                    {clients.map((clients) =>
                                        <tr key={clients.idClient}>
                                            <td>{clients.idClient}</td>
                                            <td>{clients.name}</td>
                                            <td>{clients.email}</td>
                                            <td>{clients.phone}</td>
                                            <td>{clients.address}</td>
                                            <td>
                                                <button
                                                    className="btn btn-primary"
                                                    onClick={() => handleEditButton(clients.idClient)}
                                                >
                                                    Editar
                                    </button>
                                            </td>
                                            <td>
                                                <button
                                                    className="btn btn-danger"
                                                    onClick={() => handleDeleteButton(clients.idClient)}
                                                >
                                                    Excluir
                                    </button>
                                            </td>
                                        </tr>
                                    )}
                                </tbody>
                            </table>
                        </>
                    )}
            </div>
        </div>
    );
}

export default ClientsView;