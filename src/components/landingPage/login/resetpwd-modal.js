import React from 'react';
import Modal from 'react-bootstrap/lib/Modal';
import TextFieldGroup from '../../../common/textFieldGroup';
import validateInput from '../../../validations/reEnterPwd';

export default class ResetpwdModal extends React.Component {
	constructor (props) {
        super(props);
        this.state = {
        	password: "",
            confirmPassword: "",
            errors: {},
            showModal: false,
            resetPwdError: '' //state for login Modal
        }
        this.close = this.close.bind(this);
        this.open = this.open.bind(this);
        this.onChange = this.onChange.bind(this);
        this.submit = this.submit.bind(this);
    }
   
         close() {
            this.setState({ showModal: false }); // Hide login modal
            
        }
        open() {
        	this.props.hideModal();
            this.setState({ showModal: true }); //Show login modal
             
        }
        onChange(e) {
            this.setState({ [e.target.name]: e.target.value });
        }

        isValid() {
            const { errors, isValid } = validateInput(this.state);
             if (!isValid) {
             this.setState({ errors });
            }
        return isValid;
        }

        submit() {
            this.isValid();
                /*if (this.isValid()) {
                    this.setState({ errors: {}, isLoading: true });
                    this.props.changePassword({newpass: this.state.password, confirmpass: this.state.confirmPassword})
                        .then((res) => {
                            console.log("data here", res)
                            if(res.data.response.toLowerCase() === "true"){
                                this.setState({ userNameError : "" , username: '', secQuestions : res.data.questions});
                                this.openSecques()
                            }
                            else {
                                this.setState({ userNameError : "Invalid username" });
                            }
                        })
                }*/        
            }
	
    render () {
        const { errors } = this.state;    
        return (
    <div className="modal fade" id="reset-password-modal" tabIndex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
            <div className="loginmodal-container">
            <Modal show={this.props.showModal} onHide={this.props.hideModal}>
                   <div className="modal-header">
                       <h1>Reset Password</h1>
                      <br/>
                    </div>
                    <div className="modal-body">
                        <form>
                            {this.state.resetPwdError && <span className="help-block errorLogin">{this.state.resetPwdError}</span>}
                            <TextFieldGroup
                                error={errors.password}
                                label="Please enter new password"
                                onChange={this.onChange}
                                value={this.state.password}
                                field="password"
                            />
                            <TextFieldGroup
                                error={errors.confirmPassword}
                                label="Re-enter your new password"
                                onChange={this.onChange}
                                value={this.state.confirmPassword}
                                field="confirmPassword"
                            />                           
                           <input type="button" name="login" className="login loginmodal-submit" value="Reset Password" onClick={() => this.submit()}/>
                        </form>
                    </div>
                          
                </Modal> 
            </div>
            
    </div>
  );
    
   }
}

