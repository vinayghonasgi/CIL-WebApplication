import React from 'react';
import { Route, IndexRoute } from 'react-router';

import App from './components/App';
import Greetings from './components/Greetings';
import LandingPage from './components/landingPage/landing-page';
import SignupPage from './components/signup/SignupPage';
import Dashboard from './components/dashboard/Dashboard'


export default (
	<Route path="/" component={App}>
		{/*<IndexRoute component={Greetings} />*/}
		<IndexRoute component={LandingPage} />
		<Route path="signup" component={SignupPage} />
		<Route path="dashboard" component={Dashboard} />
	</Route>
)