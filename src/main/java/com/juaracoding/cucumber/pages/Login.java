package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
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

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]")
    WebElement txtValidURL;
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div")
    WebElement txtInvalidUsernamePassword;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElement txtLoginSucces;

    public void login(String username, String password){
        this.username.click();
        this.username.sendKeys(username);
        this.username.click();
        this.password.sendKeys(password);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public String getTxtInvalidURL() {return txtInvalidURL.getText();}

    public String getTxtValidURL() {return txtValidURL.getText();}

    public String getTxtInvalidUsernamePassword() {return txtInvalidUsernamePassword.getText();}

    public String getTxtLoginSuccess(){
        return txtLoginSucces.getText();
    }

}
