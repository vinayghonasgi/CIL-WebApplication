import axios from 'axios';
export const selectUser = (user) => {
    return {
        type: "USER_SELECTED",
        payload: user
    }
}

export const getUser = (user) => {
    
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