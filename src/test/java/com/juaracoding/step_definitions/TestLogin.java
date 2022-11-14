package com.juaracoding.step_definitions;

import com.juaracoding.cucumber.pages.Login;
import com.juaracoding.cucumber.utils.Constants;
import com.juaracoding.step_definitions.Hooks;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
    public void Mengakses_invalid_URL() {
        driver.get(Constants.INVALID_URL);
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.001 Mengakses invalid URL");
    }

    @Then("TCC.SILOAM.001 Web 404 not found")
    public void Web_404_not_found() {
        Assert.assertEquals(login.getTxtInvalidURL(), "404 not found");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.001 Web 404 not found");
    }

    //Test Case Valid URL
    @When("TCC.SILOAM.002 Mengakses valid URL")
    public void Mengakses_valid_URL() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.002 Mengakses valid URL");
    }

    @Then("TCC.SILOAM.002 Berhasil mengakses web siloam")
    public void Berhasil_mengakses_web_siloam() {
        Assert.assertEquals(login.getTxtValidURL(), "Berhasil mengakses web siloam");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.002 Berhasil mengakses web siloam");
    }

    //Test Case Input invalid username password
    @When("TCC.SILOAM.003 Mengisi username password tidak sesuai")
    public void Mengisi_username_password_tidak_sesuai() {
        login.login("Admin", "198304");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.003 Mengisi username password tidak sesuai");
    }

    @And("TCC.SILOAM.003 Klik tombol login invalid")
    public void Klik_tombol_login_invalid(){
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.003 Klik tombol login invalid");
    }

    @Then("TCC.SILOAM.003 Login invalid")
    public void Login_invalid() {
        Assert.assertEquals(login.getTxtInvalidUsernamePassword(), "Login invalid");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.003 Login invalid");
    }

    //Test Case Username password valid
    @When("TCC.SILOAM.004 Mengisi username password sesuai yang sudah di daftarkan")
    public void Mengisi_username_password_sesuai_yang_sudah_di_daftarkan() {
        login.login("admindika", "d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.004 Mengisi username password sesuai yang sudah di daftarkan");
    }

    @And("TCC.SILOAM.004 Klik button login valid")
    public void Klik_button_login_valid() {
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.004 Klik button login valid");
    }

    @Then("TCC.SILOAM.004 Berhasil login")
    public void Berhasil_login() {
        Assert.assertEquals(login.getTxtLoginSuccess(), "Berhasil login");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.004 Berhasil login");
    }
}
