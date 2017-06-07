export default function(state=null, action) {
    switch(action.type) {
        case "GET_DASHBOARD" :
            //return action.payload;
            return Object.assign({}, state, {
                dashboard : action.payload
            });
    }
    return state;
}