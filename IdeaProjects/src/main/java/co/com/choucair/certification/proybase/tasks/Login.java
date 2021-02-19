package co.com.choucair.certification.proybase.tasks;

import com.sun.tools.javac.comp.Enter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.security.DigestInputStream;


public class Login implements Task  {
    private String strUSer;
    private String strPassword;
    public Login(String strUSer, String strPassword){

        this.strUSer = strUSer;
        this.strPassword = strPassword;

    }


    public static Object onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);

    }
@Override
    public <T extends Actor> void performAs(T actor) {
actor.attempsTo(click.on(choucairLoginPage.LOGIN_BUTTON),
        Enter.thevalue(strUSer).into(choucairLoginPage.USER),
        Enter.thevalue(strPassword).into(choucairLoginPage.PASSWORD),
        Click.on(choucairLoginPage.ENTER_BUTTON)

        );
}

}
