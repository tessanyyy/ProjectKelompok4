package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TTDdigital {
    private WebDriver driver;
    private WebElement sendKeyStatus;

    public TTDdigital() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    // Upload Data
    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    WebElement uploadDocumentTitle;

    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    WebElement uploadImgAwal;

    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    WebElement uploadImgTujuan;

    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    WebElement uploadImgTTD;

    @FindBy(xpath = "//h4[@class='modal-title']")
    WebElement modalTitle;

    @FindBy(xpath = "//img[@id='previewing']")
    WebElement previewImgModal;

    @FindBy(xpath = "//div[@id='message']")
    WebElement msgErrorSave;

    @FindBy(xpath = "//p[@id='error']")
    WebElement msgErrorChooseFile;

    @FindBy(xpath = "//span[@id='error_message']")
    WebElement noteErrorChooseFile;

    @FindBy(xpath = "//input[@id='file']")
    WebElement file;

    @FindBy(xpath = "//button[@id='btnSave']")
    WebElement save;

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancel;

    @FindBy(xpath = "/html/body/div[7]/div/div[3]/div/button")
    WebElement keluar;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement ok;

    @FindBy(xpath = "//*[@id=\"default-tab-2\"]/div[2]/div/div/a")
    WebElement selanjutnya;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/ul/li[3]/a/b/span[2]")
    WebElement getTxtPageTTDdigital;

    //TTD Digital


    @FindBy(xpath = "//*[@id=\"applicant_form\"]/div/div[2]/label")
    WebElement tampilNama;

    @FindBy(xpath = "//*[@id=\"applicant_form\"]/div/div[3]/label")
    WebElement tampilNomorBPJS;

    @FindBy(xpath = "//*[@id=\"applicant_form\"]/div/div[4]/label")
    WebElement tampilNomorKTP;

    @FindBy(xpath = "//*[@id=\"applicant_form\"]/div/div[5]/label")
    WebElement tampilAlamat;

    @FindBy(xpath = "//*[@id=\"applicant_form\"]/div/div[6]/label")
    WebElement tampilKotaKTP;

    @FindBy(xpath = "//*[@id=\"applicant_form\"]/div/div[7]/label")
    WebElement tampilFaskesAwal;

    @FindBy(xpath = "//*[@id=\"applicant_form\"]/div/div[8]/label")
    WebElement tampilFaskesTujuan;

    @FindBy(xpath = "//*[@id=\"btnEdit\"]")
    WebElement btnEdit;

    @FindBy(xpath = "//*[@id=\"btnUpdate\"]")
    WebElement btnSimpanFormEdit;

    @FindBy(xpath = "//input[@id='name']")
    WebElement editNama;

    @FindBy(xpath = "//*[@id=\"default-tab-3\"]/div[1]/div[2]/div/div[2]/div[1]/div/h4]")
    WebElement tampilBefore;

    @FindBy(xpath = "//*[@id=\"default-tab-3\"]/div[1]/div[2]/div/div[2]/div[2]/div/h4")
    WebElement tampilAfter;

    @FindBy(xpath = "//*[@id=\"default-tab-3\"]/div[1]/div[2]/div/div[2]/div[3]/div/h4")
    WebElement tampilTTD;

    @FindBy(xpath = "//*[@id=\"default-tab-3\"]/div[1]/div[2]/div/div[2]/div[2]/div/h4")
    WebElement autoNumber;

    @FindBy(xpath = "//*[@id=\"default-tab-3\"]/div[1]/div[2]/div/div[2]/div[3]/div/h4")
    WebElement tipeDokumen;

    @FindBy(xpath = "//*[@id=\"default-tab-3\"]/div[1]/div[2]/div/div[2]/div[2]/div/h4")
    WebElement fileUpload;

    @FindBy(xpath = "//*[@id=\"default-tab-3\"]/div[1]/div[2]/div/div[2]/div[3]/div/h4")
    WebElement kontrol;


    @FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[1]/td[4]/a")
    WebElement addFiles;


// upload file


    public void clickUploadDataFaskesAwal() {
        uploadImgAwal.click();
    }

    public void clickUploadDataFaskesTujuan() {
        uploadImgTujuan.click();
    }

    public void clickUploadDataTTDdigital() {
        uploadImgTTD.click();
    }

    public void fileUpload(String path) {
        file.sendKeys(path);
    }

    public void clickSave() {
        save.click();
    }


    public void clickKeluar() {
        this.keluar.sendKeys(Keys.RETURN);
    }

    public void buttonSelanjutnya() {
        selanjutnya.click();
        Alert selanjutnya = driver.switchTo().alert();
        System.out.println(selanjutnya.getText());
        selanjutnya.accept();
    }


    // TTD Digital

    public String getTxtNama() {
        return tampilNama.getAttribute("Nama");
    }

    public String getTxtNoBPJS() {
        return tampilNomorBPJS.getAttribute("Nomor BPJS");
    }

    public String getTxtNomorKTP() {
        return tampilNomorKTP.getAttribute("Nomor KTP");
    }

    public String getTxtAlamat() {
        return tampilAlamat.getAttribute("Alamat");
    }

    public String getTxtKotaKTP() {
        return tampilKotaKTP.getAttribute("Kota KTP");
    }

    public String getTxtFaskesAwal() {
        return tampilFaskesAwal.getAttribute("Faskes Awal");
    }

    public String getTxtFaskesTujuan() {
        return tampilFaskesTujuan.getAttribute("Faskes Tujuan");
    }

    public void klikBtnEdit() {
        btnEdit.click();
    }

    public void editNama(String nama) {
        this.editNama.sendKeys(nama);
    }

    public void setBtnSimpanFormEdit() {
        btnSimpanFormEdit.click();
    }

    public String getTxtBefore() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 150)");
        return tampilBefore.getAttribute("1. Before");
    }

    public String getTxtAfter() {
        return tampilAfter.getAttribute("2. After");
    }

    public String getTxtTTD() {
        return tampilTTD.getAttribute("3. TTD");
    }

    public String getTxtNo() {
        return autoNumber.getAttribute("No");
    }

    public String getTxtTipeDokumen() {
        return tipeDokumen.getAttribute("Tipe Dokumen");
    }

    public String getTxtTFileUpload() {
        return fileUpload.getAttribute("File Upload");
    }


}
