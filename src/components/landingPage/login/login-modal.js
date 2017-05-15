import React from 'react';
import Modal from 'react-bootstrap/lib/Modal';

export default class LoginModal extends React.Component {
    render () {
        return (
            <div className="modal fade hideLoginModal" tabIndex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div className="modal-dialog">
                        <div className="loginmodal-container">
                          {/*      Login Modal     */}
                            <Modal show={this.props.showModal} onHide={this.props.hideModal}>
                                
                                <div className="modal-header">
                                    <h1>Login To Yourff Account</h1>
                                    <br/>
                                </div>                         
                                
                                  
                                 
                            </Modal>
                        </div>
                    </div>
                </div>
        );
    }
}
