package com.swaglabs.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage extends PageObject{

  private static final String URL = "https://www.saucedemo.com/cart.html";

  public CarrinhoPage(WebDriver webdriver) {
    super(webdriver);
  }

  public void listaTelaCarrinhoCompras(){
    webdriver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[1]")).isDisplayed();
  }

  public void valorProdutoCarrinhoCompras(){
    webdriver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).isDisplayed();
  }


  public void botaoCheckout(){
    webdriver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
  }

  public void verificaSeEstaNaTelaDoCarrinho(){
    webdriver.findElement(By.xpath("//*[@id=\"continue\"]")).isDisplayed();
  }

}
