import models.RealEstate;
import models.Helper;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import static models.Helper.acceptCookies;
public class SearchRealEstateTests {


    @Test
    public void positiveTest(){
        Helper.driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10#daugiau");
        RealEstate re = new RealEstate("Vilnius","Vilniaus m.","Antakalnis", "Plytinės g.","Butai pirkti","Ieskau >80 kv.m.buto. Minimum 3 miegamieji kambariai. Naujesnės statybos","C:/Users/Olga/Desktop/lova.jpg", "https://www.youtube.com/shorts/BQz8xxZUdaw","https://www.youtube.com/watch?v=R2fDRObS6OQ","300000","61100000","olga12345@gmail.com",true, true,true);
        re.fill();
        //String successMsg = Helper.driver.findElement()
    }

    @BeforeClass
    public void beforeClass() {
        Helper.driver = new ChromeDriver();
        Helper.driver.manage().window().maximize();
        Helper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // waits until the page loads
        acceptCookies();
    }

    //@AfterClass
    //public void afterClass() {
       // Helper.driver.quit();
    //}


}
