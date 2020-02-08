package day2Homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPage {

	public static void main(String[] args) {
		
		//Play with Radio Buttons

		String sRadioOption="no";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement eleRadio= driver.findElementByXPath("//label[text()='Are you enjoying the classes?']//following::div[@id='first']");
		List<WebElement> eleList = eleRadio.findElements(By.tagName("input"));
		//System.out.println(eleList.size());
		for (int i = 0; i < eleList.size(); i++) {
			//System.out.println(eleList.get(i).getText());
			eleList.get(i).findElement(By.xpath("//*[@id='"+sRadioOption+"']")).click();
			}
		
		
		//Find default selected radio button
		List<WebElement> eleDefault = driver.findElementsByXPath("//*[@id=\"contentblock\"]/section/div/div/div/label[contains(@for,'hecked')]");
		for (int i = 0; i < eleDefault.size(); i++) {
			boolean selected = eleDefault.get(i).findElement(By.tagName("input")).isSelected();
			String attribute = eleDefault.get(i).getAttribute("for");
			//System.out.println(selected);
			if(selected==true) {
				System.out.println("Default Selected Radio Button:"+attribute);
			}
			
		}
		
		String text=driver.findElementByXPath("(//div[@class='large-6 small-12 columns'])[3]").getText();
		//System.out.println(text);
		//String replaceAll = text.replaceAll("\\W+","");
		//System.out.println(replaceAll);
		String split[]=text.split("years");
		
		
		//Select your age group (Only if choice wasn't selected)
		List<WebElement> eleCheck = driver.findElementsByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input");
		for (int i = 0; i <eleCheck.size(); i++) {
			if(split[i].contains("21 - 40")) {
				
				boolean selected = eleCheck.get(i).isSelected();
				//System.out.println(selected);
				if(selected==true)
					System.out.println("Already selected");
				else
				{
					eleCheck.get(i).click();
					System.out.println("Selected");
				}
				
			}
			
			
		}
	}

}
