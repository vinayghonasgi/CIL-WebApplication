import { combineReducers } from 'redux';
import UserReducer from './reducers-users';
import reducerActiveUser from './reducer-active-user';
import reducerActiveProject from './reducer-active-project';
import { reducer as formReducer } from 'redux-form'
import reducerDashboard from './reducer-dashboard'

const allReducers = combineReducers({
    users: UserReducer,
    activeUser: reducerActiveUser,
    activeProject: reducerActiveProject,
    dashboard: reducerDashboard,
    form: formReducer
})

export default allReducers