@Test @DemoQA
Feature: Example feature with DemoQA test

  @example1
  Scenario: Example scenario for DemoQA #1
    Given DemoQA start page is opened
    When User click on Elements card
    Then DemoQA Elements page is opened
    When User click on Buttons list item
    Then DemoQA Buttons page is opened
    Then "Click Me" button is visible

  @example2
  Scenario: Example scenario for DemoQA #1
    Given DemoQA start page is opened
    When User click on Elements card
    Then DemoQA Elements page is opened
    When User click on Buttons list item
    Then DemoQA Buttons page is opened
    Then "Right Click Me" button is visible