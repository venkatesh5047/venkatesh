Feature: Hotel Booking In Adactin Application
Scenario: user Login the web application
Given  user launch The Application
When  user Enter The Username In The Username Field
And  user Enter The Password In The Password Field
Then  user Click the login Button and it navigatesto the search hotel page 

When user Enter The location in location field
And user Enter The hotels in hotel field
And user Enter The Room Type in Room Type Field
And user Enter The Number of Rooms in the Number of Rooms Field
And user Enter The Check in date in check in date field
And user Enter The check out date in check out date field
And user Enter The adult per room in adult per room field
And user Enter The child per room in child per room field
Then user Click The Search Button and it navigates to the Select Hotel Page

When user Click the Radio Button in Select Option Button
Then user Click the continue Button and it navigates to the Book a Hotel Page

