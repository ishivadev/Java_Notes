package day13_keywords;

public class StaticSample {

	    static int companyCode = 1001; // static variable

	    static void showCompanyCode()  // static method
	    {  
	        System.out.println("Company Code: " + companyCode);
	    }

	    public static void main(String[] args) {
	    	
	    	System.out.println(companyCode);  // accessed without object
	    	
	    	StaticSample.showCompanyCode();  // accessed without object

	 }
}

	
	

