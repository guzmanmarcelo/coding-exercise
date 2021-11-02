package com.carsdirect.selenium.webdriver;

import com.carsdirect.utils.PropertiesInput;
import com.carsdirect.utils.PropertiesManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Class to manage WebDriver configuration.
 *
 * @author Marcelo Guzman
 */
public class WebDriverConfigReader {

  private static final Logger log = Logger.getLogger(WebDriverConfigReader.class);
  private static final PropertiesManager propertiesManager = PropertiesManager.getInstance();
  private static WebDriverConfigReader webDriverConfigReader;
  private String browser;
  private int implicitWaitTime;
  private int explicitWaitTime;
  private int sleepTime;

  /**
   * Initializes configuration.
   */
  private WebDriverConfigReader() {
    initValues();
  }

  /**
   * Gets the WebDriverConfigReader instance.
   *
   * @return WebDriverConfigReader instance.
   */
  public static WebDriverConfigReader getInstance() {
    if (webDriverConfigReader == null) {
      webDriverConfigReader = new WebDriverConfigReader();
    }
    return webDriverConfigReader;
  }

  /**
   * Initializes values according to Properties file values.
   */
  private void initValues() {
    PropertyConfigurator.configure("log.properties");
    log.info("Reading WebDriver settings...");
    browser = propertiesManager.getProperty(PropertiesInput.BROWSER);
    implicitWaitTime = Integer.parseInt(
        propertiesManager.getProperty(PropertiesInput.IMPLICIT_WAIT_TIME));
    explicitWaitTime = Integer.parseInt(
        propertiesManager.getProperty(PropertiesInput.EXPLICIT_WAIT_TIME));
    sleepTime = Integer.parseInt(propertiesManager.getProperty(PropertiesInput.SLEEP_TIME));
  }

  /**
   * Gets the browser.
   *
   * @return browser value.
   */
  public String getBrowser() {
    return browser;
  }

  /**
   * Gets the implicit wait time.
   *
   * @return implicit wait value.
   */
  public int getImplicitWaitTime() {
    return implicitWaitTime;
  }

  /**
   * Gets the explicit wait time.
   *
   * @return explicit wait value.
   */
  public int getExplicitWaitTime() {
    return explicitWaitTime;
  }

  /**
   * Gets the sleep wait time.
   *
   * @return sleep wait value.
   */
  public int getSleepTime() {
    return sleepTime;
  }
}
