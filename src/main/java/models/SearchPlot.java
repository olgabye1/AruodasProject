package models;

import org.openqa.selenium.By;

public class SearchPlot extends RealEstate {

    public String plotNumber;
    public String rcNumber;
    public String area;
    public String purpose;

    public SearchPlot(String region, String district, String quartal, String street, String plotNumber,String rcNumber, String area, String purpose, String description, String photo, String link, String link3D, String price, String phone, String email) {
        super(region, district, quartal, street, description, photo, link, link3D, price, phone, email);
        this.plotNumber = plotNumber;
        this.rcNumber = rcNumber;
        this.area = area;
        this.purpose = purpose;
        this.driver = Helper.driver;
    }


    @Override
                public void fill() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11");
        //setAction();
        super.fill();
        setPlotNumber();
        setRcNumber();
        setArea();
        setPurpose();
        driver.findElement(By.id("submitFormButton")).click();
    }

        //public void setAction(){
        //driver.findElement(By.xpath("//*[@id=\"dealType\"]/ul/li[1]")).click();
        //}
        public void setPlotNumber(){

        driver.findElement(By.name("FHouseNum")).sendKeys(plotNumber);
        }
        public void setRcNumber(){

        driver.findElement(By.name("RCNumber")).sendKeys(rcNumber);
        }
        public void setArea(){

        driver.findElement(By.name("FAreaOverAll")).sendKeys(area);
        }
        public void setPurpose(){
        driver.findElement(By.name("FIntendance[]")).click();      //"//*[@id=\"newObjectForm\"]/ul/li[16]")).click();
        }


    }
