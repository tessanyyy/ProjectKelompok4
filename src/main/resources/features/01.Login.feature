Feature: Login page

  Scenario: User login valid
    When user open page siloam
    And user input username password sales valid
    And user click button login
    Then user open home page
