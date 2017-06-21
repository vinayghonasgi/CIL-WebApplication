import React from 'react';
import Modal from 'react-bootstrap/lib/Modal';




export default class PwdResetSuccess extends React.Component {
	constructor (props) {
        super(props);
        this.state = {
        	password: "",
            confirmPassword: "",
            errors: {},
            showModal: false,
            resetPwdError: '' //state for login Modal
        }
        
    }
   
         
	
    render () {
        const { errors } = this.state;    
        return (
    <div className="modal fade" id="reset-password-modal" tabIndex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
            <div className="loginmodal-container">
            <Modal show={this.props.showModal} onHide={this.props.hideModal}>
                   <div className="modal-header">
                       <h1>Reset Password Successfull</h1>
                      <br/>
                    </div>
                    <div className="modal-body">
                        Your Password has been changed succesfully.
                    </div>
                    <div className="modal-footer">
                        <input type="button" name="Ok" className="login loginmodal-submit" value="Ok" onClick={this.props.hideModal}/>   
                    </div>
                       
                </Modal> 
            </div>
            
    </div>
  );
    
   }
}

