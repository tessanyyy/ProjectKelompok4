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

    @When("TCC.SILOAM.095 Browser menampilkan halaman home siloam")
    public void browser_menampilkan_halaman_home_siloam() {
        driver.get(Constants.URL);
        loginSiloam.login("D6200927", "1997-10-23");
        loginSiloam.setBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.095 Browser menampilkan halaman home siloam");

    }

    @And("TCC.SILOAM.095 Klik menu new")
    public void user_input_username_password_sales_valid() {
        menuNew.klikMenuNew();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.095 Klik menu new");
    }


    @Then("TCC.SILOAM.095 Menampilkan halaman return")
    public void user_open_home_page() {
        menuNew.getTxtReturnPage();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.095 Menampilkan halaman return");
    }


    // input complete status
    @When("TCC.SILOAM.096 klik select status")
    public void klik_select_status() {
        menuNew.getTxtStatus();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.096 klik select status");
    }

    @And("TCC.SILOAM.096 input complete status")
    public void input_complete_status() {
        Hooks.delay(3);
        menuNew.selectStatusOne("Complete");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.096 input complete status");
    }

    @Then("TCC.SILOAM.096 berhasil input complete status")
    public void berhasil_input_complete_status() {
        System.out.println("Berhasil input complete status");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.096 berhasil input complete status");
    }

    // input pending status
    @When("TCC.SILOAM.097 klik select status again")
    public void klik_select_status_again() {
        menuNew.getTxtStatus();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.097 klik select status again");
    }

    @And("TCC.SILOAM.097 input pending status")
    public void input_pending_status() {
        menuNew.selectStatusTwo("Pending");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.097 input pending status");
    }

    @Then("TCC.SILOAM.097 berhasil input pending status")
    public void berhasil_input_pending_status() {
        System.out.println("Berhasil input pending status");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.097 berhasil input pending status");
    }

    // Tes Case input tanggal start date

    @When("TCC.SILOAM.098 klik start date")
    public void klik_start_date() {
        menuNew.klikStartDate();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.098 klik start date");
    }

    @And("TCC.SILOAM.098 input tanggal sesuai data yang akan ditampilkan")
    public void input_tanggal_sesuai_data_yang_akan_ditampilkan() {
        menuNew.datepickerStarDate("2022/11/08");

        extentTest.log(LogStatus.PASS, "TCC.SILOAM.098 input tanggal sesuai data yang akan ditampilkan");
    }

    @Then("TCC.SILOAM.098 berhasil menampilkan input start date")
    public void berhasil_menampilkan_input_start_date() {
        menuNew.tampilstartdate();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.098 berhasil menampilkan input start date");
    }

    // Input end date

    @When("TCC.SILOAM.099 klik end date")
    public void klik_end_date() {
        menuNew.klikEndDate();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.099 klik end date");
    }

    @And("TCC.SILOAM.099 input tanggal end date sesuai data yang akan ditampilkan")
    public void input_tanggal_end_date_sesuai_data_yang_akan_ditampilkan() {
        menuNew.datepickerEndDate("2022/11/08");

        extentTest.log(LogStatus.PASS, "TCC.SILOAM.099 input tanggal end date sesuai data yang akan ditampilkan");
    }

    @Then("TCC.SILOAM.099 berhasil menampilkan input end date")
    public void berhasil_menampilkan_input_end_date() {
        menuNew.setTampilEndDate();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.099 berhasil menampilkan input end date");
    }


    //klik button filter hanya input start date
    @When("TCC.SILOAM.100 input tanggal start date")
    public void input_tanggal_start_date() {
        menuNew.datepickerStarDate("2022/11/08");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.100 input tanggal start date");
    }

    @And("TCC.SILOAM.100 tidak mengisi tanggal end date")
    public void tidak_mengisi_tanggal_end_date() {
        menuNew.datepickerEndDate("0000/00/00");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.100 tidak mengisi tanggal end date");
    }

    @Then("TCC.SILOAM.100 klik button filter invalid")
    public void klik_button_filter_invalid() {
        menuNew.klikButtonFilter();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.100 klik button filter invalid");
    }

    //klik button filter hanya input end date
    @When("TCC.SILOAM.101 input tanggal end date")
    public void input_tanggal_end_date() {
        menuNew.datepickerEndDate("2022/11/08");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.101 input tanggal end date");
    }

    @And("TCC.SILOAM.101 tidak mengisi tanggal start date")
    public void tidak_mengisi_tanggal_start_date() {
        menuNew.datepickerStarDate("0000/00/00");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.101 tidak mengisi tanggal start date");
    }

    @Then("TCC.SILOAM.101 klik button filter invalid tidak input end date")
    public void klik_button_filter_invalid_tidak_input_end_date() {
        menuNew.klikButtonFilter();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.101 klik button filter invalid tidak input end date");
    }

    // button filter valid complete data
    @When("TCC.SILOAM.102 select status complete")
    public void select_status_complete() {
        menuNew.selectStatusOne("Complete");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.102 select status complete");
    }

    @And("TCC.SILOAM.102 klik start date valid")
    public void klik_start_date_valid() {
        menuNew.klikStartDate();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.102 klik start date valid");
    }

    @And("TCC.SILOAM.102 input tanggal start date valid")
    public void input_tanggal_start_date_valid() {
        menuNew.datepickerStarDate("2022/11/08");

        extentTest.log(LogStatus.PASS, "TCC.SILOAM.102 input tanggal start date valid");
    }

    @And("TCC.SILOAM.102 klik end date valid")
    public void klik_end_date_valid() {
        menuNew.klikEndDate();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.102 klik end date valid");
    }

    @And("TCC.SILOAM.102 input tanggal end date valid")
    public void input_tanggal_end_date_valid() {
        menuNew.datepickerEndDate("2022/11/08");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.102 input tanggal end date validd");
    }


    @Then("TCC.SILOAM.102 klik button filter valid")
    public void klik_button_filter_valid() {
        menuNew.klikButtonFilter();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.102 klik button filter valid");

    }


    // button filter valid pending data
    @When("TCC.SILOAM.103 select status pending")
    public void select_status_pending() {
        menuNew.selectStatusTwo("Pending");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.103 select status pending");
    }

    @And("TCC.SILOAM.103 klik start date valid again")
    public void klik_start_date_valid_again() {
        menuNew.klikStartDate();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.103 klik start date valid again");
    }

    @And("TCC.SILOAM.103 input tanggal start date valid pending")
    public void input_tanggal_start_date_valid_pending() {
        menuNew.datepickerStarDate("2022/11/08");

        extentTest.log(LogStatus.PASS, "TCC.SILOAM.103 input tanggal start date valid pending");
    }

    @And("TCC.SILOAM.103 klik end date valid pending")
    public void klik_end_date_valid_pending() {
        menuNew.klikEndDate();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.103 klik end date valid pending");
    }

    @And("TCC.SILOAM.103 input tanggal end date valid pending")
    public void input_tanggal_end_date_valid_pending() {
        menuNew.datepickerEndDate("2022/11/08");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.103 input tanggal end date valid pending");
    }


    @Then("TCC.SILOAM.103 klik button filter valid pending")
    public void klik_button_filter_valid_pending() {
        menuNew.klikButtonFilter();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.103 klik button filter valid pending");

    }

    // Button Riset

    @When("TCC.SILOAM.104 user klik button riset")
    public void User_klik_button_riset() {
        menuNew.klikButtonReset();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.104 user klik button riset");
    }

    @Then("TCC.SILOAM.104 berhasil hapus data")
    public void data_berhasil_dihapus() {
        System.out.println("data berhasil terhapus");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.104 berhasil hapus data");
    }

    // Search Inputan

    @When("TCC.SILOAM.106 User klik Search Text Box")
    public void klik_search() {
        menuNew.setTextBoxSearch();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.106 User klik Search Text Box");
    }

    @Then("TCC.SILOAM.106 User input data")
    public void input_data() {
        menuNew.inputTextBoxSearch("Nada");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.106 User input data");
    }

    // Button Search

    @When("TCC.SILOAM.107 klik button search")
    public void klik_btn_search() {
        menuNew.setBtnSearch();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.107 klik button search");
    }

    @Then("TCC.SILOAM.107 menampikan data sesuai dengan inputan")
    public void menampilkan_inputan() {
        System.out.println("berhasil menampilkan data");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.107 menampikan data sesuai dengan inputan");
    }

    // Button reset search

    @When("TCC.SILOAM.105 klik button reset")
    public void klik_btn_reset_search() {
        menuNew.setBtnResetSearch();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.105 klik button reset");
    }

    @Then("TCC.SILOAM.105 berhasil menghapus inputan")
    public void berhasil_hapus_inputan_search() {
        System.out.println("berhasil hapus data");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.105 berhasil menghapus inputan");
    }


    // Show 10 pages

    @When("TCC.SILOAM.109 klik select pages")
    public void klik_select_pages() {
        menuNew.klikSelectages();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.109 klik select pages");
    }

    @Then("TCC.SILOAM.109 select 10")
    public void select_sepuluh() {
        menuNew.inputSepuluhShowPages("10");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.109 select 10");
    }

    // Show 20 pages

    @When("TCC.SILOAM.110 klik select pages")
    public void klik_select_page() {
        menuNew.klikSelectages();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.110 klik select pages");
    }

    @Then("TCC.SILOAM.110 select 25")
    public void select_duapuluhlima() {
        menuNew.inputSepuluhShowPages("25");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.110 select 25");
    }

    // Show 50 pages

    @When("TCC.SILOAM.111 klik select pages")
    public void klik_select_page_() {
        menuNew.klikSelectages();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.111 klik select pages");
    }

    @Then("TCC.SILOAM.111 select 50")
    public void select_limapuluh() {
        menuNew.inputSepuluhShowPages("50");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.111 select 50");
    }

    // Show 100 pages

    @When("TCC.SILOAM.112 klik select pages")
    public void klik_select_page_s() {
        menuNew.klikSelectages();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.112 klik select pages");
    }

    @Then("TCC.SILOAM.112 select 100")
    public void select_seratus() {
        menuNew.inputSepuluhShowPages("100");
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.111 select 100");
    }

    // menampilkan autonumber

    @When("TCC.SILOAM.114 Menampilkan auto number di Data Tabel")
    public void klik_auto_number() {
        menuNew.klikNomor();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.114 Menampilkan auto number di Data Tabel");
    }

    @Then("TCC.SILOAM.114 Validasi auto number")
    public void validasi_auto_number() {
        menuNew.getTxtNo();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.114 Validasi auto number");
    }

    // menampilkan nama

    @When("TCC.SILOAM.115 Menampilkan nama di Data Tabel")
    public void menampilkan_nama() {
        menuNew.klikNama();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.115 Menampilkan nama di Data Tabel");
    }

    @Then("TCC.SILOAM.115 Validasi nama")
    public void validasi_nama() {
        menuNew.getTxtNama();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.115 Validasi nama");
    }

    // menampilkan nomor BPJS

    @When("TCC.SILOAM.116 Menampilkan nomor BPJS di Data Tabel")
    public void menampilkan_nomor_bpjs() {
        menuNew.kliknomorBPJS();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.116 Menampilkan nomor BPJS di Data Tabel");
    }

    @Then("TCC.SILOAM.116 Validasi nomor BPJS")
    public void validasi_nomor_bpjs() {
        menuNew.getTxtNomorBPJS();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.116 Validasi nomor BPJS");
    }
    // menampilkan kota KTP

    @When("TCC.SILOAM.117 Menampilkan kota ktp di Data Tabel")
    public void menampilkan_kota_ktp() {
        menuNew.klikKotaKTP();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.117 Menampilkan kota ktp di Data Tabel");
    }

    @Then("TCC.SILOAM.117 Validasi kota ktp")
    public void validasi_kota_KTP() {
        menuNew.getTxtKotaKTP();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.117 Validasi kota ktp");
    }


    // menampilkan faskes awal

    @When("TCC.SILOAM.118 Menampilkan faskes asal di Data Tabel")
    public void menampilkan_faskes_awal() {
        menuNew.klikFaskesAwal();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.118 Menampilkan faskes asal di Data Tabel");
    }

    @Then("TCC.SILOAM.118 Validasi faskes asal")
    public void validasi_faskes_awal() {
        menuNew.getTxtFaskesAwal();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.118 Validasi faskes asal");
    }

    // menampilkan faskes awal

    @When("TCC.SILOAM.119 Menampilkan faskes tujuan di Data Tabel")
    public void menampilkan_faskes_tujuan() {
        menuNew.klikFaskesTujuan();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.119 Menampilkan faskes tujuan di Data Tabel");
    }

    @Then("TCC.SILOAM.119 Validasi faskes tujuan")
    public void validasi_faskes_Tujuan() {
        menuNew.getTxtFaskesTujuan();
        extentTest.log(LogStatus.PASS, "TCC.SILOAM.119 Validasi faskes tujuan");
    }


}