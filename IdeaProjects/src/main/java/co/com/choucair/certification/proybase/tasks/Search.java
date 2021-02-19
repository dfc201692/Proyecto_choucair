package co.com.choucair.certification.proybase.stepdefinitions;

import co.com.choucair.certification.proybase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;


public class Search implements Task {
    private String course;

    public Search(String Course) {
        this.course = course;

    }

    public static Search the(String course) { return Tasks.instrumented(Search.class,course); }

@Override
    public <T extends  Actor> void performAs(T actor){
        actor.attempsTo(Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theValue(course).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_COURSE)
 };


}
}
