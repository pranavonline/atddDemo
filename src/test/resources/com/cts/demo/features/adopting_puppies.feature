@requires_browser
Feature: Adopting puppies

  #Background: 
  #	Given I on app
  #
  #Scenario: Fill the form
  #When I fill the form
  #|username|password|
  #|pranav|pass|
  #Then able to login
  #
  #Scenario: Fill the form
  #Given I navigated to home page
  #When I fill the form
  #|username|password|
  #|pranav1|pass|
  #Then not able to login
  #
  #Scenario: Fill the form
  #Given I navigated to home page
  #And I navigated to account page
  #When I fill the form
  #|username|password|
  #|pranav1|pass|
  #Then not able to login
  
  
  #
  #
  #
  #
  #Scenario Outline: Fill the form
  #Given I on app
  #When I fill the form
  #|username|password|
  #|<user>|<password>|
  #Then <flag> able to login
  #
  #Examples:
  #|user|password|flag|
  #|pranav|password||
  #|pranav1|password|not|
  
  
  Scenario Outline: Adopting a puppy
    Given I am on the puppy adoption site "<BrowserName>"
    When I select "<puppy_name>"
    And add the puppy to the shopping cart
    And I proceed to the checkout
    And enter "<name>" in the name field
    And enter "<address>" in the address field
    And enter "<email>" in the email field
    And select "<pay_type>" from the pay type
    And I click the Place Order button
    Then I should see "Thank you for adopting a puppy!"
    And I get a puppy

    Examples: 
      | BrowserName     | name  | address  | email             | pay_type    | puppy_name |
      | Headless | Chrys | 123 Main | chrys@example.com | Credit card | Brook      |
      #| chrome_42_VISTA | Chrys | 123 Main | chrys@example.com | Credit card | Brook      |
      #| ipad_8.2_OS X 10.10_iPad Simulator_landscape                   | Chrys | 123 Main | chrys@example.com | Credit card | Brook      |
      #| iphone_8.2_OS X 10.10_iPhone Simulator_portrait                | Chrys | 123 Main | chrys@example.com | Credit card | Brook      |
      #| android_4.1_android_Samsung Galaxy Note 10.1 Emulator_portrait | Chrys | 123 Main | chrys@example.com | Credit card | Brook      |
