package com.carsdirect.pages;

import com.carsdirect.selenium.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Represents the Home page.
 *
 * @author Marcelo Guzman
 */
public class HomePage extends BasePage {

  @Override
  public void waitUntilPageIsLoaded() {
    wait.until(
        ExpectedConditions.titleIs("Price, Search, Buy New & Used Cars Online - CarsDirect"));
  }
}
