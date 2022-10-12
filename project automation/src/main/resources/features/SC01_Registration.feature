@register
Feature: Registration | The user can create a new account.

Scenario: A user could create a new account with valid information.
Given that the user has a valid email address and that the user navigates to the home page
When a user clicks the Register link in the upper right corner, he or she must select the gender "female," enter the first name "Mariam," and the last name "Mahran."
And the user enters his or her birth date "29/10/2000"
And the user enters his or her email address.
And then the user enters his or her company .
And the user check right for the Newsletter option.
And the user fills in the password and confirm password fields .
And the user clicks the register button.
The user should then see the message "Your registration was successful"
And the user s should be able to log out after successfully logging in.
