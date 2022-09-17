package com.speedup.qa.stepdefinitions;

import com.speedup.qa.models.CredentialsData;
import com.speedup.qa.questions.Login;
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

public class loginStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Wilson Ray Villanueva");
    }

    @Given("^that Wilson Join Linkedin$")
    public void thatWilsonJoinLinkedin() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^he enters the credentials$")
    public void heEntersTheCredentials(List<CredentialsData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.withData(data.get(0)));
    }

    @Then("^the user should see the name (.*)$")
    public void theUserShouldSeeHisName(String nameUser) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Login.message(), org.hamcrest.Matchers.is(nameUser)));
    }
}
