Feature: Transfer amount from own and other account
  this feature file contains scenarios related to transfer amount from own or other account
  Rule: the ussera have alteast 2 own or other accounts,the users should have enough privilages and balances to make transaction
    Background:
      Given User navigated to the home page
      When User navigate to login page
      And User plogin with "testuser1" and "testpassword"
      And User click on transfer tab
      Then User navigated to transfer page
    Scenario: transfer amount between two own accounts
      Given User navigated to transfer page
      When User selects "own account"
      And User chose to account as"99987890"
      And User selects from account as"98765"
      And User provides amount as "1000" and messages as "Payment'
      And User confirms the payment
      Then User navigated to confirmation page and "Transaction Sucessful" message displayed

