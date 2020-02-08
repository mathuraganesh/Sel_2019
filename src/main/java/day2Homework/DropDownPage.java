package day2Homework;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Learn Listboxes
		
		//select Using Index
		WebElement eleIndex=driver.findElementById("dropdown1");
		Select index=new Select(eleIndex);
		index.selectByIndex(4);  //Index always start from "0" Output:LoadRunner
		
		//Select by VisbleText
		WebElement eleVisibleText = driver.findElementByName("dropdown2");
		Select visibletext=new Select(eleVisibleText);
		visibletext.selectByVisibleText("Selenium");
		
		//select by value
		Select value=new Select(driver.findElementById("dropdown3"));
		value.selectByValue("2");   //Output:Appium
		
		//Get the Number of DropDown Option
		WebElement eleDropDown=driver.findElementByClassName("dropdown");
		Select dropdown=new Select(eleDropDown);
		List<WebElement> getList=dropdown.getOptions();
		int size = getList.size();
		System.out.println("Number of DropDown Option:"+size);  //Output:Number of DropDown Option:5
		for(WebElement sDropDownList:getList)
			System.out.println(sDropDownList.getText());
		/*
		 Output
			Get the number of dropdown options
			Selenium
			Appium
			UFT/QTP
			Loadrunner
		 */
		
		//You can also use sendkeys to select
		driver.findElementByXPath("//select[@class='dropdown']/following::select").sendKeys("UFT/QTP");
		
		//select your program
		WebElement path = driver.findElementByXPath("//option[text()='Select your programs']/parent::select");
		Select pgm=new Select(path);
		pgm.selectByVisibleText("Loadrunner");
		
		

	}

}
