Feature: On Monday every person should go to work, but should not go in the weekends.

  Background:
    Given There is a person named Ashish

    @ignore
  Scenario: It is Monday morning
    And it is weekend
    When the alarm rings
    Then the person should get up and go to work