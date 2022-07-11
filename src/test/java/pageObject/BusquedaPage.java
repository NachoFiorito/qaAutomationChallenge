package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BusquedaPage extends PageObject {

    @FindBy(xpath = "//input[@id='flight-from']")
    public WebElementFacade inputVueloDesde;

    @FindBy(xpath = "//body/div[1]/div[3]/div[1]/am-autocomplete[1]/div[1]/div[2]/div[2]/div[1]")
    public WebElementFacade prOpDesde;

    @FindBy(xpath = "//input[@id='flight-to']")
    public WebElementFacade inputVueloHasta;

    @FindBy(xpath = "//body/div[1]/div[3]/div[1]/am-autocomplete[1]/div[1]/div[2]/div[2]/div[1]")
    public WebElementFacade prOpHasta;

    @FindBy(xpath = "//input[@id='departure-date']")
    public WebElementFacade btnFechaSalida;

    @FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/mb-range-datepicker-content[1]/mb-range-month-view[1]/div[1]/div[1]/mb-calendar-body[1]/table[1]/tbody[1]/tr[4]/td[2]/button[1]/span[1]")
    public WebElementFacade FechaSalida;

    @FindBy(xpath = "//body[1]/div[1]/div[3]/div[1]/mb-range-datepicker-content[1]/mb-range-month-view[1]/div[1]/div[2]/mb-calendar-body[1]/table[1]/tbody[1]/tr[2]/td[3]/button[1]/span[1]")
    public WebElementFacade FechaRegreso;

    @FindBy(xpath = "//input[@id='passengers']")
    public WebElementFacade btnPersonas;

    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/am-passengers-dialog[1]/div[1]/div[3]/div[1]/am-passengers-dialog-selector[1]/div[1]/div[2]/mb-icon[2]/*[1]")
    public WebElementFacade PmayoresSuma;

    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/am-passengers-dialog[1]/div[1]/div[3]/div[2]/am-passengers-dialog-selector[1]/div[1]/div[2]/mb-icon[2]/*[1]")
    public WebElementFacade PMenoresSuma;

    @FindBy(css = "#child-0")
    public WebElementFacade btnEdadMenor;

    @FindBy(xpath = "//option[contains(text(),'Entre 2 y 11 años')]")
    public WebElementFacade btnDosYOnce;

    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/am-passengers-dialog[1]/div[1]/div[3]/div[4]/am-passengers-dialog-selector[1]/div[1]/div[2]/mb-icon[2]/*[1]")
    public WebElementFacade PBebesSuma;

    @FindBy(xpath = "//span[contains(text(),'Listo')]")
    public WebElementFacade btnListo;

    @FindBy(xpath = "//select[@id='classes']")
    public WebElementFacade btnClase;

    @FindBy(xpath = "//option[contains(text(),'Económica')]") // //option[@value='M']
    public WebElementFacade claseEconomica;

    @FindBy(xpath = "//span[contains(text(),'Buscar')]")
    public WebElementFacade btnBuscar;

    public void ingresarVueloDesde(String vDesde){inputVueloDesde.waitUntilEnabled().sendKeys(vDesde);}
    public void selectVueloDesde(){prOpDesde.waitUntilClickable().click();}
    public void ingresarVueloHasta(String vHasta){inputVueloHasta.waitUntilEnabled().sendKeys(vHasta);}
    public void selectVueloHasta(){prOpHasta.waitUntilClickable().click();}
    public void buscarBoton(){btnBuscar.waitUntilClickable().click();}
    public void ingresarFechaSalida(){btnFechaSalida.waitUntilClickable().click();}
    public void selectFechaSalida(){FechaSalida.waitUntilClickable().click();}
    public void selectFechaRegreso(){FechaRegreso.waitUntilClickable().click();}
    public void ingresarPersonas(){btnPersonas.waitUntilClickable().click();}
    public void sumPmayores(){PmayoresSuma.waitUntilClickable().click();}
    public void sumPmenores(){PMenoresSuma.waitUntilClickable().click();}
    public void selectMenorbtn(){btnEdadMenor.waitUntilClickable().click();}
    public void selectMenorDosYonce(){btnDosYOnce.waitUntilClickable().click();}
    public void sumPbebes(){PBebesSuma.waitUntilClickable().click();}
    public void selectBtnListo(){btnListo.waitUntilClickable().click();}
    public void ingresarClase(){btnClase.waitUntilClickable().click();}
    public void selectEconomica(){claseEconomica.waitUntilClickable().click();}

}


