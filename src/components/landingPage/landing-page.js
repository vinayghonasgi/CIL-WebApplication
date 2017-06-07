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

export default class Greetings extends React.Component {

    render() {
        return (
            <div>              
                <Menu /> 
                <Jumbotron />
                <AboutSection />
                <OurValues />
                <Offerings />
                <SuccessStories />
                <StrategicPartner />
                <ContactUs />
                <Footer />
            </div>
        );
    }

    
}
