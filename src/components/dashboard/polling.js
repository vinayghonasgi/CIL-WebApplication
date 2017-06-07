import React from 'react'
import { connect } from 'react-redux'
import { Link } from 'react-router'

class Polling extends React.Component {

    render() {        
        return (
            <div className="col-md-3">
                <div className="panel dashboard-panel panel-primary">
                    <div className="panel-heading dashboard">Opinion Poll</div>
                        <div className="panel-body">                                   
                            <p>
                              How is CIL Website?    
                            </p><hr className="adjustSep" />    
                            <ul>
                                {this.props.dashboard.dashboard.polling.options.map((polling, i) => {
                                    return <li key={i} className="list-group-item polling-list">
                                            <div className="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios"/>
                                                    {polling}
                                                </label>
                                            </div>
                                        </li>
                                 })}                                
                            </ul><hr className="adjustSep1" /> 
                        </div>
                                            
                        <div className="Eventpanel-footer">
                            <button type="button" className="btn btn-primary vote-btn">Vote Now!</button>                                    
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



export default connect(mapStateToProps)(Polling);