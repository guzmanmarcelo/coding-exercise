package com.carsdirect.pages;

import com.carsdirect.selenium.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents the Used Cars page.
 *
 * @author Marcelo Guzman
 */
public class UsedCarsPage extends BasePage {

  @Override
  public void waitUntilPageIsLoaded() {
    wait.until(ExpectedConditions.titleIs("Find Used Cars For Sale - CarsDirect"));
  }
}
