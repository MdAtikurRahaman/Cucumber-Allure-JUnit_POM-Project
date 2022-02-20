Feature: Login Verification Functionality

Scenario: Log as a Customers
Given I am in Landing Page
When I Click on Login
Then I will be in Login Page
And Click Customer Login
Then I enter User Id
And I enter Password
When I click Login Button
Then I will see Customer Home Page