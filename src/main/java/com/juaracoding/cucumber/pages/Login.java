package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/h1")
    WebElement txtInvalidURL;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div[1]/b")
    WebElement txtValidURL;
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div")
    WebElement txtInvalidUsernamePassword;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/form/div[1]/input")
    WebElement txtUsernameRequired;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/form/div[2]/input")
    WebElement txtPasswordRequired;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement txtLoginSucces;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div[1]/b")
    WebElement txtLogout;

    @FindBy(xpath = "//*[@id=\"header\"]/ul/li/a")
    WebElement profile;

    @FindBy(xpath = "//*[@id=\"header\"]/ul/li/div/a")
    WebElement btnLogout;


    public void login(String username, String password){
        this.username.click();
        this.username.sendKeys(username);
        this.username.click();
        this.password.sendKeys(password);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public void clickBtnLogout() {
        btnLogout.click();
    }

    public String getTxtInvalidURL() {
        return txtInvalidURL.getText();}

    public String getTxtValidURL() {
        return txtValidURL.getText();}

    public String getTxtInvalidUsernamePassword() {
        return txtInvalidUsernamePassword.getText();}

    public String getTxtUsernameRequired(){
        return txtUsernameRequired.getAttribute("required");
    }

    public String getTxtPasswordRequired(){
        return txtPasswordRequired.getAttribute("required");
    }

    public String getTxtLoginSuccess(){
        return txtLoginSucces.getText();
    }

    public void klikProfile(){
        this.profile.click();
    }

    public String getTxtLogout(){
        return txtLogout.getText();
    }


}
