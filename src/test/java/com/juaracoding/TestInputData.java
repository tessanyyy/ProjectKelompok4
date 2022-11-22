package com.juaracoding;


import com.juaracoding.cucumber.pages.InputData;
import com.juaracoding.cucumber.pages.LoginSiloam;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestInputData {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private InputData inputData = new InputData();

    private LoginSiloam loginSiloam = new LoginSiloam();

    public TestInputData() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // Test case masuk ke halaman new (return sales)

    @When("TCC.SILOAM.063 Browser menampilkan halaman home siloam")
    public void browser_menampilkan_halaman_home_siloam() {
        driver.get(Constants.URL);
        loginSiloam.login("D6200927", "1997-10-23");
        loginSiloam.setBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.095 Browser menampilkan halaman home siloam");

    }

    @And("TCC.SILOAM.063 Klik menu input")
    public void klik_menu_input() {
        inputData.klikMenuInput();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.095 Klik menu input");
    }


    @Then("TCC.SILOAM.063 Menampilkan halaman input")
    public void get_txt_form_menu() {
        inputData.getTxtRFormInput();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.095 Menampilkan halaman input");
    }

    // input data
    @When("Menampilkan halaman input")
    public void menampilkan_inpt() {
        inputData.getTxtRFormInput();
        extentTest.log(LogStatus.PASS, "Menampilkan halaman input");

    }

    @And("Input nama")
    public void klik_menu_input_nama() {
        inputData.setInputNama("Nagita Slavina");
        extentTest.log(LogStatus.PASS, "Input nama");
    }


    @And("Input nomor bpjs")
    public void klik_menu_input_bpjs() {
        inputData.setInputNomorBPJS("6672539927644");
        extentTest.log(LogStatus.PASS, "Input nomor bpjs");
    }

    @And("input nomor ktp")
    public void klik_menu_input_ktp() {
        inputData.setInputNomotKTP("6412367778000944");
        extentTest.log(LogStatus.PASS, "input nomor ktp");
    }


    @And("input alamat")
    public void klik_menu_input_alamat() {
        inputData.setInputAlamat("Jl Andara");
        extentTest.log(LogStatus.PASS, "input nomor ktp");
    }

    @And("input kota ktp")
    public void klik_menu_input_kotaktp() {
        inputData.setInputKotaKTP("KOTA BEKASI");
        extentTest.log(LogStatus.PASS, "input kota ktp");
    }

    @And("input faskes awal")
    public void klik_menu_input_faskesawal() {
        inputData.setInputFaskesAwal("Bekasi utara");
        extentTest.log(LogStatus.PASS, "input faskes awal");
    }

    @And("input faskes tujuan")
    public void klik_menu_input_faskestujuan() {
        inputData.setInputFaskesTujuan("Clinic Jatimakmur || Kota Bekasi");
        extentTest.log(LogStatus.PASS, "input faskes tujuan");
    }

    @And("klik button simpan data")
    public void btn_simpan_data() {
        inputData.setBtnSimpanData();
        extentTest.log(LogStatus.PASS, "klik button simpan data");
    }

    @Then("masuk halaman upload data")
    public void halaman_upload_data() {
        inputData.getUploadData();
        extentTest.log(LogStatus.PASS, "masuk halaman upload data");
    }

}
