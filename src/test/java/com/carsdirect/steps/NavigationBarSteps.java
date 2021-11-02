package com.carsdirect.steps;

import com.carsdirect.components.NavigationBar;
import io.cucumber.java.en.And;

/**
 * Class containing all steps about Navigation Bar.
 *
 * @author Marcelo Guzman
 */
public class NavigationBarSteps {

  private final NavigationBar navigationBar;

  /**
   * Initializes a new instance of NavigationBarSteps class.
   */
  public NavigationBarSteps() {
    navigationBar = new NavigationBar();
  }

  /**
   * Clicks a link option.
   *
   * @param linkName the link name.
   */
  @And("(I )click {string} option")
  public void clickLinkOption(final String linkName) {
    navigationBar.clickNavigationBarLink(linkName);
  }
}
