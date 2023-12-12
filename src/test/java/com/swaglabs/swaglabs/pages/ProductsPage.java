package com.swaglabs.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends PageObject {
    private static final String URL = "https://www.saucedemo.com/inventory.html";

    public ProductsPage(WebDriver webdriver) {
        super(webdriver);
    }

    public void verificaSeLogouNaTelaProdutos() throws InterruptedException {
        Thread.sleep(5000);
        webdriver.findElement(By.xpath("//span[@class='title'='Products']")).isDisplayed();
    }
    public void listaProdutos() throws InterruptedException {
        Thread.sleep(5000);
        webdriver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='cart_contents_container']/div/div[@class='cart_list']/div[3]/div[2]")).isDisplayed();
    }

    public void addNoCarrinho() throws InterruptedException {
        Thread.sleep(5000);
        webdriver.findElement(By.xpath("//div[@class='inventory_list']")).isDisplayed();
    }
}
