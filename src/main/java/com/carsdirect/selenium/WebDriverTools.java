package com.carsdirect.selenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Class to manage WebDriver common actions.
 *
 * @author Marcelo Guzman
 */
public class WebDriverTools {

  private static final Logger log = Logger.getLogger(WebDriverTools.class);
  private WebDriver driver;
  private WebDriverWait wait;

  /**
   * Sets driver and wait.
   *
   * @param driver web driver.
   * @param wait   web driver wait.
   */
  public WebDriverTools(final WebDriver driver, final WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  /**
   * Gets a WebElement given a By locator.
   * @param by By value.
   * @return the WebElement.
   */
  private WebElement getWebElement(final By by) {
    return driver.findElement(by);
  }

  /**
   * Clicks on the WebElement.
   *
   * @param webElement the WebElement.
   */
  public void clickElement(final WebElement webElement) {
    wait.until(ExpectedConditions.elementToBeClickable(webElement));
    webElement.click();
  }

  /**
   * Clicks on the WebElement using By option.
   *
   * @param by By value to locate the WebElement.
   */
  public void clickElement(By by) {
    wait.until(ExpectedConditions.elementToBeClickable(by));
    getWebElement(by).click();
  }

  /**
   * Determines if a WebElement is displayed.
   *
   * @param webElement the WebElement.
   * @return true if the element is displayed, false otherwise.
   */
  public boolean isElementDisplayed(final WebElement webElement) {
    wait.until(ExpectedConditions.visibilityOf(webElement));
    return webElement.isDisplayed();
  }

  /**
   * Determines if a WebElement is displayed using By option.
   *
   * @param by By value.
   * @return true if the WebElement is displayed, false otherwise.
   */
  public boolean isElementDisplayed(final By by) {
    return isElementDisplayed(getWebElement(by));
  }
}
