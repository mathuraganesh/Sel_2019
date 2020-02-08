package day2Homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPage {

	public static void main(String[] args) {
		
		//Interact with Checkboxes

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//Select the languages that you know?
		
		String sGetLanguage = driver.findElementByXPath("(//div[@class='example'])[1]").getText();
		//System.out.println(sGetLanguage);
		String[] split = sGetLanguage.split("\\s");
		for (String string : split) {
			//System.out.println(string);
		}
		List<WebElement> eleLanguage = driver.findElementsByXPath("(//div[@class='example'])[1]/input");
		for (int i=0;i<eleLanguage.size();i++) {
			if(i==0||i==1)
				eleLanguage.get(i).click();
			
		}
		
		//Confirm Selenium is checked
		boolean selected = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input").isSelected();
		if(selected==true)
			System.out.println("Confirmed Selenium is checked");
		else
			System.out.println("Confirm Selenium is Not checked");
		
		//DeSelect only checked
		List<WebElement> eleUncheck = driver.findElementsByXPath("(//div[@class='example'])[3]/input");
		for (WebElement eachUncheck : eleUncheck) {
			if(eachUncheck.isSelected()==true)
				eachUncheck.click();
		}
		
		//Select all below checkboxes
		List<WebElement> eleAllcheck = driver.findElementsByXPath("(//div[@class='example'])[4]/input");
		for (WebElement eachAllcheck : eleAllcheck) {
			eachAllcheck.click();
		}
		
	}

}
