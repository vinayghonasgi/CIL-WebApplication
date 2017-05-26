import React, { Component } from 'react'
import {connect} from 'react-redux'
import { getUser } from '../actions/index'
import  { bindActionCreators } from 'redux'
import ContactForm from '../containers/contact-from'


class CallForm extends Component {
    /*submit () {
        this.props.getUser(values);
            alert();console.log('dkfcj');
            this.props.getUser(values);
    }*/
    render() {
       
        return (
            <div>
                <h2>form</h2>
                <ContactForm />
                {/*<input type="button" value="login" onClick={() => this.props.getUser(this.props.user)}/>*/}
            </div>
        );
    }

    
}
function mapStateToProps(state) {
    return {
        //user: state.activeUser
    };
}

function matchDispatchToProps(dispatch) {
    return bindActionCreators({getUser: getUser}, dispatch);
}

export default connect(mapStateToProps, matchDispatchToProps)(CallForm);
