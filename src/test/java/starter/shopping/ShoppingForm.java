package starter.shopping;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingForm {

    public static final Target FIRST_ITEM_BUTTON = Target.the("add first item button")
        .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target SECOND_ITEM_BUTTON = Target.the("add second item button")
        .located(By.id("add-to-cart-sauce-labs-onesie"));
    public static final Target SHOPPING_CART_BUTTON = Target.the("to go to shopping cart")
        .located(By.id("shopping_cart_container"));
    public static final Target CHECKOUT_BUTTON = Target.the("checkout the purchase").located(By.id("checkout"));
    public static final Target FIRST_NAME_INPUT = Target.the("checkout the purchase").located(By.id("first-name"));
    public static final Target LAST_NAME_INPUT = Target.the("checkout the purchase").located(By.id("last-name"));
    public static final Target POSTAL_CODE_INPUT = Target.the("checkout the purchase").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("checkout the purchase").located(By.id("continue"));
    public static final Target FINISH_BUTTON = Target.the("finish checkout").located(By.id("finish"));
}
