package day2week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		WebElement eleSource=driver.findElementById("txtStationFrom");
		eleSource.clear();
		eleSource.sendKeys("MAS",Keys.TAB);
		
		WebElement eleDestignation=driver.findElementById("txtStationTo");
		eleDestignation.clear();
		eleDestignation.sendKeys("MMCT",Keys.TAB);
		
		driver.findElementById("chkSelectDateOnly").click();
		
		WebElement eleTable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allRows=eleTable.findElements(By.tagName("tr"));
		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allCols=allRows.get(i).findElements(By.tagName("td"));
			WebElement getTrain=allCols.get(0);
			String getTrainNo=getTrain.getText();
			System.out.println(getTrainNo);
			
		}
		
		
		/*
		 WebElement eleTable = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a")
		for (WebElement getTrainName : eleTable) {
			getTrainName.getText();
		}
		*/

	}

}
