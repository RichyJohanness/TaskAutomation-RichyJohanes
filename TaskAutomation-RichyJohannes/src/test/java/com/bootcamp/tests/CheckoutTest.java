// Updated CheckoutTest.java
package com.bootcamp.tests;

import com.bootcamp.pages.CheckoutPage;
import com.bootcamp.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckoutTest {
    WebDriver driver;
    LoginPage loginPage;
    CheckoutPage checkoutPage;

    // Setup sebelum test, termasuk membuka browser dan inisialisasi halaman
    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver(); // Membuka browser Chrome
        driver.get("https://www.saucedemo.com/"); // Membuka URL aplikasi
        loginPage = new LoginPage(driver); // Inisialisasi halaman login
        checkoutPage = new CheckoutPage(driver); // Inisialisasi halaman checkout
    }

    // Test untuk melakukan proses checkout
    @Test
    public void testCheckout() throws InterruptedException {
        loginPage.login("standard_user", "secret_sauce"); // Login ke aplikasi
        checkoutPage.completeCheckout("Richy", "Johannes", "2004");
    }

    // Menutup browser setelah test selesai
    @AfterTest
    public void tearDown() {
        driver.quit(); // Menutup browser
    }
}
