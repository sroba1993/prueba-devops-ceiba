package starter.shopping;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutForm {
    public static final Target CHECKOUT_COMPLETE_MESSAGE = Target.the("checkout complete message")
        .located(By.cssSelector("div.header_secondary_container span.title"));
}
