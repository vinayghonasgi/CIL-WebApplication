import React from 'react'
import UserList from '../containers/user-lists'
import UserDetails from '../containers/user-details'
import ContactForm from '../containers/contact-from'

export default class Greetings extends React.Component {
submit (values) {
            console.log(values);
}
    render() {
        
        return (
            <div className="jumbotron">
                <h2>User list</h2>  
                <UserList />   
                <hr />
                <h2>User Details</h2>
                <UserDetails />
                <ContactForm onSubmit={this.submit}/>
            </div>
        );
    }

    
}
