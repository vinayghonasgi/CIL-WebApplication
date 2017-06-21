import React from 'react';
import 'font-awesome/css/font-awesome.css';
import './app.scss';

export default class App extends React.Component {

    render() {
        return (
            <div className="">
                {this.props.children}   
            </div>
        );
    }

    
}
