package projectday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1. Launch URL: https://www.zoomcar.com/chennai
2. Click on the Start your wonderful journey link
3. In the Search page, Click on any pick up point under POPULAR PICK-UP
4. Click on the Next button
5. Specify the Start Date as tomorrow Date
6. Click on the Next Button
7. Confirm the Start Date and Click on the Done button
8. In the result page, capture the number of results displayed.
9. Find the highest priced car ride.
10. Click on the Book Now button for it.
11. Close the Browser.
 */
public class ComplexTestCase {
	
	public static void main(String[] args) throws InterruptedException {
		String sHighestPriceCar="";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByClassName("search").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[text()='Popular Pick-up points']/following::div[1]").click();
		driver.findElementByClassName("proceed").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='days']/div[2]/div").click();
		Thread.sleep(5000);
		driver.findElementByClassName("proceed").click();
		Thread.sleep(5000);
		String sStartDate = driver.findElementByXPath("//div[@class='day picked full']/div").getText();
		System.out.println(sStartDate);
		if(sStartDate.contains("MON"))
			System.out.println("Confirm the Start Date as Monday");
		else
			System.out.println("Confirm the Start Date as not Monday");
		
		driver.findElementByClassName("proceed").click();
		Thread.sleep(3000);
		List<WebElement> sResults = driver.findElements(By.xpath("//div[@class='price']"));
		System.out.println("In the Result Page,Number of results displayed:"+sResults.size());
		
		List<WebElement> sCarDetails = driver.findElementsByXPath("//div[@class='details']/h3");
		List<Integer> sSort=new ArrayList<>();
		Map<String,Integer> sResultList=new LinkedHashMap<>();
		for (int i = 0; i < sResults.size(); i++) {
			String text = sResults.get(i).getText();
			
			String replaceAll = text.replaceAll("[^0-9]+","");
			int num=Integer.parseInt(replaceAll);
			//System.out.print(replaceAll+" ");
			sSort.add(num);
			
			String sCarName=sCarDetails.get(i).getText();
			
			sResultList.put(sCarName,num);
			
		}
		Collections.sort(sSort, Collections.reverseOrder());
		System.out.println(sResultList);
		System.out.println(sSort);
		Integer iHighestPrice = sSort.get(0);
		System.out.println("Highest Price:"+iHighestPrice);
		for(Entry<String,Integer> eachList:sResultList.entrySet()) {
			if(eachList.getValue().equals(iHighestPrice)) {
				sHighestPriceCar = eachList.getKey();
				break;
			
			}
		}
		System.out.println("Highest Priced Car:"+sHighestPriceCar);
		
		driver.findElementByXPath("//h3[text()='"+sHighestPriceCar+"']/following::button[1]").click();
		Thread.sleep(3000);
		//driver.close();
		
	}
	

}
