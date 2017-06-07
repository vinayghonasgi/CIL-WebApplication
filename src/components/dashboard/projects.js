import React, { Component } from 'react'
import {connect} from 'react-redux'
import { selectProject } from '../../actions/index'
import  { bindActionCreators } from 'redux'
import ActiveProject from './activeProject'
 


class Projects extends Component {
    
    render() {
        if(!this.props.project) {
            console.log("sddk",this.props.project);
            return (<div><h4>Select a user ....</h4>
            <input type="button" value="login" onClick={() => this.props.selectProject({
            id: 1,
            first: "Bucky",
            last: "Roberts",
            age: 23,
            description: "react developer",
            thumbnail: "jdhfjdhfjdfhj"
        })}/>
            </div>);
        }
        return (
            
            <ActiveProject project={this.props.project} />
            
        );
    }

    
}
function mapStateToProps(state) {
    return {
        project: state.activeProject
    };
}

function matchDispatchToProps(dispatch) {
    return bindActionCreators({selectProject: selectProject}, dispatch);
}

export default connect(mapStateToProps, matchDispatchToProps)(Projects);
