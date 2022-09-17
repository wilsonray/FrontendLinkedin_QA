package com.speedup.qa.stepdefinitions;

import com.speedup.qa.models.CredentialsData;
import com.speedup.qa.models.NewJobData;
import com.speedup.qa.questions.Login;
import com.speedup.qa.tasks.AddJob;
import com.speedup.qa.tasks.LoginUser;
import com.speedup.qa.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class newChargeStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Jenkins Cartwright");
    }
    @When("^Add the new job$")
    public void addTheNewJob(List<NewJobData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddJob.withData(data.get(0)));
    }

    @Then("^I should see it in the profile$")
    public void iShouldSeeItInTheProfile() {

    }
}



