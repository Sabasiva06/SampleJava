package org.sam;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\\\JavaProject\\\\library\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://ironspider.ca/forms/dropdowns.htm");
//to locate the dropdown
WebElement dropDown = driver.findElement(By.xpath("//select[@name='coffee2']"));

	//declare select object
Select s = new Select(dropDown);
	//to select options based on index
		//s.selectByIndex(0);
		//Thread.sleep(5000);
		//s.deselectByIndex(0);
		
	//to select the options based on attribute value
	//s.selectByValue("black");
	//to select by using visible text
	//s.selectByVisibleText("With sugar");
	
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
	Thread.sleep(5000);
	s.selectByValue("skim");
	Thread.sleep(5000);
	s.selectByValue("milk2");
	Thread.sleep(5000);
	s.selectByValue("cream");
	
	
	Thread.sleep(5000);
	
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	String text2 = firstSelectedOption.getText();
	System.out.println(text2);
	
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (int i = 0; i < allSelectedOptions.size(); i++) {
		WebElement element = allSelectedOptions.get(i);
		String text = element.getText();
		System.out.println(text);
	}
	
	
	
	
	}
}
