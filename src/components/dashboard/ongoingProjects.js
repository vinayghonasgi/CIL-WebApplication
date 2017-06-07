import React, { Component } from 'react'
import {connect} from 'react-redux'
import { selectProject } from '../../actions/index'
import  { bindActionCreators } from 'redux'
import ActiveProject from './activeProject'
import { Link } from 'react-router'
import {Tabs, Tab} from 'react-bootstrap'
//import Tab from 'react-bootstrap'

class OngoingProjects extends Component {
    callSelectProject (id) {
        console.log("hi")
        this.props.selectProject({id : id})
    }
    render() {        
        return (            
            <div className="col-md-4">
            <div className="panel dashboard-panel panel-primary">
              <div className="panel-heading dashboard">On-going Projects</div>
              <div className="panel-body">
                  <div>
                      <Tabs defaultActiveKey={1} animation={false} id="projects">
                        <Tab eventKey={1} title="Internal projects">
                            <ul className="project-list">
                                {this.props.dashboard.dashboard.internalproject.map((project, i) => {
                                    return <li key={i}><Link to="dashboard/projects" onClick={() => this.callSelectProject(project.id)}>{project.project_name}</Link></li>
                                })}
                            </ul>                                
                        </Tab>
                        <Tab eventKey={2} title="External projects">
                            <ul className="project-list">
                                {this.props.dashboard.dashboard.externalproject.map((project, i) => {
                                    return <li key={i}><Link to="dashboard/projects" onClick={() => this.callSelectProject(project.id)}>{project.project_name}</Link></li>
                                })}
                            </ul>
                        </Tab>                        
                    </Tabs>
                  </div>                  
              </div>
            </div>
        </div>
            
        );
    }

    
}
function mapStateToProps(state) {
    return {
        project: state.activeProject,
        dashboard: state.dashboard
    };
}

function matchDispatchToProps(dispatch) {
    return bindActionCreators({selectProject: selectProject}, dispatch);
}

export default connect(mapStateToProps, matchDispatchToProps)(OngoingProjects);
