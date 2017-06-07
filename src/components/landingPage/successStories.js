import React from 'react'

export default class SuccessStories extends React.Component {
   render() {
        return (
<div id="success" className="container-fluid landing text-center bg-grey">
         <h2 className="text-center">SUCCESS STORIES</h2>
         <hr/>
         <h4>What we have created</h4>
         <div className="row text-center slideanim">
            <div className="col-sm-4">
               <div className="thumbnail card">
                  <img src="./src/assets/images/bitcoin.jpg" alt="BitCoin" width="400" height="300"></img>
                  <h1 className="color-primary">BitCoins</h1>
                  <p>Securing your business to trust digital trust.</p>
               </div>
            </div>
            <div className="col-sm-4">
               <div className="thumbnail card">
                  <img src="./src/assets/images/hyperledger.jpg"  alt="Hyperledger" width="400" height="300"></img>
                  <h1 className="color-primary">Hyperledger</h1>
                  <p>Distributed ledger for financial institutions.</p>
               </div>
            </div>
            <div className="col-sm-4">
               <div className="thumbnail card">
                  <img src="./src/assets/images/consensus.jpg" alt="Consensus" width="400" height="300"></img>
                  <h1 className="color-primary">Consensus mechanism</h1>
                  <p>Communication Collaboration Consensus.</p>
               </div>
            </div>
         </div>
      </div>
     );
   }  
}