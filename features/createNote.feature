Feature: Notes | Validate Notes app

  Scenario: Notes | New Note | Check layout
    Given I open Notes app
    When I click on plus button to add a new note
    Then New Note screen is open

  Scenario: Notes | New Note | Insert new note
    Given I open Notes app
    And I click on plus button to add a new note
    When Enter "Cocus Automation Test" as note title
    And Enter "Testing Cocus app using Appium + Java" as note description
    And Click on Confirm button
    Then The note is added