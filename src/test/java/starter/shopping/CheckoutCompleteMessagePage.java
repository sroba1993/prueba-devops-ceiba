package starter.shopping;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CheckoutCompleteMessagePage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CheckoutForm.CHECKOUT_COMPLETE_MESSAGE).answeredBy(actor);
    }

    public static Question<String> value() {
        return new CheckoutCompleteMessagePage();
    }
}