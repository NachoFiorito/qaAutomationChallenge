package testCases;

import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUp(){driver.get("https://almundo.com.ar/");}

    @After
    public void tearDown(){driver.quit();}
}
