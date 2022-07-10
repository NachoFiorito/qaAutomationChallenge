package steps;

import net.thucydides.core.annotations.Step;
import pageObject.LogInPage;
import pageObject.RespuestaLogInPage;

public class StepsLogIn {

    LogInPage loginPage;
    RespuestaLogInPage restLoginPage;

    @Step
    public void ingresarLogIn() throws InterruptedException {
        loginPage.hamburgerIcon();
        loginPage.mainBtnIngresar();
        Thread.sleep(2000);
        loginPage.ingresarBtn();
    }

    @Step
    public void ingresarCredenciales(String email, String pass) throws InterruptedException {
        loginPage.ingresarEmail(email);
        loginPage.ingresarContraseña(pass);
        Thread.sleep(2000);
        loginPage.logInBtn();
    }

    @Step
    public String verificarIngreso(){
        loginPage.hamburgerIcon();
        return restLoginPage.validarLogInOK();
    }

    @Step
    public String verificarIngresoFail(){return  restLoginPage.validarLogInFAIL();}


}
