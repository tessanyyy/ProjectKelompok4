package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewExport {

    private WebDriver driver;

    public ViewExport() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[4]/a/span")
    WebElement viewExport;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement txtViewExportPage;

    @FindBy(xpath = "//*[@id=\"datepicker\"]")
    WebElement datePickerStartDate;

    @FindBy(xpath = "//*[@id=\"datepicker2\"]")
    WebElement datePickerEndDate;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[3]/div/button")
    WebElement btnFilter;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[3]/div/a")
    WebElement btnRefresh;

    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[2]/a")
    WebElement view;

    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[7]/a")
    WebElement fotoFaskesAwal;

    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[8]/a")
    WebElement fotoFaskesTujuan;

    @FindBy(xpath = "//*[@id=\"data-table-default2\"]/tbody/tr[1]/td[9]/a")
    WebElement pdfAgreement;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/form/button")
    WebElement export;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/form/button")
    WebElement download;


    public void klikViewExport(){
        viewExport.click();
    }

    public String getTxtViewExportPage(){
        return txtViewExportPage.getText();
    }

    public void datePickerStartDate(String start)



}
