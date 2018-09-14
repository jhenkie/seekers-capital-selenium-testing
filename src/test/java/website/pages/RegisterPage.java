package website.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import website.constants.AssertionConstants;
import website.constants.MessageConstants;

import java.util.Random;

import static java.lang.Thread.sleep;


public class RegisterPage extends SetupPage {
    static Random r = new Random();
    String result = new String();

    public void goToURL() {
        driver.get(AssertionConstants.Register.URL);
    }

    public String generateRandomString(){
        String alphabet = new String(MessageConstants.Register.randomString);
        int n = alphabet.length();

        for (int i=0; i<6; i++)
            result = result + alphabet.charAt(r.nextInt(n));

        return result;
    }

    @Test
    public void emptyUsername() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.usernameError,driver.findElement(By.xpath(AssertionConstants.Register.usernameErrorElement)));
    }

    @Test
    public void emptyPassword() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.passwordError,driver.findElement(By.xpath(AssertionConstants.Register.passwordErrorElement)));
    }

    @Test
    public void emptyFullname() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.fullnameError,driver.findElement(By.xpath(AssertionConstants.Register.fullnameErrorElement)));
    }

    @Test
    public void emptyEmail() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.emailError,driver.findElement(By.xpath(AssertionConstants.Register.emailErrorElement)));
    }

    @Test
    public void emptyPhonenumber() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.phoneNumberError,driver.findElement(By.xpath(AssertionConstants.Register.phoneNumberErrorElement)));
    }

    @Test
    public void emptyBirthDate() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.birthDateError,driver.findElement(By.xpath(AssertionConstants.Register.birthDateErrorElement)));
    }

    @Test
    public void emptyGender() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.genderError,driver.findElement(By.xpath(AssertionConstants.Register.genderErrorElement)));
    }

    @Test
    public void minimimLengthUsername() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.usernameInput)).sendKeys(MessageConstants.Register.minLengthText);
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.usernameLengthError,driver.findElement(By.xpath(AssertionConstants.Register.usernameErrorElement)));
    }

    @Test
    public void takenUsername() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.usernameInput)).sendKeys(MessageConstants.Register.takenUsername);
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.usernameTakenError,driver.findElement(By.xpath(AssertionConstants.Register.usernameErrorElement)));
    }

    @Test
    public void minimimLengthPassword() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.passwordInput)).sendKeys(MessageConstants.Register.minLengthText);
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.passwordLengthError,driver.findElement(By.xpath(AssertionConstants.Register.passwordErrorElement)));
    }

    @Test
    public void simplePassword() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.usernameInput)).sendKeys(MessageConstants.Register.Username);
        driver.findElement(By.id(AssertionConstants.Register.passwordInput)).sendKeys(MessageConstants.Register.Username);
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.passwordSimpleError,driver.findElement(By.xpath(AssertionConstants.Register.passwordErrorElement)));
    }

    @Test
    public void unmatchConfirmPassword() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.passwordInput)).sendKeys(MessageConstants.Register.Password);
        driver.findElement(By.id(AssertionConstants.Register.confirmPasswordInput)).sendKeys(MessageConstants.Register.invalidPassoword);
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.confirmationPasswordError,driver.findElement(By.xpath(AssertionConstants.Register.confirmPasswordErrorElement)));
    }

    @Test
    public void minimimLengthFullname() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.fullnameInput)).sendKeys(MessageConstants.Register.minLengthText);
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.fullnameLengthError,driver.findElement(By.xpath(AssertionConstants.Register.fullnameErrorElement)));
    }

    @Test
    public void invalidEmail() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.emailInput)).sendKeys(MessageConstants.Register.minLengthText);
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.emailInvalidError,driver.findElement(By.xpath(AssertionConstants.Register.emailErrorElement)));
    }

    @Test
    public void invalidPhoneNumber() {
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.phoneNumberInput)).sendKeys(MessageConstants.Register.minLengthText);
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.phoneNumberInvalidError,driver.findElement(By.xpath(AssertionConstants.Register.phoneNumberErrorElement)));
    }

    @Test
    public void successRegister() {
        generateRandomString();
        goToURL();
        driver.findElement(By.id(AssertionConstants.Register.usernameInput)).sendKeys(result);
        driver.findElement(By.id(AssertionConstants.Register.passwordInput)).sendKeys(MessageConstants.Register.Password);
        driver.findElement(By.id(AssertionConstants.Register.confirmPasswordInput)).sendKeys(MessageConstants.Register.Password);
        driver.findElement(By.id(AssertionConstants.Register.fullnameInput)).sendKeys(MessageConstants.Register.Fullname);
        driver.findElement(By.id(AssertionConstants.Register.emailInput)).sendKeys(MessageConstants.Register.Email);
        driver.findElement(By.id(AssertionConstants.Register.phoneNumberInput)).sendKeys(MessageConstants.Register.phoneNumber);
        driver.findElement(By.xpath(AssertionConstants.Register.monthButton)).click();
        driver.findElement(By.xpath(AssertionConstants.Register.selectMonth)).click();
        driver.findElement(By.xpath(AssertionConstants.Register.dayButton)).click();
        driver.findElement(By.xpath(AssertionConstants.Register.selectDay)).click();
        driver.findElement(By.xpath(AssertionConstants.Register.yearButton)).click();
        driver.findElement(By.xpath(AssertionConstants.Register.selectYear)).click();
        driver.findElement(By.id(AssertionConstants.Register.genderRadio)).click();
        driver.findElement(By.id(AssertionConstants.Register.registerButton)).click();
        verifyElement(MessageConstants.Register.verifySuccessRegisterText,driver.findElement(By.xpath(AssertionConstants.Register.verifySuccessRegisterElement)));
    }

}
