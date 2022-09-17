package com.speedup.qa.tasks;

import com.speedup.qa.models.CredentialsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterfaces.Login.*;

public class LoginUser implements Task {

    private CredentialsData credentialsData;
    public LoginUser(CredentialsData credentialsData){
        this.credentialsData = credentialsData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTER_LOGIN_SCREEN));
        actor.attemptsTo(Enter.theValue(credentialsData.getUser()).into(USER_NAME));
        actor.attemptsTo(Enter.theValue(credentialsData.getPassword()).into(USER_PASSWORD));
        actor.attemptsTo(Click.on(CLICK_SIGNIN_BUTTON));
    }

    public static LoginUser withData(CredentialsData credentialsData){
        return new LoginUser(credentialsData);
    }
}
