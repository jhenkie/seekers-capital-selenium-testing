package website.definesteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import website.pages.RegisterPage;

public class RegisterSteps {
    RegisterPage test = new RegisterPage();

    @When("^I Click register button without fill in username$")
    public void i_Click_register_button_without_fill_in_username() {

    }

    @Then("^It will show error message username is required$")
    public void it_will_show_error_message_username_is_required() {
        test.emptyUsername();
    }

    @When("^I Click register button without fill in password$")
    public void i_Click_register_button_without_fill_in_password() {

    }

    @Then("^It will show error message password is required$")
    public void it_will_show_error_message_password_is_required() {
        test.emptyPassword();
    }

    @When("^I Click register button without fill in fullname$")
    public void i_Click_register_button_without_fill_in_fullname() {

    }

    @Then("^It will show error message fullname is required$")
    public void it_will_show_error_message_fullname_is_required() {
        test.emptyFullname();
    }

    @When("^I Click register button without fill in email$")
    public void i_Click_register_button_without_fill_in_email() {

    }

    @Then("^It will show error message email is required$")
    public void it_will_show_error_message_email_is_required() {
        test.emptyEmail();
    }

    @When("^I Click register button without fill in handphone$")
    public void i_Click_register_button_without_fill_in_handphone() {

    }

    @Then("^It will show error message handphone is required$")
    public void it_will_show_error_message_handphone_is_required() {
        test.emptyPhonenumber();
    }

    @When("^I Click register button without fill in birth date$")
    public void i_Click_register_button_without_fill_in_birth_date() {

    }

    @Then("^It will show error message enter valid date$")
    public void it_will_show_error_message_enter_valid_date() {
        test.emptyBirthDate();
    }

    @When("^I Click register button without select gender$")
    public void i_Click_register_button_without_select_gender() {

    }

    @Then("^It will show error message select gender$")
    public void it_will_show_error_message_select_gender() {
        test.emptyGender();
    }

    @When("^I fill in username less than three and more than sixteen characters$")
    public void i_fill_in_username_less_than_three_and_more_than_sixteen_characters() {

    }

    @Then("^It will show error message must be three - sixteen characters$")
    public void it_will_show_error_message_must_be_three_sixteen_characters() {
        test.minimimLengthUsername();
    }

    @When("^I fill in username with taken username$")
    public void i_fill_in_username_with_taken_username() {

    }

    @Then("^It will show error message username is taken$")
    public void it_will_show_error_message_username_is_taken() {
        test.takenUsername();
    }

    @When("^I fill in password less than four and more than ten characters$")
    public void i_fill_in_password_less_than_four_and_more_than_ten_characters() {

    }

    @Then("^It will show error message must be four - ten characters$")
    public void it_will_show_error_message_must_be_four_ten_characters() {
        test.minimimLengthPassword();
    }

    @When("^I fill in password same with the username$")
    public void i_fill_in_password_same_with_the_username() {

    }

    @Then("^It will show error message password is too simple$")
    public void it_will_show_error_message_password_is_too_simple() {
        test.simplePassword();
    }

    @When("^I fill in confirm password different with password$")
    public void i_fill_in_confirm_password_different_with_password() {

    }

    @Then("^It will show error message confirm password does not match$")
    public void it_will_show_error_message_confirm_password_does_not_match() {
        test.unmatchConfirmPassword();
    }

    @When("^I fill in fullname less than three and more than fifty characters$")
    public void i_fill_in_fullname_less_than_three_and_more_than_fifty_characters() {

    }

    @Then("^It will show error message provide fullname$")
    public void it_will_show_error_message_provide_fullname() {
        test.minimimLengthFullname();
    }

    @When("^I fill in email with wrong format$")
    public void i_fill_in_email_with_wrong_format() {

    }

    @Then("^It will show error message email not valid$")
    public void it_will_show_error_message_email_not_valid() {
        test.invalidEmail();
    }

    @When("^I fill in phonenumber with invalid number$")
    public void i_fill_in_phonenumber_with_invalid_number() {

    }

    @Then("^It will show error message number not valid$")
    public void it_will_show_error_message_number_not_valid() {
        test.invalidPhoneNumber();
    }

    @When("^I fill in all field correctly$")
    public void i_fill_in_all_field_correctly() {

    }

    @Then("^It will successfully register user$")
    public void it_will_successfully_register_user() {
        test.successRegister();
    }
}
