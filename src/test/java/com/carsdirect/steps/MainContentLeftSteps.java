package com.carsdirect.steps;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.carsdirect.pages.MainContentLeftPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Class containing all steps about Main Content Left.
 *
 * @author Marcelo Guzman
 */
public class MainContentLeftSteps {

  private final MainContentLeftPage mainContentLeftPage;

  /**
   * Initializes a new instance of MainContentLeftSteps class.
   */
  public MainContentLeftSteps() {
    mainContentLeftPage = new MainContentLeftPage();
  }

  /**
   * Selects a Vehicle type.
   *
   * @param vehicleType the Vehicle type.
   */
  @When("(I )select {string} Vehicle type")
  public void selectVehicleType(String vehicleType) {
    mainContentLeftPage.selectSegmentOption(vehicleType);
  }

  /**
   * Verifies that a model is listed.
   *
   * @param modelName the model.
   */
  @Then("the {string} model is listed")
  public void modelIsListed(String modelName) {
    assertTrue(mainContentLeftPage.isModelDisplayed(modelName));
  }

  /**
   * Verifies that a model is not listed.
   *
   * @param modelName the model.
   */
  @Then("the {string} model is not listed")
  public void modelIsNotListed(String modelName) {
    assertFalse(mainContentLeftPage.isModelDisplayed(modelName));
  }
}
