Feature: Computer Test
  As a user I want to build my own computer in computer page.

  @smoke, @regression
  Scenario: Verify user should navigate to computer page successfully
    Given I am on home page
    When I click on menu tab "Computers"
    Then I should navigate to computers page successfully

  @sanity, @regression
  Scenario: Verify user should navigate to desktops page successfully
    Given I am on home page
    When I click on menu tab "Computers"
    And I click on desktops link "Desktops"
    Then Verify desktops page is displayed

  @regression
  Scenario Outline: Verify user should build own computer and add to cart successfully
    Given I am on home page
    When I click on menu tab "Computers"
    And I click on desktops link "Desktops"
    And  I click on build your own computer
    And I select processor "<processor>"
    And I select ram "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select software "<software>"
    And  I click on add to cart button
    Then Verify product has been added to your shopping cart text
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |