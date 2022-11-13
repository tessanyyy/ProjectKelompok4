package com.juaracoding.cucumber.pages;


import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuNew {
    private final WebDriver driver;

    public MenuNew(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[4]/a")
    WebElement menuNew;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement getTextFormReturnMenu;

    @FindBy(xpath = "//*[@id=\"tgl\"]")
    WebElement startDate;

    @FindBy(xpath = "//*[@id=\"tgl2\"]")
    WebElement endDate;

    @FindBy(xpath = "//*[@id=\"select2-status-container\"]")
    WebElement statusData;

    @FindBy(xpath = "//*[@id=\"btn-filter\"]")
    WebElement btnFilter;

    @FindBy(xpath = "//*[@id=\"btn-reset\"]")
    WebElement btnRiset;

    @FindBy(xpath = "//*[@id=\"table_filter\"]/label/input")
    WebElement textBoxSearch;

    @FindBy(xpath = "//*[@id=\"btnSearch\"]/i")
    WebElement btnSearch;

    @FindBy(xpath = "//*[@id=\"btnRefresh\"]")
    WebElement btnRisetTwo;

    @FindBy(xpath = "//*[@id=\"table_length\"]/label/select")
    WebElement selectShowDataEntries;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement getTxtRetrun;

    @FindBy(xpath = "//*[@id=\"tgl\"]")
    WebElement datePickerStartDate;


    @FindBy(xpath = "//*[@id=\"form-filter\"]/div[1]/div[1]")
    WebElement tampilStartDate;









    public void klikMenuNew() {
       menuNew.click();
    }

    public String getTxtReturnPage(){
        return getTxtRetrun.getAttribute("Form Return");
    }

    public void klikStartDate(){
        this.startDate.click();
    }

    public void datepickerStarDate(String startdate){
        this.datePickerStartDate.sendKeys(startdate);
    }

    public void tampilstartdate(){
        tampilStartDate.click();
    }

    public void klikEndDate(String endDate){
        this.endDate.sendKeys(endDate);
    }

    public void selectStatus(String status){
        this.statusData.sendKeys(status);
    }

    public void klikButtonFilter(){
        btnFilter.click();
    }





}
