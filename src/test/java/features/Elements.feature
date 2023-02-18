  Feature:Elements

    Scenario:Text Box

      Given user is on elements page
      And user click text box
      And user write full name
      And user write email
      And user write current address
      When user click submit
      Then user check information