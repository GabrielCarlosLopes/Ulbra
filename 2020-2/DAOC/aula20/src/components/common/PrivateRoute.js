import React from 'react';
import { isAdmin } from '../../Auth';
import { Route } from 'react-router-dom'

export default function PrivateRoute({ component: Component, ...rest }) {
  return (
    <Route
      {...rest}
      render={
        props => (
          isAdmin() ?
            <Component {...props} />
            :
            <div className="container">
              <h3>Ops!</h3>
              <p>Parece que vôce tentou entrar em uma area que necessita ser um administrador!</p>
            </div>
        )
      }
    />
  );
}