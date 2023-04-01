# sk_auto_project
## Test automation framework with Java Maven

Target of test suit: http://training.skillo-bg.com:4200/posts/all

This project is part of the Skillo training program:

![alt text](https://www.skillo-bg.com/images/logo/logo.png)

Used technologies in the project:

- TestNG
- Selenium WebDriver

## Short description

Target of test suit is the training platform of Skillo: http://training.skillo-bg.com:4200/posts/all. Project is following the Page Object Model design pattern and PageFactory. In case of test failure, a screenshot of the failure step will be taken automatically. Screenshots are stored in "screenshots" directory of the project.

## Clone repository

```bash
$ git clone https://github.com/VladNachev/sk_auto_project.git
```
## testng.xml
All test classes are added in a test suite to the testng.xml file (/src/tests/testng.xml). All test cases can be executed in bulk by running the testng.xml file. 

## Test Cases in the suite

- LoginTest - Testing the login functionality (happy-path). Both scenarios: login with UserName and login with e-mail are included.
- InvalidUserTest - Attempt go login with invalid UserName
- InvalidPasswordTest - Attempt to login with invalid password
- RegistrationTest - Test User Registration. **Note:** Corresponding function generates unique credentials each time so the test can be re-used multiple times.
- LikeDislikeTest - Test Like/Dislike post functionality
- LogoutTest - Testing the logout functionality
- ModifyProfileTest - Testing the profile "add new info" functionality. As a result, the profile info should be updated with success. **Note:** Before updating the info, test will clear the previous info text in order to validate the new info is added correctly.
- MyFollowersTest - Testing the "view my followers" functionality. As a result, the Followers pop-up window in Profile page should open and list all the followers.
- UserPrivatePostsTest - Functionality test for viewing all private post of the user.