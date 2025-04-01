Feature: Register Animal Service

  @validateRegService
  Scenario: Verify Register Animal Service Page with Valid Data
    Given I navigate to homepage of Register Animal Service Page
    When I answer all the quesionare for Regsistering the animal
    And I click on Let us walk you through the process page
    And I enter the details required
    And I click next on We are Ready To Register Your Service Dog!
    And I enter all the details related to animals



