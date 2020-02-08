package day3week1;

//Abstract class SBIHO should implement RBI and Cibil
//Implement min 3 methods in SBIHO

public abstract class SBIHO implements RBI,Cibil {

	@Override
	public void getCreditscore() {
		System.out.println("Get Credit score");
	}

	@Override
	public void minBalance() {
		System.out.println("minBalance:1000");
	}
	
	@Override
	public void maxtranscationLimit() {
		System.out.println("maxtranscationLimit-5");
	}

	@Override
	public abstract void DocumnetrequiredForLoan();

	@Override
	public abstract void AadharMandatory();

}
