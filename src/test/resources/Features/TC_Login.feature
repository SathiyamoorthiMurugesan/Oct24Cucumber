Feature: This feature is to test the OrangeHRM page

  @TC01
  Scenario: This test case is to test login page
    Given User launches OrangeHRM page and enters username and password
    Then validates home page by getting the user name
    When clicks on the Time page
    Then user lands on the Time page

  @TC02
  Scenario: This test case is to test PIM page
    Given User launches OrangeHRM page and enters username and password
    Then validates home page by getting the user name
    When clicks on the PIM page
    Then user lands on the PIM page

  @TC03
  Scenario Outline: This test case is to test login page with different values
    Given User launches OrangeHRM page and enters Username "<username>" and Password "<password>"
    Then validates home page by getting the user name

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin12  |
