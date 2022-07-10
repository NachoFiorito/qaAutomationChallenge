package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends PageObject {

    @FindBy(xpath = "//div[@class=\"icon-hamburger\"]")
    public WebElementFacade hamburgerIcon;

    @FindBy(xpath = "//am-sidebar-body/div[2]/am-login[1]/div[1]/span[1]/p[1]")
    public WebElementFacade btnIngresarMain;


    @FindBy(xpath = "//span[contains(text(),'INGRESAR')]")
    public WebElementFacade btnIngresar;
// //span[contains(text(),'INGRESAR')]

    @FindBy(xpath = "//input[@id='email']")
    public WebElementFacade inputEmail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElementFacade inputPass;

    @FindBy(xpath = "//span[contains(text(),'INGRESAR')]") ////span[contains(text(),'INGRESAR')]
    public WebElementFacade btnLogIn; // Boton ingresar final

    public void hamburgerIcon(){hamburgerIcon.waitUntilClickable().click();}
    public void mainBtnIngresar(){btnIngresarMain.waitUntilClickable().click();}
    public void ingresarBtn(){btnIngresar.waitUntilClickable().click();}
    public void ingresarEmail(String email){inputEmail.waitUntilEnabled().sendKeys(email);}
    public void ingresarContraseña(String pass){inputPass.waitUntilEnabled().sendKeys(pass);}
    public void logInBtn(){btnLogIn.waitUntilEnabled().click();}
}
