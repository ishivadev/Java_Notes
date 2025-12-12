package day12_PolymorphismEncapsulation;

// Method Overloading - When multiple methods in the same class have the same name but different parameters (type, number, or order),

public class AdderMethodMain {

	public static void main(String[] args) {
		
		AdderMethod ad = new AdderMethod();
		
		ad.sum();			// 1
		
		ad.sum(3, 2);		// 2
		
		ad.sum(4, 3.5);		// 3
		
		ad.sum(5.5, 4);		// 4
		
		ad.sum(2, 4, 5);    // 2
		
	}

}
