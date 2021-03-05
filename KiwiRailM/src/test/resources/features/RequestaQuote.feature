Feature: Request A Quote

Background:
Given I am in Homepage
When I click on the Rail Freight
Then I should see the new tab open
And I should see the freight login page

Scenario: Click on the Request a Quote button

When I click on Request a Quote
Then I should able to enter all the fields
Then I should click on Next button
Then I should verify all the fields

