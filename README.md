README.md Content:

# Weather Temperature Automation

## Overview

This repository contains a Java-based automation script designed to retrieve current and 14-day forecast temperatures, including minimum and maximum values. The script utilizes Selenium WebDriver to interact with the weather.com website.

## Features

- Current Temperature: Fetches the current temperature from the weather.com homepage.
  
- 14-Day Forecast: Navigates to the 14-day weather forecast page and extracts temperature data for each day.
  
- Min and Max Temperature Analysis: Identifies the day with the minimum and maximum temperatures among the next 14 days.

- User-Friendly Output: Results are printed to the console in a readable format, showcasing the current temperature and a detailed breakdown of upcoming temperatures with corresponding dates.

## Usage

1. Clone the Repository:
   ```bash
   git clone https://github.com/sudhanshubgh/WeatherTemperatureAutomation.git
   ```

2. Dependencies:
   - Ensure you have Java installed on your machine.
   - Download [ChromeDriver](https://sites.google.com/chromium.org/driver/) and ensure it's in your system's PATH.

3. Customization:
   - Adjust timeouts or xpath expressions in the script if needed.

4. Execution:
   ```bash
   cd Weather-Temperature-Automation
   javac -cp ".;path/to/chromedriver.exe" MinMaxTempNext10.java
   java -cp ".;path/to/chromedriver.exe" MinMaxTempNext10
   ```

5. Contribute:
   - Feel free to contribute, report issues, or enhance the script to suit your specific requirements.

## Example Output

```plaintext
Current Temperature is 10°
 
Sat 03 20°
Sun 04 18°
Mon 05 18°
Tue 06 18°
Wed 07 17°
Thu 08 17°
Fri 09 18°
Sat 10 18°
Sun 11 19°
Mon 12 19°
Tue 13 20°
Wed 14 21°
Thu 15 21°
Fri 16 22°
 
17° is the minimum Temperature and on Wed 07
22° is the maximum Temperature and on Fri 16
```

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code.
