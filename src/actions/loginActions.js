import axios from 'axios';
import {browserHistory} from 'react-router';
import { LOGIN_PAGE, FORGOT_PWD, LOGOUT, RESET_PWD } from '../constants';

export const getUser = (user) => {
    
    return dispatch => {
        console.log("insidde async", user)
        return axios.post(LOGIN_PAGE, user);
    }
}

export const getUserDetails = (user) => {
    
    return dispatch => {        
        return axios.post(FORGOT_PWD, user);
    }
}

export const logout = (poll) => {
    return dispatch => {           
        return axios.post(LOGOUT, {
           headers: {
            'userlogin': localStorage.userlogin,
            'Content-Type': 'application/json'
            }
       })
            .then((json) => {                
                 if(!json.data.token) {                    
                    localStorage.removeItem("userlogin");
                    browserHistory.push('/');
                }
            })
    }    
}


export const resetPassword = (userInfo) => {
    return dispatch => {           
        return axios.post(RESET_PWD, userInfo)
            .then((json) => {                
                 if(json.data) {                   
                    localStorage.removeItem("forgotlogin");
                    browserHistory.push('/');                    
                }
            })
    }    
}