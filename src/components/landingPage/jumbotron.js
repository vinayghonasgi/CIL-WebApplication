import React from 'react'
 
export default class Jumbotron extends React.Component {
  
   render() {
    var jumboBg= { backgroundImage: 'url(./src/assets/images/CIL_BG.jpg)' };
        return (
        <div   id="myPage" className="jumbotron bg adjustJumbo text-center">
            <div className="container-fluid padContainer" style={jumboBg} >
                <div className="row">
                  <div className="col-sm-12 header-content">
                       <h1>{this.props.data.header_mainheading}</h1>
                       <p className="secTitle">{this.props.data.header_subheading}</p>
                       <p className="thrTitle">
                        {this.props.data.header_description}
                       </p>
                  </div>
                </div>
              </div>              
         </div>       
               
         );
   }
}