package com.swaglabs.swaglabs.steps.cenario5;

import com.swaglabs.swaglabs.pages.HomePage;
import com.swaglabs.swaglabs.steps.ParentSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cenario5Step extends ParentSteps {

  private HomePage homePage;

  @Dado("^usuario tenta fazer o login com o username \"([^\"]*)\" e password \"([^\"]*)\"$")
  public void oUsuarioTentaFazerOLoginComOUsernameEPassword(String username, String password) throws Throwable {
    homePage = new HomePage(webdriver);
    homePage.fazLogin(username, password);
    boolean loginButton = webdriver.findElement(By.xpath("//*[@id='login-button']")).isDisplayed();
    Assert.assertTrue(loginButton);
    webdriver.findElement(By.xpath("//*[@id='login-button']")).click();
  }

  @Entao("^apos feito login apresenta imagem \"([^\"]*)\" do produto errado$")
  public void aposFeitoLoginApresentaImagemDoProdutoErrado(String img) throws Throwable {
    boolean titleProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = 'Products']"))).isDisplayed();
    Assert.assertTrue(titleProducts);
    WebElement image = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='item_4_img_link']/img")));
    boolean imgDisplayed = image.isDisplayed();
    Assert.assertTrue(imgDisplayed);
  }
}
