package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RespuestaLogInPage extends PageObject {

    @FindBy(xpath = "//am-sidebar-body/div[2]/am-login[1]/div[1]/span[2]/p[2]")
    public WebElementFacade nombrePerfil;

    @FindBy(xpath = "//mb-error[@class=\"signIn__ErrorProcess mb-form-field__error\"]")
    public WebElementFacade errorMsj;

    public String validarLogInOK(){
        if(nombrePerfil.getText().equals("admin")){
            return "PASS";
        }else{
            return "FAIL";
        }
    }

    public String validarLogInFAIL(){
        if(errorMsj.getText().equals("Datos incorrectos.")){
            return "PASS";
        }else{
            return "FAIL";
        }
    }
}
