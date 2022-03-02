Feature: Hotel Booking In Adactin Application

@SmokeTest
Scenario: user Login the web application
Given user launch The Application
When  user Enter The <"Username"> In The Username Field
And   user Enter The <"Password"> In The Password Field
Then   user Click the login Button and it navigatesto the search hotel page

Examples:
           |Username|Password|
           |AAA|123|
           |BBB|789|
           |venkatesh5047|504413|
           


@SanityTest
Scenario: user Login the Search Page
When user Enter The location in location field
And user Enter The hotels in hotel field
And user Enter The Room Type in Room Type Field
And user Enter The Number of Rooms in the Number of Rooms Field
And user Enter The Check in date in check in date field
And user Enter The check out date in check out date field
And user Enter The adult per room in adult per room field
And user Enter The child per room in child per room field
Then user Click The Search Button and it navigates to the Select Hotel Page


@SanityTest
Scenario: user Login the continue Page
When user Click the Radio Button in Select Option Button
Then user Click the continue Button and it navigates to the Book a Hotel Page

@SanityTest
Scenario: user Login the select Page
When user Enter the First name in the First name field
And user Enter the last name in the last name field
And use Enter the Billing address in the field
And user Enter the credit card number in the field
And user Select the Credit card type in the field
And user Select the expiry Month in the field
And user Select the expiry Date in the field
And user Enter the cvv number in the field
Then user Click the book now button and it navigates to the booking confirmation page

@RegressionTest
Scenario: user login the final page
When user confirms the details of the hotels information
Then user Click the My  Itinerary and it navigates to the booked Itinarary page  





