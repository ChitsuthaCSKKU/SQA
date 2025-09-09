*** Settings ***
Suite Setup       Open Event Registration Page
Suite Teardown    Close Browser
Resource          resource.robot

*** Test Cases ***   
Open Event Registration Page
	Open Event Registration Page
    Event Registration Page Should Be Open
	
Empty First Name
	[Template]    Registration Should Fail With Invalid Data
    ${EMPTY}    	${LASTNAME}    	${ORGANIZATION}    ${EMAIL}    ${PHONE}    	Please enter your first name!!

Empty Last Name                        
	[Template]    Registration Should Fail With Invalid Data
	${FIRSTNAME}    ${EMPTY}    	${ORGANIZATION}    ${EMAIL}    ${PHONE}    	Please enter your last name!!

Empty First Name & Last Name           
	[Template]    Registration Should Fail With Invalid Data
	${EMPTY}    	${EMPTY}    	${ORGANIZATION}    ${EMAIL}    ${PHONE}    	Please enter your name!!

Empty Email                            
	[Template]    Registration Should Fail With Invalid Data
	${FIRSTNAME}    ${LASTNAME}    	${ORGANIZATION}    ${EMPTY}    ${PHONE}    	Please enter your email!!

Empty Phone Number                     
	[Template]    Registration Should Fail With Invalid Data
	${FIRSTNAME}    ${LASTNAME}    	${ORGANIZATION}    ${EMAIL}    ${EMPTY}    	Please enter your phone number!!

Invalid Phone Number                   
	[Template]    Registration Should Fail With Invalid Data
	${FIRSTNAME}  	${LASTNAME}    	${ORGANIZATION}    ${EMAIL}    1234    		Please enter a valid phone number, e.g., 081-234-5678, 081 234 5678, or 081.234.5678
	
*** Keywords ***
Registration Should Fail With Invalid Data
    [Arguments]    ${firstname}    ${lastname}    ${org}    ${email}    ${phone}    ${expected}
    Register Success    ${firstname}    ${lastname}    ${org}    ${email}    ${phone}
    Submit Click
    Location Should Be    ${ERROR URL}
    Element Text Should Be    errors    ${expected}
