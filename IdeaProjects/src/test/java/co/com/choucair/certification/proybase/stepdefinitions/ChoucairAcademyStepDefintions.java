package co.com.choucair.certification.proybase.stepdefinitions;

import co.com.choucair.certification.proybase.model.AcademyChoucairData;
import co.com.choucair.certification.proybase.questions.Answer;
import co.com.choucair.certification.proybase.tasks.Login;
import co.com.choucair.certification.proybase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefintions {

@Before
public void setStage (){
    OnStage.setTheStage(new OnlineCast());
}

    @Given("^than brandon wants to learn automation at the academy choucair$")
public void thanBrandonwantsToLearnAutomationAtTheAcademychoucair(List<AcademyChoucairData>AcademyChoucairData) throws Exception {
OnStage.theActorCalled("David").wasAbleTo(OpenUp.thePage(), Login.
        onThePage(AcademyChoucairData.get(0).getStrUser(),AcademyChoucairData.get(0).getStrPassword()));


    }

@when("^he search for the course (.*) on the choucair academy platforms$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData>AcademyChoucairData)
        throws Exception{
    onStage.theActorInTheSpotLight().attemptsto(Search.the(AcademyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he finds the course called  resources (.*)")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(List<AcademyChoucairData> AcademyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotLight().should(GivenWhenThen.seeThat(Answer.toThe(AcademyChoucairData.get(0).getStrCourse())));


          }

}
