package starter.shopping;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CartShoppingPage {

    public static Performable checkout() {
        return Task.where("checkout the purchase",
            Click.on(ShoppingForm.CHECKOUT_BUTTON));
    }

    public static Performable checkoutInformation(String firstName, String lastName, String PostalCode) {
        return Task.where("checkout the purchase",
            Enter.theValue(firstName).into(ShoppingForm.FIRST_NAME_INPUT),
            Enter.theValue(lastName).into(ShoppingForm.LAST_NAME_INPUT),
            Enter.theValue(PostalCode).into(ShoppingForm.POSTAL_CODE_INPUT),
            Click.on(ShoppingForm.CONTINUE_BUTTON));
    }

    public static Performable finishCheckout() {
        return Task.where("finish checkout", Click.on(ShoppingForm.FINISH_BUTTON));
    }

    public static Performable validateSuccessMessage() {
        return Task.where("validate success message",
            Click.on(ShoppingForm.CHECKOUT_BUTTON));
    }

}
