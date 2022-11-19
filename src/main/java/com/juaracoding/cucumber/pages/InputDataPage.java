package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.utils.Constants;
import com.juaracoding.cucumber.utils.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class InputDataPage {

    private WebDriver driver;
    private WebElement sendKeyStatus;

    public InputDataPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/siloam/sales/input']")
    WebElement btnInputData;

    @FindBy(xpath = "//input[@id='name']")
    WebElement nama;

    @FindBy(xpath = "//input[@id='no_bpjs']")
    WebElement nobpjs;

    @FindBy(xpath = "//input[@id='no_ktp']")
    WebElement nomKtp;

    @FindBy(xpath = "//textarea[@id='address']")
    WebElement address;

    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    WebElement kotaKTP;

    @FindBy(xpath = "//select[@id='ktp_city']")
    WebElement selectKotaKTP;

    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement faskesAwal;

    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement faskesTujuan;

    @FindBy(xpath = "//select[@id='destination_faskes']")
    WebElement selectFaskesTujuan;

    @FindBy(xpath = "//input[@role='textbox']")
    WebElement txtBox;

    @FindBy(xpath = "//textarea[@id='reason']")
    WebElement alasan;

    @FindBy(xpath= "//button[@type='submit']")
    WebElement submit;

    @FindBy(xpath = "//span[normalize-space()='Input']")
    WebElement inputDataMenu;

    @FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
    WebElement msgAlamat;

    @FindBy(xpath = "//span[normalize-space()='The Nomor BPJS already exist.']")
    WebElement msgBPJS;

    @FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
    WebElement msgAlasan;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement msgValidSave;

    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    WebElement inputDataTitle;

   @FindBy(xpath = "//li[@class='nav-items']//a[@class='nav-link disabled']//span[@class='d-sm-block d-none']")
   WebElement uploadData;


    public void inputDataValid(String nama, String nobpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
        Robot siloaminput = new Robot();

        clearName();
        inputName(nama);

        clearNomBpjs();
        inputNomBPJS(nobpjs);

        clearNomKtp();
        inputNomKtp(nomKtp);

        clearAddress();
        inputAddress(address);

        clickKotaKtp();
        inputKotaKTP(kotaKTP);
        siloaminput.keyPress(KeyEvent.VK_ENTER);
        siloaminput.keyRelease(KeyEvent.VK_ENTER);

        clearFaskesAwal();
        inputFaskesAwal(faskesAwal);

        clickFaskesTujuan();
        inputFaskesTujuan(faskesTujuan);
        siloaminput.keyPress(KeyEvent.VK_ENTER);
        siloaminput.keyRelease(KeyEvent.VK_ENTER);

        if(!faskesTujuan.equalsIgnoreCase("faskes")) {
            clearAlasan();
            inputAlasan(alasan);
        }
    }

    public void clearName() {
        this.nama.clear();
    }

    public void clearNomBpjs() {
        this.nobpjs.clear();
    }

    public void clearNomKtp() {
        this.nomKtp.clear();
    }

    public void clearAddress() {
        this.address.clear();
    }

    public void clearAlasan() {
        this.alasan.clear();
    }

    public void clearFaskesAwal() {
        this.faskesAwal.clear();
    }

    public void inputName(String nama) {
        this.nama.sendKeys(nama);
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public void inputNomBPJS(String nomBpjs) {
        this.nobpjs.sendKeys(nomBpjs);
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public void inputNomKtp(String nomKtp) {
        this.nomKtp.sendKeys(nomKtp);
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public void inputAddress(String address) {
        this.address.sendKeys(address);
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public void inputKotaKTP(String kotaKTP) {
        this.txtBox.sendKeys(kotaKTP);
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public void inputFaskesAwal(String faskesAwal) {
        this.faskesAwal.sendKeys(faskesAwal);
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public void inputFaskesTujuan(String faskesTujuan) {
        this.txtBox.sendKeys(faskesTujuan);
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public void inputAlasan(String alasan) {
        this.alasan.sendKeys(alasan);
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public WebElement getName() {
        return this.nama;
    }

    public WebElement getNomBPJS() {
        return this.nobpjs;
    }

    public WebElement getNomKTP() {
        return this.nomKtp;
    }

    public WebElement getKotaKTP() {
        return this.kotaKTP;
    }

    public WebElement getSelectKotaKTP() {
        return this.selectKotaKTP;
    }

    public WebElement getFaskesAwal() {
        return this.faskesAwal;
    }

    public WebElement getFaskesTujuan() {
        return this.faskesTujuan;
    }

    public WebElement getSelectFaskesTujuan() {
        return this.selectFaskesTujuan;
    }

    public WebElement getAlasan() {
        return this.alasan;
    }

//    public void clickSubmit() {
//        this.submit.sendKeys(Keys.RETURN);
//        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
//    }
public void clickSubmit() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();",submit);
}

    public void clickInputDataMenu() {
        this.inputDataMenu.click();
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public void clickKotaKtp() {
        this.kotaKTP.click();
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public void clickFaskesTujuan() {
        this.faskesTujuan.click();
        Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
    }

    public boolean msgErrorBPJSCharacter() {
        return (nobpjs.getAttribute("minlength").toString().contains("13"))  && (nobpjs.getAttribute("maxlength").contains("13"));
    }

    public boolean msgErrorNoKTPCharacter() {
        return (nomKtp.getAttribute("minlength").toString().contains("16"))  && (nomKtp.getAttribute("maxlength").contains("16"));
    }

    public String msgErrorBPJSReady() {
        return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgBPJS);

    }

    public String msgErrorAlamat() {
        return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgAlamat);
    }

    public String msgErrorAlasan() {
        return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgAlasan);
    }

    public String msgAddSuccess() {
        return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgValidSave);
    }

    public String getInputDataTitle() {
        return Utils.driverWaitTxt(driver, Constants.TIMEOUT, inputDataTitle);
    }
    public String getUploadData(){ return uploadData.getAttribute("uploadData");}}
