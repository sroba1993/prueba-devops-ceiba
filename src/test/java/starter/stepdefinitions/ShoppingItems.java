package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import starter.login.LoginPage;
import starter.navigation.NavigateTo;
import starter.shopping.CartShoppingPage;
import starter.shopping.CheckoutCompleteMessagePage;
import starter.shopping.ShoppingPage;

import static org.hamcrest.Matchers.equalTo;

public class ShoppingItems {

    @Given("that an {actor} is on login page")
    public void thatAnUserIsOnLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.loginPage());
    }

    @When("{actor} login with account")
    public void heLoginWithAccount(Actor actor) {
        actor.attemptsTo(LoginPage.doLogin("standard_user", "secret_sauce"));
    }

    @And("{actor} select an article")
    public void heSelectAnArticle(Actor actor) {
        actor.attemptsTo(ShoppingPage.addToCart());
    }

    @And("{actor} confirm order on shopping cart")
    public void heConfirmOrderOnShoppingCart(Actor actor) {
        actor.attemptsTo(ShoppingPage.toGoToShoppingCart());
        actor.attemptsTo(CartShoppingPage.checkout());
        actor.attemptsTo(CartShoppingPage.checkoutInformation("Alberto", "Arias", "1010"));
    }

    @Then("{actor} should be to see confirm purchase message")
    public void heShouldBeToSeeConfirmPurchaseMessage(Actor actor) {
        actor.attemptsTo(CartShoppingPage.finishCheckout());
        actor.should(GivenWhenThen.seeThat(CheckoutCompleteMessagePage.value(), equalTo("Checkout: Complete!")));
    }
}
