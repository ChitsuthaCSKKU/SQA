*** Settings ***
Documentation    To validate the Login Form
Library     SeleniumLibrary

*** Test Cases ***
Validate Unsuccessful Login
    Open the Browser with URL
    Fill the login form
    Verify error message is correct

*** Keywords ***
Open the Browser with URL
    Create Webdriver    Firefox
    Go To    https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    Maximize Browser Window
    Set Selenium Implicit Wait    5

Fill the login form
   Input Text    css:input[name=username]   Admin
   Input Password    css:input[name=password]   Admin
   Click Button    css:.orangehrm-login-button


Verify error message is correct
    ${result}=  Get Text    CSS:.oxd-alert-content-text
    Should Be Equal As Strings   ${result}  Invalid credentials