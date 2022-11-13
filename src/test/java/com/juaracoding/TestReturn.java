package com.juaracoding;

import com.juaracoding.cucumber.pages.LoginSiloam;
import com.juaracoding.cucumber.pages.MenuNew;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestReturn {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private MenuNew menuNew = new MenuNew();

    private LoginSiloam loginSiloam = new LoginSiloam();

    public TestReturn() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // Test case masuk ke halaman new (return sales)

    @When("Browser menampilkan halaman home siloam")
    public void browser_menampilkan_halaman_home_siloam() {
        driver.get(Constants.URL);
        loginSiloam.login("D6200927", "1997-10-23");
        loginSiloam.setBtnLogin();
        extentTest.log(LogStatus.PASS, "Browser menampilkan halaman home siloam");

    }

    @And("Klik menu new")
    public void user_input_username_password_sales_valid() {
        menuNew.klikMenuNew();
        extentTest.log(LogStatus.PASS, "Klik menu new");
    }


    @Then("Menampilkan halaman return")
    public void user_open_home_page() {
        menuNew.getTxtReturnPage();
        extentTest.log(LogStatus.PASS, "Menampilkan halaman return");
    }

    // Tes Case input tanggal start date

    @When("klik start date")
    public void klik_start_date() {
        menuNew.klikStartDate();
        extentTest.log(LogStatus.PASS, "klik start date");
    }

    @And("input tanggal sesuai data yang akan ditampilkan")
    public void input_tanggal_sesuai_data_yang_akan_ditampilkan() {
        menuNew.datepickerStarDate("2022/11/08");

        extentTest.log(LogStatus.PASS, "input tanggal sesuai data yang akan ditampilkan");
    }

    @Then("berhasil menampilkan input start date")
    public void berhasil_menampilkan_input_start_date() {
        menuNew.tampilstartdate();
        extentTest.log(LogStatus.PASS, "berhasil menampilkan input start date");
    }


}
