package com.carsdirect.steps;

import com.carsdirect.pages.HomePage;
import com.carsdirect.selenium.webdriver.DriverFactory;
import com.carsdirect.selenium.webdriver.SharedDriver;
import com.carsdirect.utils.PropertiesInput;
import com.carsdirect.utils.PropertiesManager;
import io.cucumber.java.en.Given;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Class containing all steps about Login.
 *
 * @author Marcelo Guzman
 */
public class LoginSteps {

  private static final Logger log = Logger.getLogger(LoginSteps.class);
  private HomePage homePage;
  private static final String URL = PropertiesManager.getInstance()
      .getProperty(PropertiesInput.URL);

  /**
   * Initializes q new instance of LoginSteps class.
   *
   * @param sharedDriver sharedDriver.
   */
  public LoginSteps(SharedDriver sharedDriver) {
  }

  /**
   * Navigates to Cars Direct main page.
   */
  @Given("^I navigate to Cars Direct main page$")
  public void navigateToCarsDirectMainPage() {
    navigateToMainPage(URL);
    homePage = new HomePage();
  }

  /**
   * Loads the Cars Direct main page.
   *
   * @param url the Cars Direct URL.
   */
  private void navigateToMainPage(final String url) {
    WebDriver driver = DriverFactory.getDriver();
    driver.get(url);
  }
}
