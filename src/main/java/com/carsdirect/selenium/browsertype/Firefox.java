package com.carsdirect.selenium.browsertype;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements Driver {

  /**
   * {@inheritDoc}
   */
  @Override
  public WebDriver initDriver() {
    WebDriverManager.firefoxdriver().setup();
    return new FirefoxDriver();
  }
}
