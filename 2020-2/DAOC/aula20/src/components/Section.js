import React from 'react';
import {
    Switch,
    Route
} from 'react-router-dom';
import Home from './pages/Home'
import About from './pages/About'
import Products from './pages/Products'
import Contact from './pages/Contact'
import Login from './admin/Login';
import AdminHome from './admin/Home';
import ContactsView from './admin/ContactsView';
import ClientsView from './admin/clients/ClientsView';
import ContactResponse from './admin/ContactsResponse';
import ClientEdit from './admin/clients/ClientEdit';
import ClientInsert from './admin/clients/ClientInsert'
import PrivateRoute from './common/PrivateRoute';

function Section() {
    return (
        <div>
            <section id="section" className="container">
                <Switch>
                    <Route exact path="/">
                        <Home />
                    </Route>
                    <Route exact path="/about">
                        <About />
                    </Route>
                    <Route path="/product">
                        <Products />
                    </Route>
                    <Route exact path="/contact">
                        <Contact />
                    </Route>
                    <Route exact path="/users/login">
                        <Login />
                    </Route>

                    <PrivateRoute
                        exact path="/admin/home"
                        component={AdminHome}
                    />
                    <PrivateRoute
                        exact path="/admin/contacts/view"
                        component={ContactsView}
                    />
                    <PrivateRoute 
                        path="/admin/contacts/response/:id"
                        component={ContactResponse}
                    />
                    <PrivateRoute 
                        path="/admin/clients/view"
                        component={ClientsView}
                    />
                    <PrivateRoute 
                        path="/admin/clients/edit/:id"
                        component={ClientEdit}
                    />
                    <PrivateRoute 
                        path="/admin/clients/insert"
                        component={ClientInsert}
                    />


                </Switch>
            </section>
        </div >
    );
}

export default Section;