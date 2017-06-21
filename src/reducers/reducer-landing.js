export default function(state=null, action) {
    switch(action.type) {
        case "LOAD_LANDING_PAGE" :
            //return action.payload;
            return Object.assign({}, state, {
                landingPage : action.payload
            });
        
    }
    return state;
} 
	
