package com.carsdirect.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Class to manage Properties.
 *
 * @author Marcelo Guzman
 */
public class PropertiesManager {

  private static final Logger log = LogManager.getLogger(PropertiesManager.class);
  private static PropertiesManager propertiesManager;
  private final Properties properties;

  /**
   * Initializes PropertiesManager class.
   */
  private PropertiesManager() {
    properties = new Properties();
    try (InputStream inputStream = new FileInputStream("gradle.properties")) {
      properties.load(inputStream);
    } catch (IOException ioException) {
      log.error("Error when Initializing Properties", ioException);
    }
  }

  /**
   * Gets the PropertiesManager instance.
   *
   * @return PropertiesManager instance.
   */
  public static synchronized PropertiesManager getInstance() {
    if (propertiesManager == null) {
      propertiesManager = new PropertiesManager();
    }
    return propertiesManager;
  }

  /**
   * Gets the property.
   *
   * @param property Enum property value.
   * @return property value.
   */
  public String getProperty(final PropertiesInput property) {
    return getPropertyValue(property.getProperty());
  }

  /**
   * Gets the property by specific key.
   *
   * @param propertyKey property name.
   * @return property value.
   */
  private String getPropertyValue(final String propertyKey) {
    final String property = System.getProperty(propertyKey);
    return property == null? properties.getProperty(propertyKey) : property;
  }
}
