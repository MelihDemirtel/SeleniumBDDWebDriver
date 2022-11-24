Feature: Elements

  Scenario: Click Elements

    Given user is on home page
    When user click elements
    Then user check page

  Scenario: Text Box

    Given user is on elements page
    When user click text box
    When user write full name
    When user write email
    When user write current address
    When user click submit
    Then user check informations