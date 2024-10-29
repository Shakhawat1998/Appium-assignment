# Project Title: Calculator App Automation 

## Project Summary

This project automates the testing of a mobile calculator application using Appium and IntelliJ. The framework is designed to handle both parameter-based and CSV-driven test cases for various calculation series.

### Key Features

1. **Series Calculation Method**
   - A reusable function that automates any calculation series passed as a parameter. For example:
     ```java
     public void doSeries() {
         calculateSeries("100/10*5-10+60");
     }
     ```
   - This function simulates user input on the calculator app by iterating through the series string, identifying digits and operators, and triggering the corresponding button actions.

2. **CSV-Based Calculation Validation**
   - A function that reads calculation series from a CSV file and automates assertions for each series.
   - Example CSV content:
     ```
     Series, Expected Result
     50+40-30/2+20, 95
     10*2/2+10-20, 0
     4pi2^3, 100.53
     ```
   - Each series tests different operations, including addition, subtraction, multiplication, division, and exponentiation.

## Technologies used:
- Selenium with TestNG
- Appium
- Gradle (Build tool)
- Allure (Reporting tool)
- Appium Inspector
- Android Studio
- IntelIJ Idea
## How to run?
- clone this project
- Open command prompt and give following command
 ``` appium ```
- Open calculator apk in android studio and start emulator
- Open appium inspector and start session using saved capabilities
- Open the project in IntelIJ Idea
- Give following command in IntelIJ terminal:
``` gradle clean test ```

## Output 

![appium_summary](https://github.com/user-attachments/assets/abd2ea9a-9775-476f-817c-56718a9660e6)

![appium_behaviours](https://github.com/user-attachments/assets/66f825a5-ac15-492a-939e-8728e84b0af5)

## Video 

https://github.com/user-attachments/assets/631a5998-259d-49a2-9807-2a290ad51206




