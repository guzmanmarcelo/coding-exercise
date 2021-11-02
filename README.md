# Cars Direct

This project uses [Selenium](https://www.selenium.dev), [Java](https://www.java.com/en/) and [Cucumber](https://cucumber.io) to create functional test cases for [Cars Direct](https://www.carsdirect.com).

## Prerequisites
### Install Java
Install [Java](https://www.oracle.com/java/).
Please follow the instructions to download and install Java [here](https://java.com/en/download/help/download_options.html#windows). 

### Install Gradle
Install [Gradle](https://gradle.org).
Please follow the instructions to download and install Gradle [here](https://gradle.org/install/).

### Install Git
Install Git. Please download [Git](https://git-scm.com/downloads).
Choose your operating system. Accept the defaults and follow the screen instructions to install.

### Install IntelliJ IDEA
Install [IntelliJ IDEA](https://www.jetbrains.com/idea/). 
Please follow the instructions of the installation guide [here](https://www.jetbrains.com/help/idea/installation-guide.html).

### Install IntelliJ IDEA plugins

**Cucumber for Java**<br>
* Go to File --> Settings --> Plugins.<br>
* Select MarketPlace and search Cucumber For Java. <br>
* Click Install button and restart the IDE. <br>

**- Gherkin**<br>
* Go to File --> Settings --> Plugins.<br>
* Select MarketPlace and search Gherkin. <br>
* Click Install button and restart the IDE. <br>

## How to run the tests
There are some ways to execute the tests:

### Using gradle
Run the _executeFeatures_ task:

`gradle executeFeatures -PcucumberOptions="--tags @Test"` <br>

You can also use parameters to change the browser (CHROME by default):

`gradle executeFeatures -PcucumberOptions="--tags @Test" -Pbrowser="FIREFOX"` <br>

### Using the Cucumber runner
Go to `/src/test/java/com/carsdirect/runner`  and open the `RunCucumberTest.java` class. <br>
Update the tags if necessary and select the `Run 'RunCucumberTest'` option. <br>

<img src="E:\Projects\GitLab Jalasoft\TX\Exercise\src\test\resources\images\readme\RunCucumberTest.png"/>

### Using the Intellij IDEA runner

<img src="E:\Projects\GitLab Jalasoft\TX\Exercise\src\test\resources\images\readme\Runner.png"/>

## Review Cucumber Report
At the end of the execution, a report will be generated automatically. You will see in the bottom page, just click on the link, and you will be redirected to the report.

<img src="E:\Projects\GitLab Jalasoft\TX\Exercise\src\test\resources\images\readme\CucumberReport.png"/>