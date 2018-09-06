Feature: login
    As a user
    I want to login to Application
    So that i can access application

Scenario: Correct id and password
    Given a user with id nana and pin 1234 exists
    When I login to application with id nana and password 1234
    Then I can login

