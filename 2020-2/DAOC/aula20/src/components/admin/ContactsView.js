import React, { useEffect, useState } from 'react';
import Api from '../../Api';
import { getToken } from '../../Auth';
import { useHistory } from 'react-router-dom';
import SearchBar from '../common/SearchBar'
import ReactLoading from 'react-loading';


function ContactsView() {

    const [contacts, setContacts] = useState([]);
    const history = useHistory();

    useEffect(() => {
        Api.get('/contacts',
            {

                params: {},
                headers: {
                    Authorization: 'Bearer ' + getToken()
                }

            })
            .then((response) => {
                setContacts(response.data);
            })
    }, []);

    const handleClickResponse = (id) => {
        history.push(`/admin/contacts/response/${id}`)
    }

    const handleClickDelete = (id) => {
        Api.post(`/contacts/delete/${id}`,
            {},
            {
                headers: {
                    Authorization: 'Bearer ' + getToken()
                }
            }
        ).finally(function () {
            history.push('/admin/contacts/view')
            window.location.reload(true)
        })
    }

    return (
        <div className="row">
            <div className="col-md-1"></div>
            <div className="col-md-10">
                <h1>Listagem de Contatos</h1>
                {contacts.length === 0 ? (
                    <ReactLoading
                        type="spin"
                        color="blue"
                        className="loading"
                    />
                ) : (
                        <>
                            <SearchBar
                                path='/contacts/search'
                                handle={
                                    function (data) {
                                        setContacts(data)
                                    }
                                }
                            />
                            <br />
                            <table className="table table-striped">
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Nome</th>
                                        <th>Email</th>
                                        <th>Mensagem</th>
                                        <th>Status</th>
                                        <th colSpan="2">Ações</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    {contacts.map((contact, index) =>
                                        <tr key={index}>
                                            <td>{contact.idContact}</td>
                                            <td>{contact.name}</td>
                                            <td>{contact.email}</td>
                                            <td>{contact.message}</td>
                                            <td>{contact.status}</td>
                                            <td>
                                                <button
                                                    className="btn btn-primary"
                                                    onClick={() => handleClickResponse(contact.idContact)}
                                                >
                                                    Responder
                                    </button>
                                            </td>
                                            <td>
                                                <button
                                                    className="btn btn-danger"
                                                    onClick={() => handleClickDelete(contact.idContact)}
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

export default ContactsView;