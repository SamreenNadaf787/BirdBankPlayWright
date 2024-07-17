package stepdefinitions;

import io.cucumber.java.en.*;

public class TransferSteps {

    @Given("User navigated to the home page")
    public void user_navigated_to_the_home_page() {
        // Implement logic here
    }

    @When("User navigate to login page")
    public void user_navigate_to_login_page() {
        // Implement logic here
    }

    @When("User login with {string} and {string}")
    public void user_login_with_and(String username, String password) {
        // Implement logic here
    }

    @When("User click on transfer tab")
    public void user_click_on_transfer_tab() {
        // Implement logic here
    }

    @Given("User navigated to transfer page")
    public void user_navigated_to_transfer_page() {
        // Implement logic here
    }

    @When("User selects {string}")
    public void user_selects(String option) {
        // Implement logic here
    }


    @When("User confirms the payment")
    public void user_confirms_the_payment() {
        // Implement logic here
    }

    @Then("User navigated to confirmation page and {string} message displayed")
    public void user_navigated_to_confirmation_page_and_message_displayed(String message) {
        // Implement logic here
    }

    // Newly added step definitions

    @When("User plogin with {string} and {string}")
    public void user_plogin_with_and(String username, String password) {
        // Implement login logic here
        System.out.println("Logging in with username: " + username + " and password: " + password);
        // Add your actual login code here
    }

    @When("User chose to account as {int}")
    public void user_chose_to_account_as(Integer accountNumber) {
        // Implement account selection logic here
        System.out.println("Choosing account number: " + accountNumber);
        // Add your actual account selection code here
    }

    @When("User selects from account as {int}")
    public void user_selects_from_account_as(Integer fromAccount) {
        // Implement logic for selecting the 'from' account here
        System.out.println("Selecting from account number: " + fromAccount);
        // Add your actual 'from' account selection code here
    }

    @When("User provides amount as {string} and messages as \"Payment\"")
    public void user_provides_amount_as_and_messages_as_payment(String amount) {
        // Implement logic for providing amount and messages here
        System.out.println("Providing amount: " + amount + " and message: Payment");
        // Add your actual amount and message provision code here
    }
}
