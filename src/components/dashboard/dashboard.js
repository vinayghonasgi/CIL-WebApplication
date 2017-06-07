import React from 'react';
import './dashboard.scss'
import OngoingProjects from './ongoingProjects'
import { connect } from 'react-redux'
import  { bindActionCreators } from 'redux'
import { getDashboard } from '../../actions/index'
import DashboardMenu from './dashboardMenu'
import NewsLetter from './newsLetter'
import Polling from './polling'
import UpComingEvents from './upcomingEvents'

class Dashboard extends React.Component {
    componentWillMount () {
      this.props.getDashboard();
    }

    

    render() {        
        if(!this.props.dashboard) {
            return (<div><h4>Loading Dashboard....</h4></div>);
        }
        return (            
            <div>
                  <DashboardMenu />                    
                  <div className="container-fluid">
                    <div className="row space-top">
                          <OngoingProjects />
                          <div className="col-md-8">
                                <div className="panel dashboard-panel panel-primary">
                                  <div className="panel-heading dashboard">Newsletter</div>
                                  <div className="panel-body">
                                      
                                    <NewsLetter />

                                  </div>
                              </div>
                          </div>
                      </div>
                      <div className="row space-top">
                        {/*<div className="col-md-9">
                          <div className="panel dashboard-panel panel-primary">
                                  <div className="panel-heading dashboard">Upcoming Events</div>
                                  <div className="panel-body">sdsf</div>
                         </div>
                        </div>*/}
                        <UpComingEvents eventData={this.props.dashboard.dashboard.events}/>
                        <Polling />
                        
                      </div>
                  </div>

                </div>
            
        );
        
    }

    
}

function mapStateToProps(state) {
    return {        
        dashboard: state.dashboard
    };
}

function matchDispatchToProps(dispatch) {
    return bindActionCreators({getDashboard: getDashboard}, dispatch);
}

export default connect(mapStateToProps, matchDispatchToProps)(Dashboard);