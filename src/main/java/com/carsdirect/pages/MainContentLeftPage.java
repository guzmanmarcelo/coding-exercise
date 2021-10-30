package com.carsdirect.pages;

import com.carsdirect.selenium.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents the Main Content Left page.
 *
 * @author Marcelo Guzman
 */
public class MainContentLeftPage extends BasePage {

  @FindBy(css = "div.CDCYModelCards.widget")
  private WebElement MODELS_CARDS_WIDGET_LOCATOR;

  @FindBy(css = "div.DropdownLight.filterSegment")
  private WebElement FILTER_SEGMENT_DROPDOWN_LOCATOR;

  @FindBy(css = "div.customSelect")
  private WebElement CUSTOM_SELECT_LOCATOR;

  private static final String CUSTOM_OPTION_LOCATOR = "//a[text()='%s']";
  private static final String MODEL_CARD_TITLE_LOCATOR = "//div[@class='modelCardTitle' and @id='%s']";

  @Override
  public void waitUntilPageIsLoaded() {
    wait.until(ExpectedConditions.visibilityOf(MODELS_CARDS_WIDGET_LOCATOR));
  }

  /**
   * Clicks the Filter Segment dropdown.
   */
  private void clickFilterSegmentDropdown() {
    driverTools.clickElement(FILTER_SEGMENT_DROPDOWN_LOCATOR);
    wait.until(ExpectedConditions.attributeToBe(CUSTOM_SELECT_LOCATOR, "style", "display: block;"));
  }

  /**
   * Clicks Option value.
   *
   * @param optionValue the Option value.
   */
  private void clickOptionLink(final String optionValue) {
    driverTools.clickElement(By.xpath(String.format(CUSTOM_OPTION_LOCATOR, optionValue)));
    wait.until(ExpectedConditions.attributeToBe(CUSTOM_SELECT_LOCATOR, "style", "display: none;"));
  }

  /**
   * Selects Option value.
   *
   * @param optionValue the Option value.
   * @return MainContentLeftPage instance.
   */
  public MainContentLeftPage selectOption(final String optionValue) {
    clickFilterSegmentDropdown();
    clickOptionLink(optionValue);
    return this;
  }

  /**
   * Determines if a Model is displayed.
   *
   * @param model the model value.
   * @return true if the model is displayed, false otherwise.
   */
  public boolean isModelDisplayed(final String model) {
    return driverTools.isElementDisplayed(By.xpath(String.format(MODEL_CARD_TITLE_LOCATOR, model)));
  }
}
