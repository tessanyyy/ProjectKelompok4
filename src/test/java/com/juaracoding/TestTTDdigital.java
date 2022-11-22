package com.juaracoding;


import com.juaracoding.cucumber.pages.LoginSiloam;
import com.juaracoding.cucumber.pages.TTDdigital;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class TestTTDdigital {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private TTDdigital ttDdigital = new TTDdigital();

    private LoginSiloam loginSiloam = new LoginSiloam();

    public TestTTDdigital() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //UPLOAD DATA FASKES AWAL VALID
    @When("Klik button Foto Faskes Awal untuk upload foto dokumen")
    public void klik_uploadfaskesawal() {
        ttDdigital.clickUploadDataFaskesAwal();
        extentTest.log(LogStatus.PASS, "Klik button Foto Faskes Awal untuk upload foto dokumen");
    }

    @And("Klik button choose File")
    public void choose_file() {
        String path = System.getProperty("user.dir") + "\\src\\main\\DataUpload\\FaskesAwal.png";
        ttDdigital.fileUpload(path);
        extentTest.log(LogStatus.PASS, "Klik button choose File");
    }

    @And("Mengambil data foto")
    public void data_foto() {
        Hooks.delay(1);
        ttDdigital.clickSave();
        extentTest.log(LogStatus.PASS, "Mengambil data foto");
    }

    @And("Klik simpan untuk menyimpan foto")
    public void btn_simpan_data() {
        ttDdigital.clickSave();
        extentTest.log(LogStatus.PASS, "Klik simpan untuk menyimpan foto");
    }

    @And("Keluar dari pop up upload foto faskes awal")
    public void keluar_daripopup() {
        ttDdigital.clickKeluar();
        extentTest.log(LogStatus.PASS, "Keluar dari pop up upload foto faskes awal");
    }

    //UPLOAD DATA

    @And("klik button foto faskes tujuan untuk upload data")
    public void klik_uploadfaskesTujuan() {
        Hooks.delay(1);
        ttDdigital.clickUploadDataFaskesTujuan();
        extentTest.log(LogStatus.PASS, "klik button foto faskes tujuan untuk upload datan");
    }

    @And("klik button choose file faskes tujuan")
    public void choose_file_() {
        String path = System.getProperty("user.dir") + "\\src\\main\\DataUpload\\FaskesTujuan.png";
        ttDdigital.fileUpload(path);
        extentTest.log(LogStatus.PASS, "klik button choose file faskes tujuan");
    }

    @And("mengambil data foto faskes tujuan")
    public void data_foto_faskes_tujuan() {
        Hooks.delay(1);
        ttDdigital.clickSave();
        extentTest.log(LogStatus.PASS, "mengambil data foto faskes tujuan");
    }

    @And("klik simpan untuk menympan foto faskes tujuan")
    public void btn_simpan_data_faskes_tujuan() {
        ttDdigital.clickSave();
        extentTest.log(LogStatus.PASS, "klik simpan untuk menympan foto faskes tujuan");
    }

    @And("keluar dari pop up upload foto faskes tujuan")
    public void keluar_daripopup_faskes_tujuan() {
        ttDdigital.clickKeluar();
        extentTest.log(LogStatus.PASS, "keluar dari pop up upload foto faskes tujuan");
    }

    //UPLOAD DATA ttd digital

    @And("klik button foto ttd digital tujuan untuk upload data")
    public void klik_uploadTTDdigital() {
        ttDdigital.clickUploadDataTTDdigital();
        extentTest.log(LogStatus.PASS, "klik button foto ttd digital tujuan untuk upload data");
    }

    @And("klik button choose file ttd digital")
    public void choose_file_ttddigital() {
        String path = System.getProperty("user.dir") + "\\src\\main\\DataUpload\\TTDdigital.png";
        ttDdigital.fileUpload(path);
        extentTest.log(LogStatus.PASS, "klik button choose file ttd digital");
    }

    @And("mengambil data foto ttd digital")

    public void data_foto_TTDdigital() {
        Hooks.delay(1);
        ttDdigital.clickSave();
        extentTest.log(LogStatus.PASS, "mengambil data foto ttd digital");
    }

    @And("klik simpan untuk menympan foto ttd digital")
    public void btn_simpan_data_ttd_digital() {
        ttDdigital.clickSave();
        extentTest.log(LogStatus.PASS, "klik simpan untuk menympan foto ttd digital");
    }

    @And("keluar dari pop up upload foto ttd digital")
    public void keluar_daripopup_ttd_digital() {

        ttDdigital.clickKeluar();
        extentTest.log(LogStatus.PASS, "keluar dari pop up upload foto ttd digital");
    }

    // button selanjutnya

    @Then("klik button selanjutnya")
    public void klik_button_selanjutnya() {
        Hooks.delay(1);
        ttDdigital.buttonSelanjutnya();
        extentTest.log(LogStatus.PASS, "klik button selanjutnya");
    }

    //TTD Digital

    @When("TCC.SILOAM.064 Browser menampilkan form document Nama Karyawan")
    public void tampil_nama() {
        ttDdigital.getTxtNama();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.064 Browser menampilkan form document Nama Karyawan");
    }

    @When("TCC.SILOAM.065 Browser menampilkan form document Nomor BPJS")
    public void tampil_nomorbpjs() {
        ttDdigital.getTxtNoBPJS();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.065 Browser menampilkan form document Nomor BPJS");
    }

    @When("TCC.SILOAM.066 Menampilkan nomor KTP")
    public void tampil_noktp() {
        ttDdigital.getTxtNomorKTP();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.066 Menampilkan nomor KTP");
    }

    @When("TCC.SILOAM.067 Menampilkan alamat")
    public void tampil_alamat() {
        ttDdigital.getTxtAlamat();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.067 Menampilkan alamat");
    }

    @When("TCC.SILOAM.068 Menampilkan Kota KTP")
    public void tampil_kotaktp() {
        ttDdigital.getTxtAlamat();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.068 Menampilkan Kota KTP");
    }

    @When("TCC.SILOAM.069 Menampikan Faskes Awal")
    public void tampil_faskesawal() {
        ttDdigital.getTxtFaskesAwal();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.069 Menampikan Faskes Awal");
    }

    @When("TCC.SILOAM.070 Menampilkan faskes tujuan")
    public void tampil_fasketujuanl() {
        ttDdigital.getTxtFaskesTujuan();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.070 Menampilkan faskes tujuan");
    }

    //Btn Edit

    @When("TCC.SILOAM.071 User klik button edit")
    public void tampil_btnedit() {
        ttDdigital.klikBtnEdit();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.071 User klik button edit");
    }

    // btn Simpan
    @When("TCC.SILOAM.073 user klik button simpan")
    public void tampil_btnSimpan() {
        ttDdigital.setBtnSimpanFormEdit();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.073 user klik button simpan");
    }

    // faskes awal

    @When("TCC.SILOAM.073 Menampilkan dokumen faskes awal yang sudah di upload")
    public void tampil_data_before() {
        ttDdigital.getTxtBefore();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.073 Menampilkan dokumen faskes awal yang sudah di upload");
    }

    // faskes tujuan
    @When("TCC.SILOAM.075 Menampilkan dokumen faskes tujuan yang sudah di upload")
    public void tampil_data_after() {
        ttDdigital.getTxtAfter();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.075 Menampilkan dokumen faskes tujuan yang sudah di upload");
    }

    // auto number

    @When("TCC.SILOAM.076 Menampilkan auto number sesuai dengan data yang sudah di upload")
    public void tampil_no() {
        ttDdigital.getTxtAfter();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.076 Menampilkan auto number sesuai dengan data yang sudah di upload");
    }

    @When("TCC.SILOAM.077 menampilkan tipe dokumen yang sudah di upload")
    public void tampil_tipe_dokumen() {
        ttDdigital.getTxtTipeDokumen();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.077 menampilkan tipe dokumen yang sudah di upload");
    }


    @When("TCC.SILOAM.078 menampilkan file yang sudah di upload")
    public void tampil_tipe_file() {
        ttDdigital.getTxtTFileUpload();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.078 menampilkan file yang sudah di upload");
    }


}
