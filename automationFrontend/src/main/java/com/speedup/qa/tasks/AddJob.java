package com.speedup.qa.tasks;

import com.speedup.qa.interactions.ScrollDown;
import com.speedup.qa.interactions.WaitInteraction;
import com.speedup.qa.models.CredentialsData;
import com.speedup.qa.models.NewJobData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.ScrollTo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.speedup.qa.userinterfaces.AddJob.*;
import static com.speedup.qa.userinterfaces.Login.*;

public class AddJob implements Task {

    private NewJobData newJobData;
    public AddJob(NewJobData newJobData){
        this.newJobData = newJobData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_ON_ME_BUTTON));
        actor.attemptsTo(Click.on(CLICK_VIEW_PROFILE), WaitInteraction.waitFor(0), ScrollDown.on(10));
        actor.attemptsTo(Click.on(CLICK_ADD_POSITION_BUTTON));
        actor.attemptsTo(Click.on(ADD_JOB));

        actor.attemptsTo(Click.on(WRITE_TITLE));
        actor.attemptsTo(Enter.theValue(newJobData.getJobTitle()).into(WRITE_TITLE));
        actor.attemptsTo(Click.on(SELECT_EMPLOYMENT_TYPE.of(newJobData.getEmploymentType())));
        actor.attemptsTo(Enter.theValue(newJobData.getCompanyName()).into(WRITE_COMPANY_NAME), ScrollDown.on(2));
        actor.attemptsTo(Enter.theValue(newJobData.getLocation()).into(WRITE_LOCATION).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(SELECT_START_MONTH.of(newJobData.getStartMonth())));
        actor.attemptsTo(Click.on(SELECT_START_YEAR.of(newJobData.getStartYear())));
    }
    public static AddJob withData(NewJobData newJobData){
        return new AddJob(newJobData);
    }
}
