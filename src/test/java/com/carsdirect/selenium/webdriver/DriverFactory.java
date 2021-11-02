package com.carsdirect.selenium.webdriver;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;

/**
 * Class containing methods to get, add or remove the driver of a thread.
 *
 * @author Marcelo Guzman
 */
public class DriverFactory {

  private static final ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
  private static final List<WebDriver> storedDrivers = new ArrayList<>();

  static {
    Runtime.getRuntime().addShutdownHook(new Thread(() -> storedDrivers.forEach(WebDriver::quit)));
  }

  /**
   * Default constructor.
   */
  private DriverFactory() {
  }

  /**
   * Gets current driver.
   *
   * @return WebDriver instance.
   */
  public static WebDriver getDriver() {
    return drivers.get();
  }

  /**
   * Adds a driver to the list.
   *
   * @param driver the driver.
   */
  public static void addDriver(final WebDriver driver) {
    storedDrivers.add(driver);
    drivers.set(driver);
  }
}
