package com.swaglabs.swaglabs.steps.cenario3;

import com.swaglabs.swaglabs.pages.HomePage;
import com.swaglabs.swaglabs.steps.ParentSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cenario3Step extends ParentSteps {

    private HomePage homePage;

  @Dado("^que o usuario tenta fazer o login com o username: \"([^\"]*)\" e password: \"([^\"]*)\"$")
  public void queOUsuarioTentaFazerOLoginComOUsernameEPassword(String username, String password) throws Throwable {
    homePage = new HomePage(webdriver);
    homePage.fazLogin(username, password);
    boolean loginButton = webdriver.findElement(By.xpath("//*[@id='login-button']")).isDisplayed();
    Assert.assertTrue(loginButton);
    webdriver.findElement(By.xpath("//*[@id='login-button']")).click();
      }

  @Entao("^apos feito login apresenta todos os produtos com a mesma imagem \"([^\"]*)\"$")
  public void aposFeitoLoginApresentaTodosOsProdutosComAMesmaImagem(String img) throws Throwable {
    boolean titleProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = 'Products']"))).isDisplayed();
    Assert.assertTrue(titleProducts);
    WebElement image = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='item_4_img_link']/img")));
    boolean imgDisplayed = image.isDisplayed();
    Assert.assertTrue(imgDisplayed);
  }
}
