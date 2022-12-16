Feature: Login
  Background:
    Given I Open PASTI
    When I fill in "m.dummy.b1" as username

#    @login.sukses @sanity
#    Scenario: Login Successfully
#    Then I Fill in {string} as password
#   And I click login button
#    And I should see "<textValidation>" text
#
#
#  Scenario: Login failed using invalid password
#    Then I fill in "Honda" as password
#    And I click login button
#    And I should see "Invalid username / password" text

  @login.sukses @sanity
  Scenario Outline: Login scenario
    Then I Fill in "<password>" as password
    And I click login button
    And I should see "<textValidation>" text
    Examples:
      | password   | textValidation              |
      | Honda2020! | Announcement                |
      | password   | Invalid username / password |
