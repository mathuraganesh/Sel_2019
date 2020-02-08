package day3week1;

public class MyMobile extends Mobile {

	public static void main(String[] args) {
		Samsung overRide=new Samsung();
		overRide.whatspp();
		
		Iphone overLoad=new Iphone();
		overLoad.BrowsingGoogle();
		overLoad.BrowsingGoogle("Safari");

	}

}
