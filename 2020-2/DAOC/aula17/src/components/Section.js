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
import { isAdmin } from '../Auth';

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


                </Switch>
            </section>
        </div >
    );
}

export default Section;

function PrivateRoute({ component: Component, ...rest }) {
    return (
        <Route
            {...rest}
            render={
                props => (
                    isAdmin() ?
                        <Component {...props} />
                        :
                        console.log('não autenticado')
                )
            }
        />
    );
}