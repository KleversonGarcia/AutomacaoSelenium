package com.swaglabs.swaglabs.steps.cenario1;

import com.swaglabs.swaglabs.pages.HomePage;
import com.swaglabs.swaglabs.steps.ParentSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cenario1Step extends ParentSteps {


  private HomePage homePage;


  @Dado("^que o usuario faz o login com o username \"([^\"]*)\" e password \"([^\"]*)\"$")
  public void queOUsuarioFazOLoginComOUsernameEPassword(String username, String password) throws Throwable {
    homePage = new HomePage(webdriver);
    homePage.fazLogin(username, password);
    boolean loginButton = webdriver.findElement(By.xpath("//*[@id='login-button']")).isDisplayed();
    Assert.assertTrue(loginButton);
    webdriver.findElement(By.xpath("//*[@id='login-button']")).click();
  }

  @Quando("^seleciona o produto e clica em comprar$")
  public void selecionaOProdutoEClicaEmComprar() throws InterruptedException {
    webdriver.navigate().to("https://www.saucedemo.com/inventory.html");
    String titleProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = 'Products']"))).getText();
    webdriver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
    webdriver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
    String currentUrl = webdriver.getCurrentUrl();
    Assert.assertEquals("https://www.saucedemo.com/inventory.html",currentUrl);
    Assert.assertEquals("Products",titleProducts);
    webdriver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
  }

  @Entao("^valida se os valores do carrinho esta correto$")
  public void validaSeOsValoresDoCarrinhoEstaCorreto() throws InterruptedException {
    webdriver.navigate().to("https://www.saucedemo.com/cart.html");
    boolean titleCart = webdriver.findElement(By.xpath("//*[text() = 'Your Cart']")).isDisplayed();//.getText();
    boolean priceBikeLight = webdriver.findElement(By.xpath("//*[text() = '9.99']")).isDisplayed();//.getText();
    boolean priceOnesie = webdriver.findElement(By.xpath("//*[text() = '7.99']")).isDisplayed();//.getText();
    Assert.assertTrue(titleCart);
    Assert.assertTrue(priceBikeLight);
    Assert.assertTrue(priceOnesie);
    boolean telaCarrinho = webdriver.findElement(By.xpath("//*[text() = 'Checkout']")).isDisplayed();
    Assert.assertTrue(telaCarrinho);
    webdriver.findElement(By.xpath("//*[text() = 'Checkout']")).click();
    webdriver.navigate().to("https://www.saucedemo.com/checkout-step-one.html");
    webdriver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("harry");
    webdriver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("potter");
    webdriver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("00000000");
    boolean buttonContinue = webdriver.findElement(By.xpath("//input[@id='continue']")).isDisplayed();
    Assert.assertTrue(buttonContinue);
    webdriver.findElement(By.xpath("//input[@id='continue']")).click();
    webdriver.navigate().to("https://www.saucedemo.com/checkout-step-two.html");
    boolean titleCheckoutCart = webdriver.findElement(By.xpath("//*[text() = 'Checkout: Overview']")).isDisplayed();
    Assert.assertTrue(titleCheckoutCart);
    boolean total = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = '19.42']"))).isDisplayed();//.getText();
    Assert.assertTrue(total);
    webdriver.findElement(By.xpath("//button[@id='finish']")).click();
    boolean tks = webdriver.findElement(By.xpath("//*[text() = 'Thank you for your order!']")).isDisplayed();
    Assert.assertTrue(tks);
  }

  @E("^faz o logoff$")
  public void fazOLogoff() throws InterruptedException {
    webdriver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logout_sidebar_link']"))).click();
  }
}
