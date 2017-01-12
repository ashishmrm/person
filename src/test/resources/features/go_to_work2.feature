Feature: On Tuesday every person should go to work, but should not go in the weekends.

  Background:
    Given There is a person named Ashish

  Scenario: It is Tuesday morning
    And it is not weekend
    When the alarm rings
    Then the person should get up and go to work