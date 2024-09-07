
UI Automation Framework- InetBanking Application:- https://demo.guru99.com/v3/index.php

This project is a robust UI Automation Framework built using Selenium WebDriver with Java and TestNG. It follows the Page Object Model (POM) design pattern to ensure modularity, maintainability, and reusability. The framework also incorporates Logger for detailed logging and Extent Reports for visually appealing and detailed test reports.

Features
Page Object Model (POM): Enhances the maintainability of test cases by using a layered structure separating test logic from UI actions.
Selenium WebDriver: Handles browser automation for UI testing.
TestNG: Enables parallel test execution, grouping, and annotations for efficient test case management.
Logger: Provides detailed log information for each test run, making it easier to debug and track test progress.
Extent Reports: Generates rich, interactive HTML reports that highlight test results, including screenshots of failures.
Project Structure
plaintext
Copy code
.
├── src
│   ├── main
│   │   └── java
│   │       └── pages        # Page Object Model classes (page actions & elements)
│   ├── test
│       └── java
│           └── tests        # TestNG test classes
├── logs                     # Log files generated during execution
├── reports                  # Extent reports generated post-execution
├── pom.xml                  # Maven dependencies
└── README.md                # Project documentation
Prerequisites
Before running the framework, ensure that the following software is installed:

Java 8 or higher
Maven
TestNG
Selenium WebDriver
Extent Reports
Log4j (for logging)
Setup Instructions
Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/UIAutomationFramework.git
cd UIAutomationFramework
Install dependencies:

Use Maven to install all the dependencies specified in the pom.xml:

bash
Copy code
mvn clean install
Configure the browser and environment:

Update the browser drivers (e.g., ChromeDriver, GeckoDriver) in the project configuration if needed.

Run the tests:

Execute all the test cases using Maven:

bash
Copy code
mvn test
View Logs:

Logs for each test run are generated in the logs directory. These logs provide detailed step-by-step information for each test.

View Reports:

Once tests are executed, you can view the detailed HTML test report in the reports directory. Open index.html in your browser to see test results.

Logging
The framework uses Log4j for logging. Logs are generated at different levels, including INFO, DEBUG, ERROR, etc. This helps in tracking test execution flow and pinpointing any issues that occur during test runs.

Reporting
Extent Reports is integrated for reporting, which provides an interactive and easy-to-read test report. The report contains:

Test status (Pass, Fail, Skip)
Test steps with detailed descriptions
Screenshots for failed test cases
Logs of the execution
Contribution
Feel free to fork this repository and contribute by submitting pull requests. Please make sure your code follows the design patterns and conventions used in this framework.
