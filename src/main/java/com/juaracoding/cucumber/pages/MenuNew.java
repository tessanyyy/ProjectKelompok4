package com.juaracoding.cucumber.pages;


import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuNew {
    private final WebDriver driver;

    public MenuNew() {
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

    @FindBy(xpath = "//*[@id=\"form-filter\"]/div[2]/div[1]/div/label")
    WebElement TxtStatus;

    @FindBy(xpath = "//*[@id=\"select2-status-container\"]")
    WebElement selectStatus;


    @FindBy(xpath = "//*[@id=\"btn-filter\"]")
    WebElement btnFilter;

    @FindBy(xpath = "//button[@id='btn-reset']")
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

    @FindBy(xpath = "//*[@id=\"tgl\"]")
    WebElement datePickerEndDate;

    @FindBy(xpath = "//*[@id=\"form-filter\"]/div[1]/div[1]")
    WebElement tampilStartDate;

    @FindBy(xpath = " //*[@id=\"form-filter\"]/div[1]/div[2]")
    WebElement tampilEndDate;


    @FindBy(xpath = "//*[@id=\"form-filter\"]/div[1]/div[1]/div")
    WebElement klik;

    //input[@role='textbox'] send key

    @FindBy(xpath = "//input[@role='textbox'] ")
    WebElement sendKeyStatus;

    @FindBy(xpath = "//span[@id='select2-status-container']")
    WebElement klikSelectStatus;

    @FindBy(xpath = "//input[@role='textbox'] ")
    WebElement sendKeyStatusPending;

    @FindBy(xpath = "//span[@id='select2-status-container']")
    WebElement klikSelectStatusPending;

    @FindBy(xpath = "//select[@name='table_length']")
    WebElement klikShowPages;

    @FindBy(xpath = " //*[@id=\"btnRefresh\"]")
    WebElement btnResetSearch;

    @FindBy(xpath = "//*[@id=\"table\"]/thead/tr[1]/th[1]")
    WebElement nomor;

    @FindBy(xpath = "//*[@id=\"table\"]/thead/tr[1]/th[2]")
    WebElement nama;

    @FindBy(xpath = "//*[@id=\"table\"]/thead/tr[1]/th[3]")
    WebElement nomorBPJS;

    @FindBy(xpath = "//*[@id=\"table\"]/thead/tr[1]/th[4]")
    WebElement kotaKTP;

    @FindBy(xpath = "//*[@id=\"table\"]/thead/tr[2]/th[1]")
    WebElement faskesAsal;

    @FindBy(xpath = "//*[@id=\"table\"]/thead/tr[2]/th[2]")
    WebElement faskesTujuan;












    public void klikMenuNew() {
        menuNew.click();
    }

    public String getTxtReturnPage() {
        return getTxtRetrun.getAttribute("Form Return");
    }

    public void klikStartDate() {
        this.startDate.click();
        klik.click();
    }

    public void datepickerStarDate(String startdate) {
        this.datePickerStartDate.sendKeys(startdate);
        klik.click();
    }

    public void tampilstartdate() {
        tampilStartDate.click();
        klik.click();
    }

    public void klikEndDate() {
        this.endDate.click();
        klik.click();
    }

    public void datepickerEndDate(String endDate) {
        this.datePickerEndDate.sendKeys(endDate, Keys.RETURN);
        klik.click();
    }

    public void setTampilEndDate() {
        tampilEndDate.click();
        klik.click();
    }

    public String getTxtStatus() {
        return TxtStatus.getAttribute("Status");
    }

    public void selectStatusOne(String status) {
        klikSelectStatus.click();
        this.sendKeyStatus.sendKeys(status);
        klik.click();
    }

    public void selectStatusTwo(String status) {
        klikSelectStatusPending.click();
        this.sendKeyStatusPending.sendKeys(status);
    }


    public void klikButtonFilter() {
        this.btnFilter.sendKeys(Keys.RETURN);
    }


    public void klikButtonReset() {
        this.btnRiset.click();
    }

    public void setTextBoxSearch() {
        textBoxSearch.click();
    }

    public void inputTextBoxSearch(String search) {
        this.textBoxSearch.sendKeys(search);
    }

    public void setBtnSearch() {
        btnSearch.click();
    }

    public void klikSelectages(){
        klikShowPages.click();
    }


    public void inputSepuluhShowPages(String pages){
        this.klikShowPages.sendKeys(pages);
    }

    public void setBtnResetSearch(){
        btnResetSearch.click();
    }

    public void klikNomor(){
        nomor.click();
    }

    public String getTxtNo() {
        return nomor.getAttribute("No");
    }

    public void klikNama(){
        nama.click();
    }

    public String getTxtNama() {
        return nama.getAttribute("Nama");
    }

    public void kliknomorBPJS(){
        nomorBPJS.click();
    }

    public String getTxtNomorBPJS() {
        return nomorBPJS.getAttribute("Nomor BPJS");
    }

    public void klikKotaKTP(){
        kotaKTP.click();
    }

    public String getTxtKotaKTP() {
        return kotaKTP.getAttribute("Kota KTP");
    }

    public void klikFaskesAwal(){
        faskesAsal.click();
    }

    public String getTxtFaskesAwal() {
        return faskesAsal.getAttribute("Asal");
    }

    public void klikFaskesTujuan(){
        faskesTujuan.click();
    }

    public String getTxtFaskesTujuan() {
        return faskesTujuan.getAttribute("Tujuan");
    }





}