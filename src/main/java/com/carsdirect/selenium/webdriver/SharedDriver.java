package com.carsdirect.selenium.webdriver;

import com.carsdirect.selenium.browsertype.Browser;
import java.time.Duration;
import org.openqa.selenium.WebDriver;

/**
 * Class to create a driver object to add it to the thread.
 *
 * @author Marcelo Guzman
 */
public class SharedDriver {

  /**
   * Creates the driver, maximizes it and manages the timeouts.
   */
  public SharedDriver() {
    if (DriverFactory.getDriver() == null) {
      WebDriverConfigReader webDriverConfigReader = WebDriverConfigReader.getInstance();
      final String browser = webDriverConfigReader.getBrowser();
      WebDriver driver = BrowserFactory.getDriver(Browser.valueOf(browser));
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(
          Duration.ofSeconds(WebDriverConfigReader.getInstance().getImplicitWaitTime()));
      DriverFactory.addDriver(driver);
    }
  }
}
