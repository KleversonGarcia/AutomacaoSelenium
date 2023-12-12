package com.swaglabs.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {
    private static final String URL = "https://www.saucedemo.com/";
    private static final String URL_INVENTORY = "inventory.html";

    public HomePage(WebDriver webdriver) {
        super(webdriver);
    }


    public void fazLogin(String username, String password){
        webdriver.get(URL);
        preencherCampoUsuario(username);
        preencherCampoSenha(password);
    }

    public void clickButton(String xpath) {
        webdriver.findElement(By.xpath(xpath)).click();
    }

    private void preencherCampoUsuario(String username) {
        webdriver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(username);
    }
    private void preencherCampoSenha(String password) {
        webdriver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
    }

    public void verificaSeEstaNaHomePage(){
        webdriver.findElement(By.xpath("//input[@id='login-button']")).isDisplayed();
    }
}
