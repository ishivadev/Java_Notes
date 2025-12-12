package practiceQuestions;

public class ArrayRotation {

	public static void main(String[] args) {
		
		
		// Rotate full array
		int arr[] = {1, 2, 3, 4, 5}; 
		        
		int left = 0; 
		int right = arr.length-1; 
		        
		   while( left < right ) 
		        { 
		            int temp = arr[left]; 
		            arr[left] = arr[right]; 
		            arr[right] = temp; 
		            left++; 
		            right--;
		        }
		            
		   for(int n : arr) 
		   { 
		        System.out.print(n + ", ");
		   }
		
		   
		
		/*
		// Rotate first 2 indexes
		int arr[] = {1, 2, 3, 4, 5}; 
        int k = 2; 
        k = k % arr.length; 
        
        int left = 0; 
        int right = k-1; 
        
        
        while( left < right ) 
        { 
            int temp = arr[left]; 
            arr[left] = arr[right]; 
            arr[right] = temp; 
            left++; right--;
        }

            
        for(int n : arr) 
        { 
            System.out.print(n + ", "); 
        }
		
		*/
		
		   
		   
		   
		   
		   
		   /*
			// Rotate last 2 indexes
			int arr[] = {1, 2, 3, 4, 5}; 
	        int k = 2; 
	        k = k % arr.length; 
	        
	        int left = k+1; 
	        int right = arr.length-1; 
	        
	        
	        while( left < right ) 
	        { 
	            int temp = arr[left]; 
	            arr[left] = arr[right]; 
	            arr[right] = temp; 
	            left++; right--;
	        }

	            
	        for(int n : arr) 
	        { 
	            System.out.print(n + ", "); 
	        }
			
			*/
			
	}

}
