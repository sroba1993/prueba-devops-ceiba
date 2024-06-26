package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable loginPage() {
        return Task.where("{0} opens the Sauce demo page",
                Open.browserOn().the(SauceDemoPage.class));
    }
}
