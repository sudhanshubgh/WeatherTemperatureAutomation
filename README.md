README.md Content:

# Weather Temperature Automation

## Overview

This repository contains a Java-based automation script designed to retrieve current and 10-day forecast temperatures, including minimum and maximum values. The script utilizes Selenium WebDriver to interact with the weather.com website.

## Features

- Current Temperature: Fetches the current temperature from the weather.com homepage.
  
- 10-Day Forecast: Navigates to the 10-day weather forecast page and extracts temperature data for each day.
  
- Min and Max Temperature Analysis: Identifies the day with the minimum and maximum temperatures among the next 10 days.

- User-Friendly Output: Results are printed to the console in a readable format, showcasing the current temperature and a detailed breakdown of upcoming temperatures with corresponding dates.

## Usage

1. Clone the Repository:
   ```bash
   git clone https://github.com/sudhanshubgh/currentandnext14daysTemp.git
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
Current Temperature is 23°C

Day 1: 28°
Day 2: 29°
Day 3: 27°
Day 4: 25°
Day 5: 24°
Day 6: 26°
Day 7: 23°
Day 8: 25°
Day 9: 28°
Day 10: 30°

Minimum Temperature: 23°C on Day 7
Maximum Temperature: 30°C on Day 10
```

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code.
