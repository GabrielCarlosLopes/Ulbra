import React, { useEffect, useState } from 'react';
import { useHistory, useParams } from 'react-router-dom';
import Api from '../../Api';
import { getToken } from '../../Auth';
import { useForm } from 'react-hook-form';
import { ErrorMessage } from '@hookform/error-message';

function ClientEdit() {

   let { id } = useParams();
   const [client, setClient] = useState([]);
   const { handleSubmit, register, errors } = useForm();

   const history = useHistory();

   useEffect(() => {
      Api.get(`/clients/${id}`,
         {
            params: {},
            headers: {
               Authorization: "Bearer " + getToken()
            }
         }
      )
         .then((response) => {
            setClient(response.data)
         })
   }, [id]);

   const onSubmit = (data) => {
      Api.post(`clients/update/${client.idClient}`,
         {
            name: data.name,
            email: data.email,
            phone: data.phone,
            address: data.address
         },
         {
            headers: {
               Authorization: "Bearer " + getToken()
            }
         })
         .then()
         .finally(() => {
            history.push('/admin/clients/view')
         })
   }

   return (
      <>
         <h1> Editar Cliente </h1>
         <form onSubmit={handleSubmit(onSubmit)}>
            <table className="table table-striped">
               <thead>

               </thead>
               <tbody>
                  <tr>
                     <th>ID</th>
                     <td>{client.idClient}</td>
                  </tr>
                  <tr>
                     <th>Nome</th>
                     <td>
                        <input
                           defaultValue={client.name}
                           ref={register({
                              required: "Required"
                           })}
                           className="form-control"
                           type="text"
                           name="name"
                        />
                        <ErrorMessage errors={errors} name="name" />
                     </td>
                  </tr>
                  <tr>
                     <th>Email</th>
                     <td>
                        <input
                           defaultValue={client.email}
                           ref={register({
                              required: "Required"
                           })}
                           className="form-control"
                           type="text"
                           name="email"
                        />
                        <ErrorMessage errors={errors} name="email" />
                     </td>
                  </tr>
                  <tr>
                     <th>Telefone</th>
                     <td>
                        <input
                           defaultValue={client.phone}
                           ref={register({
                              required: "Required"
                           })}
                           className="form-control"
                           type="text"
                           name="phone"
                        />
                        <ErrorMessage errors={errors} name="phone" />
                     </td>
                  </tr>
                  <tr>
                     <th>Endereço</th>
                     <td>
                        <input
                           defaultValue={client.address}
                           ref={register({
                              required: "Required"
                           })}
                           className="form-control"
                           type="text"
                           name="address"
                        />
                        <ErrorMessage errors={errors} name="address" />
                     </td>
                  </tr>
               </tbody>
            </table>
            <div className="form-group text-right">
               <button
                  type="submit"
                  className="btn btn-primary"
               >
                  Salvar
               </button>
            </div>
         </form>

      </>
   );
}

export default ClientEdit;