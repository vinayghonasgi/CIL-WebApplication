import { combineReducers } from 'redux';
import UserReducer from './reducers-users';
import reducerActiveUser from './reducer-active-user';
import { reducer as formReducer } from 'redux-form'

const allReducers = combineReducers({
    users: UserReducer,
    activeUser: reducerActiveUser,
    form: formReducer
})

export default allReducers