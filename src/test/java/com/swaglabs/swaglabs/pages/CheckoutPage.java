package com.swaglabs.swaglabs.pages;

import org.openqa.selenium.WebDriver;

public class CheckoutPage extends PageObject{

  private static final String URL = "https://www.saucedemo.com/checkout-step-one.html";

  public CheckoutPage(WebDriver browser) {
    super(browser);
  }


}
