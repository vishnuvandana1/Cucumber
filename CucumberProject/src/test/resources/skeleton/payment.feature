Feature: Payment Scenario
Scenario: The one where the user added atleast one produtc to the cart and performing the payment to successful order
    Given url of TestMeApp
    When Larry added a headphone to the cart
     And checkout for the payment
     And fills transaction details
    Then Product is successfully ordered