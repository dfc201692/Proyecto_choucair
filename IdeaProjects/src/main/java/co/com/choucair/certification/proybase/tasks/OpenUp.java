package co.com.choucair.certification.proybase.tasks;

import co.com.choucair.certification.proybase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
            }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attempsTo(Open.browserOn(choucairAcademyPage));

    }
}
