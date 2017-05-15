import React from 'react'

export default class OurValues extends React.Component {
   render() {
        return (
   <div className="valuescontainer-fluid bg-grey text-center">
         <div className="row">
			   <h2>OUR VALUES</h2>
			       <hr/>
               <div className="col-sm-12">
                  <div className="row our-values">
                     <div className="col-sm-4">
                        <a href="#ourCourses" className="sectionLink bg-color-1" id="coursesLink">
                           <i className="fa fa-file-text-o linkIcon border-color-1" aria-hidden="true"></i>
                           <span className="linkText">Placing customer at the centre of the design process ensures the creation of products that service real world end users needs. This serves to enhance both strategy and design so that they accurately fulfill the user experience.</span>
                           
                        </a>
                     </div>
                     <div className="col-sm-4">
                        <a href="#ourTeam" className="sectionLink bg-color-2" id="teamLink">
                           <i className="fa fa-calendar-o linkIcon border-color-2" aria-hidden="true"></i>
                           <span className="linkText">Creating innovative design requires the collective knowledge of stakeholders,end users and a multi-disciplinary design team. A truly collaborative team enables the rapid development and validations of ideas-shortening the time to market.</span>
                           
                        </a>
                     </div>
                     <div className="col-sm-4">
                        <a href="#ourGallery" className="sectionLink bg-color-3" id="galleryLink">
                           <i className="fa fa-picture-o linkIcon border-color-3" aria-hidden="true"></i>
                           <span className="linkText">Focused highly skilled multi disciplinary desgin teams underpin an effective collaborative design methodology. Placing the appropriate design skills together allows the full depth of the team's knowledge to be leveraged better.</span>
                           
                        </a>
                     </div>
                  </div>
               </div>
            </div>
         </div>
       );
    }  
}
