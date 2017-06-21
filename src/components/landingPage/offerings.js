import React from 'react'

export default class Offerings extends React.Component {
   render() {
        return (
   <div id="offerings" className="container-fluid landing-offering text-center">
         <h2 className="text-center">{this.props.data.service_mainheading}</h2>
         <hr/>
         <div className="row slideanim ">
            <div className="col-sm-4">
               <span className="fa fa-globe logo-small"></span>
               <h4>{this.props.data.service_offering[0].service_heading}</h4>
               <p>{this.props.data.service_offering[0].service_description}</p>
            </div>
            <div className="col-sm-4">
               <span className="fa  fa-mobile-phone logo-small"></span>
               <h4>{this.props.data.service_offering[1].service_heading}</h4>
               <p>{this.props.data.service_offering[1].service_description}</p>
            </div>
            <div className="col-sm-4">
               <span className="fa fa-lock logo-small"></span>
               <h4>{this.props.data.service_offering[2].service_heading}</h4>
               <p>{this.props.data.service_offering[2].service_description}</p>
            </div>
         </div>
   </div>
      );
    }  
}