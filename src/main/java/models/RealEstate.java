package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RealEstate {
    public WebDriver driver;
    public WebDriverWait wait;
    public String region;
    public String district;
    public String quartal;
    public String street;
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
    public String plotNumber;
    public String rcNumber;
    public String area;
    public String purpose;


    public RealEstate(String region, String district, String quartal, String street, String description, String photo, String link, String link3D, String price, String phone, String email) {
        this.region = region.toLowerCase();
        this.district = district.toLowerCase();
        this.quartal = quartal.toLowerCase();
        this.street = street.toLowerCase();
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
        this.wait = Helper.wait;
    }


    public void fill() {
        Helper.driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10");
        setLocation(0, region);
        setLocation(1, district);
        setLocation(2, quartal);
        setLocation(3, street);
        description();
        uploadFile();
        addLinks();
        addPrice();
        addContacts();
        turnOffEmail();
        turnOffChat();
        confirmRules();
        submit();
    }

public void addLinks() {
    driver.findElement(By.name("Video")).sendKeys(this.link);
    driver.findElement(By.name("tour_3d")).sendKeys(this.link3D);
}
    public void addPrice() {
    driver.findElement(By.id("priceField")).sendKeys(price);
}
    public void addContacts() {
    driver.findElement(By.name("phone")).sendKeys(phone);
    driver.findElement(By.name("email")).sendKeys(email);

}
    public void turnOffEmail() {
    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[23]/span/label/span")).click();
}
    public void turnOffChat() {
    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[24]/div/div/div/label/span")).click();
}
    public void confirmRules() {
    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[25]/span[1]/div/div/label/span")).click();
}
    public void submit() {
        driver.findElement(By.id("submitFormButton")).click();
    }

    public void description() {
        driver.findElement(By.name("notes_lt")).sendKeys(description);
    }

    public void uploadFile() {
        WebElement upload_file = driver.findElement(By.xpath("//*[@id=\"uploadPhotoBtn\"]/input"));
        upload_file.sendKeys("C:/Users/Olga/Desktop/butas.jpg");
    }

    public void setLocation(int pos, String location) {
        try {
            WebElement span = driver.findElements(By.className("input-style-dropdown")).get(pos);
            Thread.sleep(500);
            span.findElement(By.className("dropdown-input-value-title")).click();
            WebElement ul = span.findElement(By.className("dropdown-input-values-address"));
            if (ul.findElements(By.tagName("input")).isEmpty()) {
                for (WebElement li : ul.findElements(By.tagName("li"))) {
                    if (li.getText().toLowerCase().contains(location)) {
                        li.click();
                        break;
                    }
                }
            } else {
                int count = ul.findElements(By.tagName("li")).size();
                ul.findElement(By.tagName("input")).sendKeys(location);
                while (true) {
                    List<WebElement> lis = ul.findElements(By.tagName("li"));
                    if (count != lis.size()) {
                        lis.get(lis.size() - 1).click();
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    protected void fillAdvertForm() {
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


