Feature: TetsMeApp Feature
Scenario: AdminUser Scenario
     Given  url of the TestMeApp
     When user enter admin as username
     And user enter Password456 as password
     Then user is in home page
Scenario: Add Product scenario 
    Given Select add product
    When admin enters the details
    Then product is successfully added