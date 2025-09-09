*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${SERVER}    localhost:7272
${BROWSER}    Chrome
${DELAY}    0 
${FIRSTNAME}    Somsri    
${LASTNAME}    Sodsai
${ORGANIZATION}    CS KKU
${EMAIL}    somsri@kkumail.com
${PHONE}    081-001-1234
${REG URL}    http://${SERVER}/Lab10/Registration.html
${SUCCESS}    http://${SERVER}/Lab10/Success.html
${ERROR URL}    http://${SERVER}/Lab10/Registration.html

*** Keywords ***
Open Event Registration Page
    Open Browser    ${REG URL}    ${BROWSER}
	Maximize Browser Window
	Set Selenium Speed    ${DELAY}
	Event Registration Page Should Be Open

Event Registration Page Should Be Open
    Title Should Be    Event Registration

Register Success
    [Arguments]    ${FIRSTNAME}    ${LASTNAME}    ${ORGANIZATION}    ${EMAIL}    ${PHONE}
    Input Text    firstname    ${FIRSTNAME}
    Input Text    lastname    ${LASTNAME}
    Input Text    organization    ${ORGANIZATION}
    Input Text    email    ${EMAIL}
    Input Text    phone    ${PHONE}

Submit Click
    Click Button    registerButton

Success Page Should Be Open
    Location Should Contain    ${SUCCESS}
    Title Should Be    Success