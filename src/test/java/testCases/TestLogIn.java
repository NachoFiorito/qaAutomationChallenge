package testCases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.StepsLogIn;

@RunWith(SerenityRunner.class)
public class TestLogIn extends TestBase{

    @Steps
    StepsLogIn login;


    @Test
    public void A_LogInOK() throws InterruptedException {
        login.ingresarLogIn();
        login.ingresarCredenciales("admin@admin.com","admin123");
        //Thread.sleep(2000);
        Assert.assertEquals("PASS",login.verificarIngreso());

    }

    @Test
    public void B_LogInFail() throws InterruptedException {
        login.ingresarLogIn();
        login.ingresarCredenciales("admin@admin.com","admin321");
        Assert.assertEquals("PASS",login.verificarIngresoFail());
    }

}
