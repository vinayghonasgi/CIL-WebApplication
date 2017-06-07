import React from 'react';
import { Link } from 'react-router';

export default class AboutSection extends React.Component {
   render() {
        return (
     <div id="about" className="container-fluid landing">
          <div className="row">
            <div className="col-sm-12">
               <h2 className="text-center">ABOUT CO-INNOVATION LAB</h2>
               <hr/>
               <h4>The Co-Innovation Lab format provides a standalone entrepreneurial environment where business stakeholders and end-users are able to directly engage with the product design team</h4>
                
                <ul className="feature-list list-unstyled">
                      <li> <h5 className="CIL-subHead">KEY ADVANTAGES</h5></li>
                      <li><img className="tick-icon" src="./src/assets/images/svg/tick.svg" alt=""></img>Capability to work closely, collaboratively and directly with business stakeholders on new products and service ideas.</li>
                      <li><img className="tick-icon" src="./src/assets/images/svg/tick.svg" alt=""></img>Rapid creation of prototypes, enabling business stakeholders to touch and feel their ideas.</li>
                      <li><img className="tick-icon" src="./src/assets/images/svg/tick.svg" alt=""></img>Quick sharing of concepts with clients to arrive at winning ideas.</li>
                      <li><img className="tick-icon" src="./src/assets/images/svg/tick.svg" alt=""></img>Within walking distance of stakeholders and end-users.</li>
                      <li><img className="tick-icon" src="./src/assets/images/svg/tick.svg" alt=""></img>Reduces the time from business idea to business value.</li>
                      {/*<li><Link to="dashboard">Home</Link></li>*/}
                </ul>
            </div>
          </div>
      </div>
      );
   }
}     