import React  from 'react';

export default class UpComingEvents extends React.Component {
	    render() {    	
			console.log("Suman",this.props.eventData[0]);
			if(!this.props.eventData[0]) {
				return (<div><h4>Loading Events....</h4></div>);
			}
        	return (
				<div className="col-md-4">
                    <div className="panel dashboard-panel panel-primary">
                        <div className="panel-heading dashboard">Upcoming Events</div>
                            <div className="panel-body event-panel" >
                               <div className="container width-100">
                                  
                                    <div className="width-100 col-xs-12 col-sm-offset- col-sm-9">
                                        <ul className="event-list ">
	                                        {
	                                         	this.props.eventData.map(function(user, i){
										       	return <li key={i} className="width-100">
													   		<time dateTime="2014-07-20">
						                                		<span id= "day" className="day">{user.event_date.split(" ")[0]}</span>
						                                		<span id="month" className="month">{user.event_date.split(" ")[1]}  {user.event_date.split(" ")[2]}</span>
						                                		<span className="time">ALL DAY</span>
					                              			</time>
					                            			<div className="showhim">
						                               			<a>{user.event_name}</a>
						                                		<div className="showme row">
						                                   			<div className="col-lg-6 pad-10 pad-b-10">
						                                      			<img className="img-responsive" src={`./src/assets/images/${user.event_name}.jpg`} alt=""></img>
															  			{/*<img className="img-responsive" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTORBGZbHdTCeWX2uObPa1u8zTO92PHsTi9_TI26ZbzvIzVKbsclQ" alt=""></img>*/}
																	</div>
								                            		<div className="col-lg-6 pad-10 font-14 scrollit cilFont14">  
										                               <div><label className="eventLabel">Name:</label> <p className="adjEvent">{user.event_name}</p></div>
										                                <div><label className="eventLabel">Venue:</label> <p className="adjEvent">{user.event_venue}</p></div>
										                                <div><label className="eventLabel">Time:</label> <p className="adjEvent">{user.event_time}</p></div>
										                                <div><label className="eventLabel">Date:</label> <p className="adjEvent">{user.event_date}</p></div>
										                                <div><label className="eventLabel">Target Audience:</label><p className="adjEvent">{user.event_audience}</p></div>
										                                <div><label className="eventLabel">Description:</label><p className="adjEvent">{user.event_agenda}</p></div>
																	</div>
										                        </div>
					                                    	</div>
					                                	</li>
										       	})
										    }  
                                        </ul>
                                    </div>
                               </div>
                            </div>    
                        </div>
                    </div>
        
        );
    }
 }


