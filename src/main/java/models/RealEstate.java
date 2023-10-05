package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RealEstate {
    public WebDriver driver;

    public String region;
    public String district;
    public String quartal;
    public String street;
    public String type;
    public String description;
    public String photo;
    public String link;
    public String link3D;

    public String price;
    public String phone;
    public String email;
    public boolean checkEmail;
    public boolean checkChat;
    public boolean checkRules;

    public RealEstate(String region, String district, String quartal, String street, String type, String description,
                      String photo, String link, String link3D,
                      String price, String phone, String email, boolean checkEmail, boolean checkChat, boolean checkRules) {
        this.region = region;
        this.district = district;
        this.quartal = quartal;
        this.street = street;
        this.type = type;
        this.description = description;
        this.photo = photo;
        this.link = link;
        this.link3D = link3D;
        this.price = price;
        this.phone = phone;
        this.email = email;
        this.checkEmail = checkEmail;
        this.checkChat = checkChat;
        this.checkRules = checkRules;
        this.driver = Helper.driver;
    }

    public void fill() {
        selectRegion();
        driver.findElement(By.xpath("//*[@id=\"districtTitle\"]")).sendKeys(this.district);
        selectQuartal();
        selectStreet();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input[2]")).sendKeys(this.type);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[13]/div/div[1]/textarea")).sendKeys(this.description);
        driver.findElement(By.id("uploadPhotoBtn")).sendKeys(this.photo);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/span[1]/input")).sendKeys(this.link);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/span[1]/input")).sendKeys(this.link3D);
        driver.findElement(By.id("priceField")).sendKeys(this.price);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/span[1]/input")).sendKeys(this.phone);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/span[1]/input")).sendKeys(this.email);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[23]/span/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[24]/div/div/div/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[25]/span[1]/div/div/label/span")).click();
        driver.findElement(By.id("submitFormButton")).click();
    }

    public void selectRegion() {
        WebElement select = driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/input[2]"));
        select.click();
        switch (region) {
            case "Vilnius":
                driver.findElement(By.xpath("//*[@id=\"regionDropdown\"]/li[2]"));
                break;
            case "Kaunas":
                driver.findElement(By.xpath("//*[@id=\"regionDropdown\"]/li[3]"));
                break;
        }
    }
    public void selectQuartal() {
        driver.findElement(By.xpath("//*[@id=\"quartals_1\"]/li[1]/input")).click();
        switch (quartal) {
            case "Antakalnis":
                driver.findElement(By.xpath("//*[@id=\"quartals_1\"]/li[2]"));
                break;
            case "Antavilis":
                driver.findElement(By.xpath("//*[@id=\"quartals_1\"]/li[3]"));
                break;
        }
    }
    public void selectStreet() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input[2]")).click();
        switch (street) {
            case "Plytinės g.":
                driver.findElement(By.xpath("//*[@id=\"streets_1\"]/li[2984]"));
                break;
            case "Antakalnio g.":
                driver.findElement(By.xpath("//*[@id=\"streets_1\"]/li[2984]"));
                break;
        }
    }


}


