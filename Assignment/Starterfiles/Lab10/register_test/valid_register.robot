*** Settings ***
Resource    resource.robot

*** Test Cases ***
Open Event Registration Page
	Open Event Registration Page
    Event Registration Page Should Be Open
	[Teardown]    Close Browser
	
Register Success
    Open Event Registration Page
	Register Success    ${FIRSTNAME}    ${LASTNAME}    ${ORGANIZATION}    ${EMAIL}    ${PHONE}
	Submit Click
	Success Page Should Be Open
	[Teardown]    Close Browser
	
Register Success No Organization Info
	Open Event Registration Page
	Register Success    ${FIRSTNAME}    ${LASTNAME}    ${empty}    ${EMAIL}    ${PHONE}
	Submit Click
	Success Page Should Be Open
	[Teardown]    Close Browser