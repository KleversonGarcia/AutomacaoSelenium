package com.swaglabs.swaglabs.steps.cenario4;

import com.swaglabs.swaglabs.pages.HomePage;
import com.swaglabs.swaglabs.steps.ParentSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cenario4Step extends ParentSteps {

    private HomePage homePage;

  @Dado("^que o Usuario tenta fazer o login com o username \"([^\"]*)\" e password \"([^\"]*)\"$")
  public void queOUsuarioTentaFazerOLoginComOUsernameEPassword(String username, String password) throws Throwable {
    homePage = new HomePage(webdriver);
    homePage.fazLogin(username, password);
    boolean loginButton = webdriver.findElement(By.xpath("//*[@id='login-button']")).isDisplayed();
    Assert.assertTrue(loginButton);
    webdriver.findElement(By.xpath("//*[@id='login-button']")).click();

  }

  @Entao("^apos feito login demora para apresentar todos os produtos$")
  public void aposFeitoLoginDemoraParaApresentarTodosOsProdutos() throws InterruptedException {
    boolean productsDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = 'Products']"))).isDisplayed();
    Assert.assertTrue(productsDisplayed);
  }
}
