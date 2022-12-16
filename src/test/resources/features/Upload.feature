Feature: Upload
  Background:
    Given I Open Upload Page

  @upload.sukses @sanity
  Scenario Outline: Login scenario
    Then I Click Browse
    And I Click Upload
    And I should see "<textValidation>" text
    Examples:
      | password   | textValidation              |
      | Honda2020! | Announcement                |
      | password   | Invalid username / password |