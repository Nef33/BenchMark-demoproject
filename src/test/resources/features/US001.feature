
@ui

Feature: Career opportunities in different locations

  Agile story: As a user,
  I want to filter career opportunities
  So that I can see all possible careers in different locations


  Scenario: RSI Careers tabs
    Given user clicks on the career tab from homepage
    When user select  "Apply RSI Logistics" option
    Then user should see "RSI CAREERS APPLY AT RSI LOGISTICS" header on the page

@wip
    Scenario Outline:  User filters career opportunities by <location>

      Given user clicks on the career tab from homepage
      When user select  "Apply RSI Logistics" option
      When user applies the filter for "<location>"
      Then user should see a list  "<number>" of career opportunities in location
      Examples:
      |number|location|
      |2|Okemos, MI|
      | 2|Buffalo, NY|
      |1|Knoxville, TN|
