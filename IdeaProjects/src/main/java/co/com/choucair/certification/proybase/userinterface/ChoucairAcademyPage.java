package co.com.choucair.certification.proybase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucidydes.core.annotations.DefaultUrl;


@DefaultUrl("https://operacion.choucairtesting.com/academy/login/index.php")
public class ChoucairAcademyPage extends PageObject{

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));

}
