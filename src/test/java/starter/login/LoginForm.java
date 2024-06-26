package starter.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginForm {

    public static final Target USER_NAME_FIELD = Target.the("user name field").located(By.id("user-name"));
    public static final Target PASSWORD_FIELD = Target.the("password field").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("login button").located(By.id("login-button"));
}
