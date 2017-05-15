import React, { Component } from 'react'
import {connect} from 'react-redux'
import { getUser } from '../actions/index'
import  { bindActionCreators } from 'redux'


class UserDetails extends Component {
    
    render() {
        if(!this.props.user) {
            return (<div><h4>Select a user ....</h4></div>);
        }
        return (
            <div>
                <h2>{this.props.user.first} {this.props.user.last}</h2>
                Age: <h3>{this.props.user.age}</h3>
                Description: <h3>{this.props.user.description}</h3>
                Description1: <h3>{this.props.user.email}</h3>
                <input type="button" value="login" onClick={() => this.props.getUser(this.props.user)}/>
            </div>
        );
    }

    
}
function mapStateToProps(state) {
    return {
        user: state.activeUser
    };
}

function matchDispatchToProps(dispatch) {
    return bindActionCreators({getUser: getUser}, dispatch);
}

export default connect(mapStateToProps, matchDispatchToProps)(UserDetails);
