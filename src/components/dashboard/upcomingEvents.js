import React  from 'react';

export default class UpComingEvents extends React.Component {
	    render() {    	
			console.log("Suman",this.props.eventData[0]);
			if(!this.props.eventData[0]) {
				return (<div><h4>Loading Events....</h4></div>);
			}
        	return (
				<div className="col-md-5">
                    <div className="panel panel-primary">
                        <div className="panel-heading">Upcoming Events</div>
                            <div className="panel-body" >
                               <div className="container width-100">
                                  
                                     <div className="width-100 col-xs-12 col-sm-offset- col-sm-9">
                                     <ul className="event-list">
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
				                              <div className="showme">
				                                   <div className="scrollit">
				                                <img className="img-responsive" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTORBGZbHdTCeWX2uObPa1u8zTO92PHsTi9_TI26ZbzvIzVKbsclQ" alt=""></img>
				                                <p>{user.event_name}</p>
				                                <p>{user.event_venue}</p>
				                                <p>{user.event_time}</p>
				                                <p>{user.event_date}</p>
				                                <p>{user.event_audience}</p>
				                                <p>{user.event_agenda}</p>
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


