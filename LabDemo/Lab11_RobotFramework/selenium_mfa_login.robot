*** Settings ***
Library    SeleniumLibrary
Library    ${CURDIR}/totp.py

*** Variables ***
${BROWSER}    chrome
${HEADLESS}    False

*** Keywords ***
Setup Browser Options
    ${options}=    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys, selenium.webdriver
    Run Keyword If    '${HEADLESS}' == 'True'    Call Method    ${options}    add_argument    --headless=new
    RETURN    ${options}

*** Test Cases ***
Login with MFA
    ${options}=    Setup Browser Options
    Open Browser    https://seleniumbase.io/realworld/login    ${BROWSER}    options=${options}
    Input Text    id=username    demo_user
    Input Text    id=password    secret_pass
    ${totp}=    Get Totp    GAXG2MTEOR3DMMDG
    Input Text    id=totpcode    ${totp}
    Wait Until Element Is Visible    id=log-in    timeout=10s
    Click Link    id=log-in
    Wait Until Element Is Visible    tag=h1    timeout=10s
    Element Text Should Be    tag=h1    Welcome!
    [Teardown]    Close Browser