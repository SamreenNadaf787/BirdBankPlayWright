package stepdefinitions;

import io.cucumber.java.en.When;

public class steps1 {

    @When("User chose to account as\"{int}\"")
    public void user_chose_to_account_as(Integer int1) {
        // Implement the action to choose the account here
        System.out.println("User chose to account as: " + int1);
    }

    @When("User selects from account as\"{int}\"")
    public void user_selects_from_account_as(Integer int1) {
        // Implement the action to select the from account here
        System.out.println("User selects from account as: " + int1);
    }

    @When("User provides amount as {string} and messages as \"Payment\"")
    public void user_provides_amount_as_and_messages_as_payment(String string) {
        // Implement the action to provide amount and message here
        System.out.println("User provides amount as: " + string + " and messages as Payment");
    }
}
