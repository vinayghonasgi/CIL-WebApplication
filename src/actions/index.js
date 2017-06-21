import axios from 'axios';
import {browserHistory} from 'react-router';
import { LANDING_PAGE, FORGOT_PWD, LOGOUT, RESET_PWD } from '../constants';


export const selectUser = (user) => {
    return {
        type: "USER_SELECTED",
        payload: user
    }
}
export const showInvalidLogin = () => {
    return {
        type: "SHOW_INVALID_LOGIN",
        payload: true
    }
}
export const hideInvalidLogin = () => {
    return {
        type: "HIDE_INVALID_LOGIN",
        payload: false
    }
}

export const getLandingPage = () => {    
    return dispatch => {           
        axios.get(LANDING_PAGE)
            .then((json) => { 
            console.log(json.data)               
                 dispatch({
                    type: "LOAD_LANDING_PAGE",
                    payload: json.data
                    })
            })
    }    
}





export const getUser = (user) => {
    
    return dispatch => {
        console.log("insidde async", user)
        return axios.post('http://10.118.4.42:8764/api/cilapplication/cil/login', user);
    }
}

export const submitUser = (user) => {
    
    return dispatch => {
        axios.post('http://10.118.4.39:8762/cil/loginpage', {"username" : "gajendra.u","password" : "gajendra91"})        
            .then((json) => {
                
                if(json.data.id != null) {
                    console.log("inside action",json.data);
                    dispatch( {
                    type: "GET_USER",
                    payload: json.data
                    })
                }
                else {
                        console.log("inside pending",json.data);
                        dispatch( {
                         type: "USER_PENDING",
                            payload: "User is pending"
                        })
                    }
            })
            .catch((error) => {
                dispatch( {
                    type: "USER_NOT_RECEIVED",
                    payload: error
                })
            })
    }
}