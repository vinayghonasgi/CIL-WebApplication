import React from 'react'
 
export default class Jumbotron extends React.Component {
  
   render() {
    var jumboBg= { backgroundImage: 'url(./src/assets/images/CIL_BG.jpg)' };
        return (
        <div className="jumbotron bg adjustJumbo text-center">
            <div className="container-fluid padContainer" style={jumboBg} >
                <div className="row">
                  <div className="col-sm-12 header-content">
                       <h1>Co-Innovation lab</h1>
                       <p className="secTitle">A vision shared, is value multiplied</p>
                       <p className="thrTitle">
                        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
                       </p>
                  </div>
                </div>
              </div>
         </div>       
               
         );
   }
}