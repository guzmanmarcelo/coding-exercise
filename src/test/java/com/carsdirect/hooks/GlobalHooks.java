package com.carsdirect.hooks;

import com.carsdirect.selenium.webdriver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

/**
 * Global hooks.
 *
 * @author Marcelo Guzman
 */
public class GlobalHooks {

  /**
   * Closes the browser.
   */
  @AfterTest
  public void afterExecution() {
    WebDriver driver = DriverFactory.getDriver();
    driver.quit();
  }
}
