package com.weather;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MinMaxTempNext10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://weather.com/en-IN/?Goto=Redirected");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='10 Day']")));
		driver.findElement(By.xpath("//span[text()='10 Day']")).click();
		
		System.out.println("Current Temperature is " + driver.findElement(By.xpath("//div[@data-testid='ConditionsSummary']/div/span[@data-testid='TemperatureValue']")).getText());
		
		List<WebElement> total_Temp = driver.findElements(By.xpath("//span[@class='DetailsSummary--highTempValue--3PjlX']"));
		List<WebElement> day = driver.findElements(By.xpath("//h3[@data-testid='daypartName']"));
		
		for(int i=0;i<total_Temp.size();i++) {
			System.out.println(day.get(i).getText()+" " + total_Temp.get(i).getText());
		}
		System.out.println(" ");
		String minDegree = total_Temp.get(1).getText();
		
		String minValue = minDegree.replaceAll(".$", "");
		int min=Integer.parseInt(minValue);
		int max=Integer.parseInt(minValue);
		int degree=0;
		int minIndex=0, maxindex=0;
		
		String value;
		for(int j=1; j<total_Temp.size();j++) {
			value=total_Temp.get(j).getText();
			degree=Integer.parseInt(value.replaceAll(".$", ""));
			
			if(degree<min) {
				min=degree;
				minIndex=j;
			}
			else {
				max=degree;
				maxindex=j;
			}
		}
		System.out.println(min + "° is the minimum Temperature and on " + day.get(minIndex).getText());
		System.out.println(max + "° is the maximum Temperature and on " + day.get(maxindex).getText());
		driver.quit();
		
}		

}
