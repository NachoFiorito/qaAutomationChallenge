package steps;

import net.thucydides.core.annotations.Step;
import pageObject.BusquedaPage;
import pageObject.RespuestaBusquedaPage;

public class StepsBusqueda {

    BusquedaPage busquedaPage;
    RespuestaBusquedaPage restBusquedaPage;

    @Step
    public void llenarIdaVuelta(String desde, String hasta) throws InterruptedException {
        busquedaPage.ingresarVueloDesde(desde);
        Thread.sleep(2000);
        busquedaPage.selectVueloDesde();
        busquedaPage.ingresarVueloHasta(hasta);
        Thread.sleep(2000);
        busquedaPage.selectVueloHasta();
    }

    @Step
    public void elegirFechas(){
        busquedaPage.ingresarFechaSalida();
        busquedaPage.selectFechaSalida();
        busquedaPage.selectFechaRegreso();
    }

    @Step
    public void buscar(){busquedaPage.buscarBoton();}

    @Step
    public void ingresarPersonas(){
        busquedaPage.ingresarPersonas();
        busquedaPage.sumPmayores();
        busquedaPage.sumPmenores();
        busquedaPage.selectMenorbtn();
        busquedaPage.selectMenorDosYonce();
        busquedaPage.sumPbebes();
        busquedaPage.selectBtnListo();
    }

    @Step
    public void ingresarClase(){
        busquedaPage.ingresarClase();
        busquedaPage.selectEconomica();
    }

    @Step
    public String verificarBusquedaCampo(){
        return restBusquedaPage.validarBusquedaCampo();
    }

    @Step
    public String verificarBusqueda(){
        return restBusquedaPage.validarBusqueda();
    }

}
