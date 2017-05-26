import React from 'react'
import Menu from './menu'
import Jumbotron from './jumbotron'
import AboutSection from './aboutSection'
import OurValues from './ourValues'
import Offerings from './offerings'
import SuccessStories from './successStories'
import StrategicPartner from './strategicPartner'
import ContactUs from './contactUs'
import Footer from './footer'

export default class Greetings extends React.Component {

    render() {
        return (
            <div> 
               <nav className="navbar navbar-inverse">
  <div className="container-fluid">
    <div className="navbar-header">
      <a className="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul className="nav navbar-nav">
      <li className="active"><a href="#">Home</a></li>
      <li className="dropdown"><a className="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span className="caret"></span></a>
        <ul className="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
  </div>
</nav>
  
<div className="container">
  <div className="row space-top">
        <div className="col-md-4">
            <div className="panel panel-primary">
              <div className="panel-heading">Panel Heading</div>
              <div className="panel-body">Panel 1Content</div>
            </div>
        </div>
        <div className="col-md-8">
              <div className="panel panel-primary">
                <div className="panel-heading">Panel Heading</div>
                <div className="panel-body">Panel 2Content</div>
            </div>
        </div>
    </div>
    <div className="row space-top">
      <div className="col-md-9">
        <div className="panel panel-primary">
                <div className="panel-heading">Panel Heading</div>
                <div className="panel-body">Panel 2Content</div>
            </div>
      </div>
      <div className="col-md-3">
        <div className="panel panel-primary">
                <div className="panel-heading">Panel Heading</div>
                <div className="panel-body">Panel 2Content</div>
            </div>
      </div>
    </div>
</div>


               {/* <Menu /> 
                <Jumbotron />
                <AboutSection />
                <OurValues />
                <Offerings />
                <SuccessStories />
                <StrategicPartner />
                <ContactUs />
                <Footer />*/}
                
            </div>
        );
    }

    
}
