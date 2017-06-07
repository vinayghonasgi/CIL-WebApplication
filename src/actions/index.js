import axios from 'axios';
import { PROJECT_DATA, DASHBOARD } from '../constants';
import {browserHistory} from 'react-router';
export const selectUser = (user) => {
    return {
        type: "USER_SELECTED",
        payload: user
    }
}

export const selectProject = (project) => {     
    return dispatch => {
        console.log("insidde async", project)
        axios.post(PROJECT_DATA, project)
            .then((json) => {
                console.log("inside action",json.data);
                 dispatch({
                    type: "PROJECT_SELECTED",
                    payload: json.data
                    })
            })
    }
}

export const getDashboard = () => {
    return dispatch => {
        console.log("insidde getDashboard action")
       // axios.get('/src/data/dashboard.json')
       axios.get('http://10.118.4.42:8763/cil/dashboard')
            .then((json) => {
                console.log("inside getDashboard res action",json.data);
                 dispatch({
                    type: "GET_DASHBOARD",
                    payload: json.data
                    })
            })
    }
    /*return dispatch => {
        console.log("inside getDashboard")
        return axios.get('/src/data/dashboard.json');
    }*/
}


export const getUser = (user) => {
    
    return dispatch => {
        console.log("insidde async", user)
        return axios.post('http://10.118.4.39:8762/cil/loginpage', user);
    }/*{
        console.log("insidde async")
        
        //axios.post('http://10.118.4.33:8762/cil/loginpage', {"username" : "gajendra.u","password" : "gajendra91"})
        axios.get('https://api.github.com/users')
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
    }*/
}

export const submitUser = (user) => {
    
    return dispatch => {
        axios.post('http://10.118.4.39:8762/cil/loginpage', {"username" : "gajendra.u","password" : "gajendra91"})
        //axios.get('https://api.github.com/users')
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