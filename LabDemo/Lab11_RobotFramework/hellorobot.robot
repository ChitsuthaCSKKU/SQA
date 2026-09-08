*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${HEADLESS}    False
${URL}    http://www.google.com
${BROWSER}     chrome

*** Test Cases ***
Go To homepage
    ${options}=    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys, selenium.webdriver
    Run Keyword If    '${HEADLESS}' == 'True'
    ...    Call Method    ${options}    add_argument    --headless=new
    Open Browser    ${URL}    ${BROWSER}    options=${options}
    Maximize Browser Window
    Set Selenium Speed    0.2s
