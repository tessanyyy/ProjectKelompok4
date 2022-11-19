package com.juaracoding;

import com.juaracoding.cucumber.pages.InputDataPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class InputData_Siloam {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private InputDataPage inputDataPage = new InputDataPage();

    public InputData_Siloam() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;

    }

    //Klik navigation menu input
    @When("user ke halaman web siloam")
    public void user_go_to_Web_SILOAM() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "user ke halaman web siloam");
    }
    @Then("klik navigation menu input")
    public void user_click_navmenu_input() {
        inputDataPage.clickInputDataMenu();
        extentTest.log(LogStatus.PASS, "klik navigation menu input");
    }
    //Mengisi nama
    @When("Mengisi data valid siloam")
    public void mengisi_datavalid() throws AWTException {
        inputDataPage.inputDataValid("Elvarin","0987656789098", "098765443455677","Jl margonda", "KOTA JAKARTA SELATAN", "Depok", "Jakarta Selatan", "test");
                extentTest.log(LogStatus.PASS, "Mengisi data valid siloam");
    }
    @And("klik submit")
    public void submit() {
        inputDataPage.clickSubmit();
        extentTest.log(LogStatus.PASS, "klik submit");
    }
    @Then("melanjutkan ke upload data")
    public void open_uploaddata() {
        inputDataPage.getUploadData();
        extentTest.log(LogStatus.PASS, "melanjutkan ke upload data");
    }

}





