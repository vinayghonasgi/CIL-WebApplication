import React from 'react';
import { Link } from 'react-router';

export default class AboutSection extends React.Component {
   render() {
        return (
     <div id="about" className="container-fluid landing">
          <div className="row">
            <div className="col-sm-12">
               <h2 className="text-center">{this.props.data.about_mainheading}</h2>
               <hr/>
               <h4>{this.props.data.about_description}</h4>
                
                <ul className="feature-list list-unstyled">
                      <li> <h5 className="CIL-subHead">{this.props.data.about_subheading}</h5></li>
                      <li><img className="tick-icon" src="./src/assets/images/svg/tick.svg" alt=""></img>{this.props.data.about_info[0]}</li>
                      <li><img className="tick-icon" src="./src/assets/images/svg/tick.svg" alt=""></img>{this.props.data.about_info[1]}</li>
                      <li><img className="tick-icon" src="./src/assets/images/svg/tick.svg" alt=""></img>{this.props.data.about_info[2]}</li>
                      <li><img className="tick-icon" src="./src/assets/images/svg/tick.svg" alt=""></img>{this.props.data.about_info[3]}</li>
                      <li><img className="tick-icon" src="./src/assets/images/svg/tick.svg" alt=""></img>{this.props.data.about_info[4]}</li>
                      {/*<li><Link to="dashboard">Home</Link></li>*/}
                </ul>
            </div>
          </div>
      </div>
      );
   }
}     