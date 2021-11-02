package com.carsdirect.selenium;

import com.carsdirect.selenium.webdriver.DriverFactory;
import com.carsdirect.selenium.webdriver.WebDriverConfigReader;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Represents a generic Web page.
 *
 * @author Marcelo Guzman
 */
public abstract class BasePage {

  protected WebDriver driver;
  protected WebDriverWait wait;
  protected WebDriverTools driverTools;
  private WebDriverConfigReader webDriverConfigReader;

  /**
   * Initializes the WebDriver, WebDriverTools, wait and web elements.
   */
  public BasePage() {
    driver = DriverFactory.getDriver();
    webDriverConfigReader = WebDriverConfigReader.getInstance();
    wait = new WebDriverWait(driver,
        Duration.ofSeconds(webDriverConfigReader.getExplicitWaitTime()),
        Duration.ofSeconds(webDriverConfigReader.getSleepTime()));
    driverTools = new WebDriverTools(driver, wait);
    PageFactory.initElements(driver, this);
    waitUntilPageIsLoaded();
  }

  /**
   * Waits until page object is loaded.
   */
  public abstract void waitUntilPageIsLoaded();
}
