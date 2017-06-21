import React from 'react'

export default class SuccessStories extends React.Component {
   render() {
        return (
<div id="success" className="container-fluid landing-success text-center bg-grey">
         <h2 className="text-center">{this.props.data.success_mainheading}</h2>
         <hr/>
         <h4>{this.props.data.success_subheading}</h4>
         <div className="row text-center slideanim">
            <div className="col-sm-4">
               <div className="thumbnail card">
                  <img src="./src/assets/images/bitcoin.jpg" alt="BitCoin" width="400" height="300"></img>
                  <h1 className="color-primary">{this.props.data.success_info[0].success_heading}</h1>
                  <p>{this.props.data.success_info[0].success_description}</p>
               </div>
            </div>
            <div className="col-sm-4">
               <div className="thumbnail card">
                  <img src="./src/assets/images/hyperledger2.jpg"  alt="Hyperledger" width="400" height="300"></img>
                  <h1 className="color-primary">{this.props.data.success_info[1].success_heading}</h1>
                  <p>{this.props.data.success_info[1].success_description}</p>
               </div>
            </div>
            <div className="col-sm-4">
               <div className="thumbnail card">
                  <img src="./src/assets/images/consensus.jpg" alt="Consensus" width="400" height="300"></img>
                  <h1 className="color-primary">{this.props.data.success_info[2].success_heading}</h1>
                  <p>{this.props.data.success_info[2].success_heading}</p>
               </div>
            </div>
         </div>
      </div>
     );
   }  
}