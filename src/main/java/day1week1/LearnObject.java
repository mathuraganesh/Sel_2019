package day1week1;

public class LearnObject {
	
	//Load URL
	//access-modifier return-type method-name(input arg)
	//public ,private,default(package), protected
	public void get(String url) {
		System.out.println("the url is "+url);
		
	}
	
	//Close
	private boolean close() {
		System.out.println("browser closed");
		return true;
	}
	
	//Get the title
	public String getTitle() {
		System.out.println("get the title");
		return "google";
	}
	
	public static void findElement() {
		System.out.println("Hey! I found a webElement");
	}
	
	
	
	
	//Get the current URL
	public String getCurrentUrl() {
		
		return "http://google.com";
	}
	public static void main(String[] args) {
		//syntax to call a class
		//class-name object = new class-name();
		LearnObject browser = new LearnObject();
		
		//Syntax to call a method
		//object.method-name();
		
		browser.get("http://google.com");
		
		String title = browser.getTitle();
		System.out.println(title);
		
		String currentUrl = browser.getCurrentUrl();
		System.out.println(currentUrl);
		
		boolean result = browser.close();
		System.out.println(result);
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
