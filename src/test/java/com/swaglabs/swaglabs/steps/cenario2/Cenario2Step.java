package com.swaglabs.swaglabs.steps.cenario2;

import com.swaglabs.swaglabs.pages.HomePage;
import com.swaglabs.swaglabs.steps.ParentSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cenario2Step extends ParentSteps {

  private HomePage homePage;


  @Dado("^que o usuario tenta fazer o login com o username \"([^\"]*)\" e password \"([^\"]*)\"$")
  public void queOUsuarioTentaFazerOLoginComOUsernameEPassword(String username, String password) throws Throwable {
    homePage = new HomePage(webdriver);
    homePage.fazLogin(username, password);
    boolean loginButton = webdriver.findElement(By.xpath("//*[@id='login-button']")).isDisplayed();
    Assert.assertTrue(loginButton);
    webdriver.findElement(By.xpath("//*[@id='login-button']")).click();
  }

  @Entao("^entao recebe a mensagem \"([^\"]*)\" de erro$")
  public void entaoRecebeADeErro(String mensagem) throws Throwable {
    WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@data-test='error']")));
    String msgTxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@data-test='error']"))).getText();
    boolean imgDisplayed = msg.isDisplayed();
    Assert.assertTrue(imgDisplayed);
    Assert.assertEquals(mensagem,msgTxt);
  }
}
