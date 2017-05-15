import React from 'react'

export default class Offerings extends React.Component {
   render() {
        return (
   <div id="offerings" className="container-fluid text-center">
         <h2 className="text-center">OFFERINGS</h2>
         <hr/>
         <div className="row slideanim ">
            <div className="col-sm-4">
               <span className="glyphicon glyphicon-globe logo-small"></span>
               <h4>INNOVATIONS</h4>
               <p>Lorem ipsum dolor sit amet..</p>
            </div>
            <div className="col-sm-4">
               <span className="glyphicon glyphicon-phone logo-small"></span>
               <h4>CONSULTING</h4>
               <p>Lorem ipsum dolor sit amet..</p>
            </div>
            <div className="col-sm-4">
               <span className="glyphicon glyphicon-lock logo-small"></span>
               <h4>PROJECTS</h4>
               <p>Lorem ipsum dolor sit amet..</p>
            </div>
         </div>
   </div>
      );
    }  
}