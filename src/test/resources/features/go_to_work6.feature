Feature: During the week every person should go to work, but should not go on Saturday.

  Background:
    Given There is a person named Ashish

  Scenario: It is Saturday morning
    And it is weekend
    When the alarm rings
    Then the person should not get up and go to work