package practiceQuestions;

public class MissingNoInArray {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 5};
        int n = arr.length + 1;
        
        int total = n * ( (n+1) / 2 );
        
        
        int sum = 0;
        for(int a : arr)
        {
            sum = sum + a;
        }
        
        System.out.println("Missing no is : " + (total - sum));


	}

}
