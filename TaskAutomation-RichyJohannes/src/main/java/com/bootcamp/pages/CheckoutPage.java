// Updated CheckoutPage.java
package com.bootcamp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    // Tombol untuk menambahkan item ke keranjang belanja
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton;

    // Tombol untuk membuka keranjang belanja
    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    WebElement cartButton;

    // Tombol untuk memulai proses checkout
    @FindBy(css = "#checkout")
    WebElement checkoutButton;

    // Field untuk mengisi nama depan
    @FindBy(xpath = "//*[@id='first-name']")
    WebElement firstName;

    // Field untuk mengisi nama belakang
    @FindBy(css = "#last-name")
    WebElement lastName;

    // Field untuk mengisi kode pos
    @FindBy(xpath = "//*[@id='postal-code']")
    WebElement postalCode;

    // Tombol untuk melanjutkan proses checkout
    @FindBy(css = "#continue")
    WebElement continueButton;

    // Tombol untuk menyelesaikan proses checkout
    @FindBy(xpath = "//*[@id='finish']")
    WebElement finishButton;

    // Konstruktor untuk inisialisasi elemen halaman checkout
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method untuk menyelesaikan proses checkout dengan data yang diberikan
    public void completeCheckout(String first, String last, String zip) {
        addToCartButton.click(); // Klik tombol tambah ke keranjang
        cartButton.click(); // Klik tombol buka keranjang
        checkoutButton.click(); // Klik tombol checkout
        firstName.sendKeys(first); // Isi nama depan
        lastName.sendKeys(last); // Isi nama belakang
        postalCode.sendKeys(zip); // Isi kode pos
        continueButton.click(); // Klik tombol lanjutkan
        finishButton.click(); // Klik tombol selesai
    }
}