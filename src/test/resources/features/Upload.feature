Feature: Upload
  Background:
    Given I Open Upload Page

  @upload.sukses @sanity
  Scenario Outline: Login scenario
    Then I Click Browse
    And I Click Upload
    And I Should See File
