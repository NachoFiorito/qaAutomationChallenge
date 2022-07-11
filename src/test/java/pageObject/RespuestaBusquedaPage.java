package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RespuestaBusquedaPage extends PageObject {

    @FindBy(xpath = "//div[contains(text(),'Filtros')]")
    public WebElementFacade titFiltros;

    @FindBy(xpath = "//body/am-home[1]/div[1]/div[2]/am-search-box[1]/div[1]/div[1]/am-search-box-container[1]/am-search-box-flights[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/am-message-error[1]/div[1]/span[1]")
    public WebElementFacade campoAlert;

    public String validarBusqueda(){
        if(titFiltros.waitUntilVisible().getText().equals("Filtros")){
            return  "PASS";
        }else{
            return "fallo";
        }
    }

    public String validarBusquedaCampo(){
        if(campoAlert.waitUntilVisible().getText().equals("Este campo es obligatorio.")){
            return  "PASS";
        }else{
            return "fallo";
        }
    }
}
