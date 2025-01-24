// Updated LoginPage.java
package com.bootcamp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    // Field untuk mengisi username
    @FindBy(css = "#user-name")
    WebElement username;

    // Field untuk mengisi password
    @FindBy(xpath = "//*[@id='password']")
    WebElement password;

    // Tombol untuk login
    @FindBy(css = "#login-button")
    WebElement loginButton;

    // Konstruktor untuk inisialisasi elemen halaman login
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method untuk login dengan username dan password yang diberikan
    public void login(String user, String pass) {
        username.sendKeys(user); // Isi username
        password.sendKeys(pass); // Isi password
        loginButton.click(); // Klik tombol login
    }
}