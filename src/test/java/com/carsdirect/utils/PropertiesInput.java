package com.carsdirect.utils;

/**
 * Enum with all the properties.
 *
 * @author Marcelo Guzman
 */
public enum PropertiesInput {
  BROWSER("browser"),
  IMPLICIT_WAIT_TIME("implicitWaitTime"),
  EXPLICIT_WAIT_TIME("explicitWaitTime"),
  SLEEP_TIME("sleepTime"),
  URL("url");

  private final String property;

  /**
   * Creates a new PropertiesInput instance.
   *
   * @param property property name.
   */
  PropertiesInput(final String property) {
    this.property = property;
  }

  /**
   * Gets the Property value.
   *
   * @return string Property value.
   */
  public String getProperty() {
    return property;
  }
}
