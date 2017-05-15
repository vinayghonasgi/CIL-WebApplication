import React, { Component } from 'react';
import { Field, reduxForm, SubmissionError } from 'redux-form';

const renderField = ({type, label, input, field, meta : {touched, error}}) => (
    <div className="input-row">
      <label>{label}</label>
      <input {...input} type={type} />
      {touched && error && 
       <span className="error">{error}</span>}
    </div>
  )
    const submit = ({firstName='', lastName='', email=''}) => {
      let error = {};
      let isError = false;

      if(firstName.trim() === '') {
        error.firstName = "requierd"
        isError = true;
      }
      if(firstName.length > 20) {
        error.firstName = "too long"
        isError = true;
      }
      if(lastName.trim() === '') {
        error.lastName = "requierd"
        isError = true;
      }
      if(email.trim() === '') {
        error.email = "requierd"
        isError = true;
      }

      if(isError) {
        throw new SubmissionError(error);
      } else {
        //submit the from
        console.log("valid submission");
      }

    }
    const ContactFormFunc = ({handleSubmit})=> (
      <form onSubmit={handleSubmit(submit)}>
        <div>
          
          <Field name="firstName" label="First Name" component={renderField} type="text" required/>
        </div>
        <div>
          
          <Field name="lastName" label="Last Name" component={renderField}  type="text"/>
        </div>
        <div>
          
          <Field name="email" label="Email" component={renderField}  type="email"/>
        </div>
        <button type="submit">Submit</button>
      </form>
    );
  


// Decorate the form component
const ContactForm = reduxForm({
  form: 'contact' // a unique name for this form
})(ContactFormFunc);

export default ContactForm;
