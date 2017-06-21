import React from 'react'
import './landingPage.scss'
import Menu from './menu'
import Jumbotron from './jumbotron'
import AboutSection from './aboutSection'
import OurValues from './ourValues'
import Offerings from './offerings'
import SuccessStories from './successStories'
import StrategicPartner from './strategicPartner'
import ContactUs from './contactUs'
import Footer from './footer'
import { connect } from 'react-redux'
import  { bindActionCreators } from 'redux'
import { getLandingPage } from '../../actions'


class LandingPage extends React.Component {
    componentWillMount () {
        this.props.getLandingPage();
        
    }
    render() {
        if(!this.props.landingPage) {
            return (<div><h4>Loading Landing page....</h4></div>);
        }
        return (
            <div>              
                <Menu/> 
                <Jumbotron data={this.props.landingPage.landingPage.header}/>
                <AboutSection data={this.props.landingPage.landingPage.about} />
                <OurValues data={this.props.landingPage.landingPage.values} />
                <Offerings data={this.props.landingPage.landingPage.service} />
                <SuccessStories data={this.props.landingPage.landingPage.success} />
                <StrategicPartner data={this.props.landingPage.landingPage.strategic}/>
                <ContactUs data={this.props.landingPage.landingPage.contact}/>
                <Footer />
            </div>
        );
    }

    
}

function mapStateToProps(state) {
    return {        
        landingPage: state.landingPage
    };
}

function matchDispatchToProps(dispatch) {
    return bindActionCreators({getLandingPage: getLandingPage}, dispatch);
}

export default connect(mapStateToProps, matchDispatchToProps)(LandingPage);
