package testCases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.StepsBusqueda;

@RunWith(SerenityRunner.class)
public class TestBusqueda extends TestBase{

    @Steps
    StepsBusqueda stepBusqueda;


    @Test
    public void realizarBusquedaSinVuelos() throws InterruptedException{
        stepBusqueda.buscar();
        Thread.sleep(1000);
        Assert.assertEquals("PASS",stepBusqueda.verificarBusquedaCampo());
    }

    @Test
    public void realizarBusquedaConVuelo() throws InterruptedException {
        stepBusqueda.llenarIdaVuelta("Buenos Aires","Cordoba");
        stepBusqueda.elegirFechas(); // 19/07/2022 - 10/08/2022
        stepBusqueda.ingresarPersonas();
        stepBusqueda.ingresarClase();
        stepBusqueda.buscar();
        Thread.sleep(4000);
        Assert.assertEquals("PASS",stepBusqueda.verificarBusqueda());
    }
}
