import models.Helper;
import models.SearchGarage;
import models.SearchPlot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static models.Helper.acceptCookies;

public class SearchGarageTests {
    @Test
    public void searchGaragePositive() {
        Helper.driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=13");
        SearchGarage sg = new SearchGarage("Vilnius", "Vilniaus", "Antakalnis", "Plytinės", "3", "1234-5678-9012","6","Mūrinis","","Ieskau sklypo namo statymui", "C:/Users/Olga/Desktop/lova.jpg","https://www.youtube.com/shorts/BQz8xxZUdaw","https://www.youtube.com/watch?v=R2fDRObS6OQ","61100000","olga12345@gmail.com");
        sg.fill();
        //String successMsg = Helper.driver.findElement()
    }

    @BeforeClass
    public void beforeClass() {
        Helper.driver = new ChromeDriver();
        Helper.driver.manage().window().maximize();
        Helper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // waits until the page loads
        acceptCookies();
    }
}
