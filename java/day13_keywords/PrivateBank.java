package day13_keywords;

public class PrivateBank {

    private double balance;  // accessible only inside this class

    private void showBalance() {
        System.out.println(balance);
    }
	
	void m1()
	{
		balance = 10;
		showBalance();
		
	}
   
}
