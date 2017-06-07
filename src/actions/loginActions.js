import axios from 'axios';

export const getUser = (user) => {
    
    return dispatch => {
        console.log("insidde async", user)
        return axios.post('http://10.118.4.42:8763/cil/loginpage', user);
    }
}

export const getUserDetails = (user) => {
    
    return dispatch => {
        console.log("insidde async", user)
        return axios.post('http://10.118.4.33:8762/cil/forgotpage', user);
    }
}