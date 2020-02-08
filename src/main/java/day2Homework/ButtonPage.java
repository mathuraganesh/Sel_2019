package day2Homework;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		//Bond with Buttons
		
		//Click button to travel home page
		driver.findElementById("home").click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		//Find position of button (x,y)
		int iXPostition = driver.findElementByXPath("//button[text()='Get Position']").getLocation().getX();
		int iYPostition = driver.findElementByXPath("//button[text()='Get Position']").getLocation().getY();
		Point iPostition = driver.findElementByXPath("//button[text()='Get Position']").getLocation();
		System.out.println("Position of button x:"+iXPostition);  //output-position of button x:240
		System.out.println("Position of button y:"+iYPostition);  //Output-position of button y:304
		System.out.println("Position of button :"+iPostition);    //Output-position of button :(240,304)
		
		//Find Button Color
		String cssValue = driver.findElementByXPath("//button[text()='What color am I?']").getCssValue("background-color");
		System.out.println("The color of the Button: "+cssValue);  //Output- The color of the Button: rgba(144, 238, 144, 1)
		
		//Find the height and width
		int width = driver.findElementById("size").getSize().getWidth();
		int height = driver.findElementById("size").getSize().getHeight();
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("Width of the Button:"+width);      		//Output-Width of the Button:122
		System.out.println("Height of the Button:"+height);      	//Output-Height of the Button:20
		System.out.println("Width and Height of the Button:"+size);   //Output-Width and Height of the Button:(122, 20)
	}

}
