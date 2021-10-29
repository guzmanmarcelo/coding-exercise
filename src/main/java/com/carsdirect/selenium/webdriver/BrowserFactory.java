package com.carsdirect.selenium.webdriver;

import com.carsdirect.selenium.browsertype.Browser;
import com.carsdirect.selenium.browsertype.Chrome;
import com.carsdirect.selenium.browsertype.Driver;
import com.carsdirect.selenium.browsertype.Firefox;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;
import org.openqa.selenium.WebDriver;

/**
 * Returns the correct driver instance.
 *
 * @author Marcelo Guzman
 */
public class BrowserFactory {

  private static final Map<Browser, Supplier<Driver>> BROWSERS = new EnumMap<>(Browser.class);

  static  {
    BROWSERS.put(Browser.CHROME, Chrome::new);
    BROWSERS.put(Browser.FIREFOX, Firefox::new);
  }

  /**
   * Default constructor.
   */
  private BrowserFactory() {
  }

  /**
   * Gets the driver instance according the parameter.
   *
   * @param browser the browser type.
   * @return WebDriver instance.
   */
  public static WebDriver getDriver(final Browser browser) {
    return BROWSERS.getOrDefault(browser, Chrome::new).get().initDriver();
  }
}
