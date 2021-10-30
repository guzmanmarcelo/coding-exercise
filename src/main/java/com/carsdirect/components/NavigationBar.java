package com.carsdirect.components;

import com.carsdirect.pages.NewCarsPage;
import com.carsdirect.pages.UsedCarsPage;
import com.carsdirect.selenium.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents the Navigation Bar which contains the following options: New Cars, Used Cars, New Car
 * Deals, Auto Loans and Videos.
 *
 * @author Marcelo Guzman
 */
public class NavigationBar extends BasePage {

  private static final Logger log = Logger.getLogger(NavigationBar.class);

  @FindBy(id = "LogoAndNavWrapper")
  private WebElement NAVIGATION_BAR_LOCATOR;

  private static final String MAIN_NAV_LOCATOR = "//a/span[text()='%s']";

  @Override
  public void waitUntilPageIsLoaded() {
    wait.until(ExpectedConditions.visibilityOf(NAVIGATION_BAR_LOCATOR));
  }

  /**
   * Clicks a link given a specific name.
   *
   * @param linkName the link.
   * @return Object instance.
   */
  public Object clickNavigationBarLink(final String linkName) {
    driverTools.clickElement(By.xpath(String.format(MAIN_NAV_LOCATOR, linkName)));
    switch (linkName) {
      case "New Cars":
        return new NewCarsPage();
      case "Used Cars":
        return new UsedCarsPage();
      default:
        log.info("Link option not valid.");
    }
    return null;
  }
}
