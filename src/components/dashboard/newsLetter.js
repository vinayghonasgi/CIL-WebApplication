

import React, { Component } from 'react'

 


export default class NewsLetter extends Component {
    open () {
        window.open('/pdf/myPdf.pdf', '_blank', 'fullscreen=yes'); return false;
    }
    render() {        
        return (
            
            <a href="#" onClick={this.open}>MyPDF</a>
            
        );
    }

    
}