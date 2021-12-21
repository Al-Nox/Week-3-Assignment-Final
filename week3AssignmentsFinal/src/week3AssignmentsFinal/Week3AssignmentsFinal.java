package week3AssignmentsFinal;

public class Week3AssignmentsFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
//
	
	
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 100 };
		int sum = 0;
		System.out.println( ages[ages.length - 1] - ages[0] );
		for (int i = 0; i < ages.length; i++)  {
		
		
		sum += ages[i];
		
		}
		
		int average = sum / ages.length;	
		
		System.out.println(average);
//		
//		
//		
//		 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
////		
		  String[] names = new String[6];
	        
	        names[0] = "Sam";
	        names[1] = "Tommy";
	        names[2] = "Tim";
	        names[3] = "Sally";
	        names[4] = "Buck";
	        names[5] = "Bob";

	        for (String name : names ) {
            int sumOfLetters = 0;
	        sumOfLetters += name.length();
            
                System.out.println(sumOfLetters / names.length );    // Question 2a.
            }   
	        int j = 0; 												// Question 2b.
            
            for(j = 0; j < names.length; j++) {
                System.out.print(names[j] + " ");
            }
            System.out.println();
// 			Question 3. How do you access the last element of any array? 
//            You access the last element of the array with array[ array.length - 1 ] .
//           
// 			Question 4. How do you access the first element of any array? 
//            You access the first element of any array with array[0] .
            
            int[] nameLengths = new int[names.length]; 				// Question 5.
    		for (int i = 0; i < names.length; i++) {
    			nameLengths[i] = names[i].length(); 
    		}
    		sum = 0; 												// Question 6.
    		for (int i = 0; i < nameLengths.length; i++) {
    			sum += nameLengths[i];
    		}
    		System.out.println("sum of nameLengths = " + sum);
    		
 
    		 double array[] = { 25, 50, 75, 100};
    	     double a = array.length;
    	     
    	      System.out.println(CalcAverage(array, a));
    	      
    	      
	}
	
																		//  Question. 7
			public static String concatenateHello(String hello,int n) {
						String answer="";
						for(int i=0;i<n;i++)
							{
								answer += hello;
							}
						return answer;


						
						
						
} 
			public static String nameMerge(String firstName, String lastName) {  // question 8.
				String fullName = firstName +" " + lastName;
				return fullName;
			}
			
			
			
    	      public static double CalcAverage(double[] a, double n) { 	// Question 10.)
    	        
    	             
    	            double sum = 0;
    	             
	    	        for (int i = 0; i < n; i++)
	    	                sum += a[i];
    	         
    	            return (double) sum / n;
    	      }
    	     
    	      public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) // Question 12.
    	        {    if(isHotOutside == true && moneyInPocket>10.50) {
    	            return true;
    	        }   return false;
    	        }
    	      
    	      															
    	        public static double Avgdouble(double arr[]) // Question 11.
    	        {
    	                double sum = 0.0;
    	                for(int p = 0; p < arr.length;p++)
    	                {
    	                        sum += arr[p];
    	                }
    	                return sum / arr.length;
    	        }
    	        
    	        public static boolean isGreaterAvg(double array1[], double array2[])
    	        {
    	                
    	            double avg1=Avgdouble(array1);   	            
    	            double avg2=Avgdouble(array2);
    	            
    	            if(avg1>avg2)
    	                {
    	                return true;
    	                }
    	                return false;
    	        }
    	        
    	        
    	        
    	        public static String merryChristmas(String firstName) { //Question 13
    	        	String holidayCard = " Merry Christmas " + firstName;	 
    	        	return holidayCard;
	}
	}

	


