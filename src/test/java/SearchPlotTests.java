import models.Helper;
import models.SearchPlot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static models.Helper.acceptCookies;

public class SearchPlotTests {
    @Test
    public void searchPlotPositive() {
        Helper.driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11");
        SearchPlot sp = new SearchPlot("Vilnius", "Vilniaus", "Antakalnis", "Plytinės", "3", "1234-5678-9012","6","Namų valda","Ieskau sklypo namo statymui","C:/Users/Olga/Desktop/lova.jpg", "https://www.youtube.com/shorts/BQz8xxZUdaw","https://www.youtube.com/watch?v=R2fDRObS6OQ","300000","61100000","olga12345@gmail.com");
        sp.fill();
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
