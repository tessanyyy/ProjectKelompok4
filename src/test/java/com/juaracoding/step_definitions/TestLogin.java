package com.juaracoding.step_definitions;

import com.juaracoding.cucumber.pages.Login;
import com.juaracoding.cucumber.utils.Constants;
import com.juaracoding.step_definitions.Hooks;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private Login login = new Login();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test Case Invalid URL
    @When("TCC.SILOAM.001 Mengakses invalid URL")
    public void mengakses_invalid_URL() {
        driver.get(Constants.INVALID_URL);
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.001 Mengakses invalid URL");
    }

    @Then("TCC.SILOAM.001 Web not found")
    public void web_not_found() {
        Assert.assertEquals(login.getTxtInvalidURL(), "Not Found");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.001 Web not found");
    }

    //Test Case Valid URL
    @When("TCC.SILOAM.002 Mengakses valid URL")
    public void mengakses_valid_URL() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.002 Mengakses valid URL");
    }

    @Then("TCC.SILOAM.002 Berhasil mengakses web siloam")
    public void berhasil_mengakses_web_siloam() {
        Assert.assertEquals(login.getTxtValidURL(), "DIKA | SILOAM");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.002 Berhasil mengakses web siloam");
    }

    //Test Case Input invalid username password
    @When("TCC.SILOAM.003 Mengisi username password tidak sesuai")
    public void mengisi_username_password_tidak_sesuai() {
        login.login("Admin", "198304");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.003 Mengisi username password tidak sesuai");
    }

    @And("TCC.SILOAM.003 Klik tombol login invalid")
    public void klik_tombol_login_invalid(){
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.003 Klik tombol login invalid");
    }

    @Then("TCC.SILOAM.003 Login invalid")
    public void login_invalid() {
        Assert.assertEquals(login.getTxtInvalidUsernamePassword(), "");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.003 Login invalid");
    }

    //Test Case Username password kosong
    @When("TCC.SILOAM.004 Tidak mengisi username password")
    public void tidak_mengisi_username_password() {
        login.login("", "");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.004 Tidak mengisi username password");
    }

    @And("TCC.SILOAM.004 Klik button login input kosong")
    public void klik_button_login_input_kosong() {
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.004 Klik button login input kosong");
    }

    @Then("TCC.SILOAM.004 Login gagal")
    public void login_gagal() {
        Assert.assertEquals(login.getTxtUsernameRequired(), "true");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.004 Login gagal");
    }

    //Test Case Username password valid sales
    @When("TCC.SILOAM.005 Mengisi username password sales sesuai yang sudah di daftarkan")
    public void mengisi_username_password_sales_sesuai_yang_sudah_di_daftarkan() {
        login.login("D6200927", "1997-10-23");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.004 Mengisi username password sales sesuai yang sudah di daftarkan");
    }

    @And("TCC.SILOAM.005 Klik button login valid sales")
    public void klik_button_login_valid_sales() {
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.004 Klik button login valid sales");
    }

    @Then("TCC.SILOAM.005 Berhasil login")
    public void berhasil_login() {
        Assert.assertEquals(login.getTxtLoginSuccess(), "Home");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.004 Berhasil login");
    }

    //Test case logout
    @When("TCC.SILOAM.006 Klik profile")
    public void klik_profile() {
        login.klikProfile();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.006 Klik profile");
    }

    @And("TCC.SILOAM.006 Klik button logout")
    public void klik_button_logout() {
        login.clickBtnLogout();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.006 Klik button logout");
    }

    @Then("TCC.SILOAM.006 Berhasil logout")
    public void berhasil_logout(){
        Assert.assertEquals(login.getTxtLogout(), "DIKA | SILOAM");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.006 Berhasil logout");
    }

    //Test Case Username password valid admin
    @When("TCC.SILOAM.007 Mengisi username password admin sesuai yang sudah di daftarkan")
    public void mengisi_username_password_admin_sesuai_yang_sudah_di_daftarkan() {
        login.login("admindika", "d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.007 Mengisi username password admin sesuai yang sudah di daftarkan");
    }

    @And("TCC.SILOAM.007 Klik button login valid admin")
    public void klik_button_login_valid_admin() {
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.007 Klik button login valid admin");
    }

    @Then("TCC.SILOAM.007 Berhasil login admin")
    public void berhasil_login_admin() {
        Assert.assertEquals(login.getTxtLoginSuccess(), "Home");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.007 Berhasil login admin");
    }
}
