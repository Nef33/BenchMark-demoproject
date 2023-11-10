
@ui

Feature: Career opportunities in BenchMarkAnalytics

  Agile story: As a user,
  I want to check career opportunities
  So that I can see all available careers in BenchMarkAnalytics company


  Scenario Outline: Available QA Engineer positions in BenchMarkAnalytics
    Given user clicks on About Us tab
    When user selects  "Careers" tab
    Then user should see 7 different career opportunities as "<Current Opportunities>" on the page

    Examples:
    |Current Opportunities|
    |QA Engineer|
    |SQL Developer|
    |Senior Product Owner|
    |Product Owner|
    |Controller|
    |Operations Coordinator|
    |Enterprise Implementation Lead|



