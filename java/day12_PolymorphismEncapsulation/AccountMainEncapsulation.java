package day12_PolymorphismEncapsulation;

public class AccountMainEncapsulation {

	public static void main(String[] args) {
		
		AccountEncapsulation ac = new AccountEncapsulation();
		
		ac.setAccno(101);
		ac.setName("John");
		ac.setAmount(70000);
		
		System.out.println(ac.getAccno());
		System.out.println(ac.getName());
		System.out.println(ac.getAmount());
		
	}

}
