# Facebook Registration Form Automation

This project automates the process of filling out the Facebook registration form using Selenium WebDriver. The script interacts with the form fields and submits the registration form.

## Requirements

- Java JDK (minimum version 8)
- Selenium WebDriver (add necessary libraries to your project)
- ChromeDriver (ensure the driver version matches your Chrome browser)
- IDE (e.g., Eclipse, IntelliJ IDEA)

## Setup Instructions

1. *Clone the Repository*:
2. *Install Dependencies*:
- Add the Selenium libraries to your project:
  - selenium-java
  - selenium-chrome-driver

3. *Configure ChromeDriver*:
- Download ChromeDriver from [ChromeDriver](https://chromedriver.chromium.org/downloads).
- Add it to your system's PATH or specify its location in the code if necessary.

4. *Run the Script*:
- Open the project in your IDE.
- Run the main method in the file containing the automation script.

## Code Overview

The script performs the following steps:
1. Opens the Facebook registration form.
2. Maximizes the browser window.
3. Fills in the required fields:
- First Name
- Last Name
- Date of Birth
- Gender
- Mobile Number
- Password
  
4. Clicks the "Submit" button to complete the registration process.



