*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${HOMEPAGE}    http://www.google.com
${BROWSER}     Firefox

*** Test Cases ***
Go To homepage
    Open Browser     ${HOMEPAGE}    ${BROWSER}
