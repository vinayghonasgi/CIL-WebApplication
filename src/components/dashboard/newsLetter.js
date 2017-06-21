import React, { Component } from 'react'


export default class NewsLetter extends Component {
    open () {
        window.open('/pdf/Newsletter_feb.pdf', '_blank', 'fullscreen=yes'); return false;
    }
    render() {        
        return (            
            <a href="#" onClick={this.open} className="cilFont14"><img src="./src/assets/images/image2.jpg" alt="BitCoin" width="40" height="38"></img>Newsletter: February 2017</a>            
        );
    }

    
}