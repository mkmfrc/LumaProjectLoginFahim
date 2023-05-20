Feature: Valid Users Able To Login

@Functional
Scenario: User Able To Login with correct credentials

Given Navigate to url 'https://magento.softwaretestingboard.com/'
When User able to click on Sign In button
Then Verify Customer Login text are available on the screen
When Enter correct email address and password
And Click 'login' button
Then Verify that 'Welcome, <Full Name>' is visible