package day4.week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrame {

	//Load the Url
	//Click on the 'Try it' Button
	//Enter ur name in the alert
	//Accept the Alert
	//Verify ur nam ein Text below
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		TargetLocator SwitchTo=driver.switchTo();
		SwitchTo.frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert sAlert=SwitchTo.alert();
		//Alert sAlert=driver.switchTo().alert();
		sAlert.sendKeys("Ganesh");
		
		sAlert.accept();
		String text = driver.findElementByXPath("//p[@id='demo']").getText();
		if(text.contains("Ganesh"))
			System.out.println("Verified My Name 'Ganesh' is in the Text Below");
		else
			System.out.println("Verification Failed My Name 'Ganesh' is in the Text Below");

	}

}
