package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginPage {

    public static Performable doLogin(String userName, String password) {
        return Task.where("{0} enter the user name '" + userName + "'",
            Enter.theValue(userName).into(LoginForm.USER_NAME_FIELD),
            Enter.theValue(password).into(LoginForm.PASSWORD_FIELD),
            Click.on(LoginForm.LOGIN_BUTTON));
    }
}
