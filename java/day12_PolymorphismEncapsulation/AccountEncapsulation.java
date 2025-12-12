package day12_PolymorphismEncapsulation;

/*
Encapsulation - Wrapping up of data and methods in to single unit(class).
We created variables as 'private'. We cannot access the variables through created object in other class. We only access the variables through the methods available in the same class.

1. All variables should be private.
2. For every variable there should be 2 methods(getter & setter).
3. Variables can be operated only through methods.
 */

public class AccountEncapsulation {

	private int accno;
	private String name;
	private double amount;
	
	
	public int getAccno() {
		return accno;
	}
	
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
