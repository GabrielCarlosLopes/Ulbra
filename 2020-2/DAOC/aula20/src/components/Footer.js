import React from 'react';
import logo from '../logo.svg';
import './Footer.css'

function Footer() {
    return (
        <div>
            <footer className="jumbotron text-center">
                <img src={logo} className="App-logo" alt="logo" />
            </footer>
        </div>
    );
}

export default Footer;