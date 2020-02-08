package day3week2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collections {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(1000);
		List<String> sTrainName=new ArrayList<>();
		WebElement eleTable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allRows=eleTable.findElements(By.tagName("tr"));
		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allCols=allRows.get(i).findElements(By.tagName("td"));
			WebElement getTrain=allCols.get(1);
			String getTrainNo=getTrain.getText();
			sTrainName.add(getTrainNo);
			
		}
		System.out.println(sTrainName);
		
		driver.findElementByXPath("//a[text()='Train Name']").click();
		Thread.sleep(1000);
		List<String> sSortedTrainName=new ArrayList<>();
		WebElement eleSortTable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allSortRows=eleSortTable.findElements(By.tagName("tr"));
		
		for (int i = 0; i < allSortRows.size(); i++) {
			List<WebElement> allCols=allSortRows.get(i).findElements(By.tagName("td"));
			WebElement getTrain=allCols.get(1);
			String getTrainNo=getTrain.getText();
			sSortedTrainName.add(getTrainNo);
			
		}
		System.out.println(sSortedTrainName);
		if(sSortedTrainName.containsAll(sTrainName)==true)
			System.out.println("Both the List Compared and its Equal");
		else
			System.out.println("Both the List Compared and its not Equal");
	}
	}
