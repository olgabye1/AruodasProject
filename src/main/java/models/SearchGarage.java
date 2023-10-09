package models;

import org.openqa.selenium.By;

public class SearchGarage extends RealEstate {
    public String garageNumber;
    public String rcNumber;
    public String area;
    public String make;
    public String accomodates;

    public SearchGarage(String region, String district, String quartal, String street, String garageNumber, String rcNumber, String area, String make, String accomodates, String description, String photo, String link, String link3D, String price, String phone, String email) {
        super(region, district, quartal, street, description, photo, link, link3D, price, phone, email);
        this.garageNumber = garageNumber;
        this.rcNumber = rcNumber;
        this.area = area;
        this.make = make;
        this.accomodates = accomodates;
        this.driver = Helper.driver;
    }
    @Override
    public void fill() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11");
        super.fill();
        setMake();
        setAccomodates();
        driver.findElement(By.id("submitFormButton"));
    }
    public void setMake() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div")).click();
    }

    public void setAccomodates() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div")).click();
    }

}
