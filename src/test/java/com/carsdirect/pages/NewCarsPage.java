package com.carsdirect.pages;

import com.carsdirect.selenium.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents the New Cars page.
 *
 * @author Marcelo Guzman
 */
public class NewCarsPage extends BasePage {

  @FindBy(css = "div.mmDropDown.makeDropDown")
  private WebElement MAKE_DROPDOWN_LOCATOR;

  @FindBy(css = "div[class^='mmyzFlyout mmSearchSetFlyoutMake']")
  private WebElement SEARCH_FLYOUT_MAKE_LOCATOR;

  @FindBy(css = "div.ButtonGreen.findYourCar")
  private WebElement FIND_YOUR_NEXT_CAR_BUTTON;

  private static final String MAKE_NAME_LOCATOR = "a.mmyzFlyoutMakeName[data-makedenormalized='%s']";

  @Override
  public void waitUntilPageIsLoaded() {
    wait.until(ExpectedConditions.titleIs(
        "New Cars for Sale - Search Prices & Buy a New Car - CarsDirect"));
  }

  /**
   * Clicks Make dropdown.
   */
  private void clickMakeDropdown() {
    driverTools.clickElement(MAKE_DROPDOWN_LOCATOR);
    wait.until(
        ExpectedConditions.attributeToBe(SEARCH_FLYOUT_MAKE_LOCATOR, "style", "display: block;"));
  }

  /**
   * Clicks Make value.
   *
   * @param makeValue the Make value.
   */
  private void clickMakeLink(final String makeValue) {
    driverTools.clickElement(By.cssSelector(String.format(MAKE_NAME_LOCATOR, makeValue)));
    wait.until(
        ExpectedConditions.attributeToBe(SEARCH_FLYOUT_MAKE_LOCATOR, "style", "display: none;"));
  }

  /**
   * Selects Make value.
   *
   * @param makeValue the Make value.
   * @return NewCarsPage instance.
   */
  public NewCarsPage selectMake(final String makeValue) {
    clickMakeDropdown();
    clickMakeLink(makeValue);
    return this;
  }

  /**
   * Clicks Find Your Next Car button.
   *
   * @return MainContentLeftPage instance.
   */
  public MainContentLeftPage clickFindYourNextCarButton() {
    driverTools.clickElement(FIND_YOUR_NEXT_CAR_BUTTON);
    return new MainContentLeftPage();
  }
}
