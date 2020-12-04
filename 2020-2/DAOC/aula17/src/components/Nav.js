import React from 'react';
import { Link, useHistory } from 'react-router-dom';
import { isAdmin, deleteToken } from '../Auth';

function Nav() {

   const history = useHistory();

   const logout = () => {
      deleteToken();
      history.push('/users/login');
      window.location.reload(true);
   }

   return (
      <div>
         <nav className="navbar navbar-expand-sm bg-dark navbar-dark">
            <ul className="navbar-nav">
               <li className="nav-item ">
                  <Link className="nav-link" href="#header" to="/">Home</Link>
               </li>
               <li className="nav-item">
                  <Link className="nav-link" href="#header" to="/about">Sobre</Link>
               </li>
               <li className="nav-item">
                  <Link className="nav-link" href="#header" to="/product">Produtos e Serviços</Link>
               </li>
               <li className="nav-item">
                  <Link className="nav-link " href="#header" to="/contact">Contatos</Link>
               </li>
            </ul>
            <ul className="navbar-nav ml-auto">
               {
                  isAdmin() ?
                     <>
                        <li className="nav-item">
                        <Link className="nav-link" to="/admin/contacts/view">
                              Listar Contatos
                        </Link>
                        </li>
                        <li className="nav-item">
                           <Link onClick={logout} className="nav-link">
                              Logout
                        </Link>
                        </li>
                     </>
                     :

                     <li className="nav-item">
                        <Link className="nav-link" to="/users/login">
                           Login
                        </Link>
                     </li>

               }
            </ul>
         </nav>
      </div>
   );
}

export default Nav;