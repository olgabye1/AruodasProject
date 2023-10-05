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
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"regionDropdown\"]/li[2]")).click();
        driver.findElement(By.id("districtTitle")).click();
        driver.findElement(By.xpath("//*[@id=\"districts_461\"]/li[2]")).click();
        driver.findElement(By.id("quartalTitle")).click();
        driver.findElement(By.xpath("//*[@id=\"quartals_1\"]/li[2]")).click();
        driver.findElement(By.id("streetTitle")).click();
        driver.findElement(By.xpath("//*[@id=\"streets_1\"]/li[1914]")).click();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/ul/li[1]")).click();
        driver.findElement(By.name("notes_lt")).sendKeys(description);
        WebElement upload_file = driver.findElement(By.id("uploadPhotoBtn"));
        upload_file.sendKeys("C:/Users/Olga/Desktop/lova.jpg");
        driver.findElement(By.name("Video")).sendKeys(this.link);
        driver.findElement(By.name("tour_3d")).sendKeys(this.link3D);
        driver.findElement(By.id("priceField")).sendKeys(price);
        driver.findElement(By.name("phone")).sendKeys(phone);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[23]/span/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[24]/div/div/div/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[25]/span[1]/div/div/label/span")).click();
        driver.findElement(By.id("submitFormButton")).click();
    }

    //public void selectRegion() {
        //WebElement select = driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/input[2]"));
        //select.click();
        //switch (region) {
           // case "Vilnius":
               // driver.findElement(By.xpath("//*[@id=\"regionDropdown\"]/li[2]")).click();
                //break;
           // case "Kaunas":
               // driver.findElement(By.xpath("//*[@id=\"regionDropdown\"]/li[3]")).click();
              //  break;
       // }
    //}
    //public void selectQuartal() {
        //driver.findElement(By.xpath("//*[@id=\"quartals_1\"]/li[1]/input")).click();
        //switch (quartal) {
            //case "Antakalnis":
              //  driver.findElement(By.xpath("//*[@id=\"quartals_1\"]/li[2]")).click();
              //  break;
           // case "Antavilis":
               // driver.findElement(By.xpath("//*[@id=\"quartals_1\"]/li[3]")).click();
               // break;
      //  }
    //}
    //public void selectStreet() {
      //  driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input[2]")).click();
        //switch (street) {
            //case "Plytinės g.":
                //driver.findElement(By.xpath("//*[@id=\"streets_1\"]/li[2984]"));
              //  break;
           // case "Antakalnio g.":
               // driver.findElement(By.xpath("//*[@id=\"streets_1\"]/li[2984]"));
                //break;
     //   }
    //}


}


