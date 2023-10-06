package models;
import org.openqa.selenium.By;

public class SearchRE extends RealEstate {
    public String object;
    public SearchRE(String region, String district, String quartal, String street, String type, String description, String photo, String link, String link3D, String price, String phone, String email){
        super(region, district, quartal, street, type, description, photo, link, link3D, price, phone, email);
        this.object =object;
    }
    @Override
    public void fill() {
        Helper.driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10#daugiau");
        super.fill();
        selectObjectType();
    }
    public void selectObjectType() {
        Helper.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/span")).click();
        Helper.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/ul/li[2]")).click();
    }

}
