package starter.shopping;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ShoppingPage {

    public static Performable addToCart() {
        return Task.where("add items to cart",
            Click.on(ShoppingForm.FIRST_ITEM_BUTTON),
            Click.on(ShoppingForm.SECOND_ITEM_BUTTON));
    }

    public static Performable toGoToShoppingCart() {
        return Task.where("to go to shopping cart",
            Click.on(ShoppingForm.SHOPPING_CART_BUTTON));
    }
}
