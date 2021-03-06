import React, { useEffect, useState } from 'react';
import Api from '../../Api';
import { getToken } from '../../Auth';
import { useHistory } from 'react-router-dom';

function ContactsView() {

    const [contacts, setContacts] = useState([]);
    const history = useHistory();

    useEffect(() => {
        Api.get('/contacts',
            {

                params: {},
                headers: {
                    Authorization: "Bearer " + getToken()
                }

            })
            .then((response) => {
                setContacts(response.data);
            })
            .catch((errors) => {

            })
            .finally(() => {

            });
    }, []);

    const handleClickResponse = (id) => {
        history.push(`/admin/contacts/response/${id}`)
    }

    return (
        <div className="row">
            <div className="col-md-1"></div>
            <div className="col-md-10">
                <h1>Listagem de Contatos</h1>
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
                                        onClick={ () => handleClickResponse(contact.idContact)}
                                    >
                                        Responder
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

export default ContactsView;