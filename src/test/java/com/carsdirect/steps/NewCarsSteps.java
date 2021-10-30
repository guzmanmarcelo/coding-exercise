package com.carsdirect.steps;

import com.carsdirect.pages.MainContentLeftPage;
import com.carsdirect.pages.NewCarsPage;
import io.cucumber.java.en.And;

/**
 * Class containing all steps about New Cars page.
 *
 * @author Marcelo Guzman
 */
public class NewCarsSteps {

  private final NewCarsPage newCarsPage;

  /**
   * Initializes a new instance of NewCarsSteps class.
   */
  public NewCarsSteps() {
    newCarsPage = new NewCarsPage();
  }

  /**
   * Selects a Make value.
   *
   * @param makeValue the Make value.
   */
  @And("select {string} as Make")
  public void selectMake(String makeValue) {
    newCarsPage.selectMake(makeValue);
  }

  /**
   * Clicks 'Find Your Next Car' button.
   */
  @And("(I )click 'Find Your Next Car' button")
  public void clickFindYourNextCarButton() {
    MainContentLeftPage mainContentLeftPage = newCarsPage.clickFindYourNextCarButton();
  }
}
