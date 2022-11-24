Feature: Elements
  Scenario: Text Box

    Given user is on elements page
    When user click text box
    When user write full name
    When user write email
    When user write current address
    When user click submit
    Then user check informations