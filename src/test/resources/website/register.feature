@RegisterTest
Feature: Validate functionality at register page

  Scenario: Username should be filled
    When I Click register button without fill in username
    Then It will show error message username is required

  Scenario: Password should be filled
    When I Click register button without fill in password
    Then It will show error message password is required

  Scenario: Fullname should be filled
    When I Click register button without fill in fullname
    Then It will show error message fullname is required

  Scenario: Email should be filled
    When I Click register button without fill in email
    Then It will show error message email is required

  Scenario: Handphone should be filled
    When I Click register button without fill in handphone
    Then It will show error message handphone is required

  Scenario: Birth date should be filled
    When I Click register button without fill in birth date
    Then It will show error message enter valid date

  Scenario: Gender should be selected
    When I Click register button without select gender
    Then It will show error message select gender

  Scenario: Username length should be valid
    When I fill in username less than three and more than sixteen characters
    Then It will show error message must be three - sixteen characters

  Scenario: Username should be unique
    When I fill in username with taken username
    Then It will show error message username is taken

  Scenario: Password length should be valid
    When I fill in password less than four and more than ten characters
    Then It will show error message must be four - ten characters

  Scenario: Password should be not simple
    When I fill in password same with the username
    Then It will show error message password is too simple

  Scenario: Confirm password should match password
    When I fill in confirm password different with password
    Then It will show error message confirm password does not match

  Scenario: Fullname length should be valid
    When I fill in fullname less than three and more than fifty characters
    Then It will show error message provide fullname

  Scenario: Email should be valid
    When I fill in email with wrong format
    Then It will show error message email not valid

  Scenario: Handphone should be valid
    When I fill in phonenumber with invalid number
    Then It will show error message number not valid

  Scenario: Success register user
    When I fill in all field correctly
    Then It will successfully register user

