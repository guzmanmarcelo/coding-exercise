package com.carsdirect.selenium.browsertype;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class to handle Chrome driver.
 *
 * @author Marcelo Guzman
 */
public class Chrome implements Driver {

  /**
   * {@inheritDoc}
   */
  @Override
  public WebDriver initDriver() {
    WebDriverManager.chromedriver().setup();
    return new ChromeDriver();
  }
}
