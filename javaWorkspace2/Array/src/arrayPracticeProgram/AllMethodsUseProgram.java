package arrayPracticeProgram;

public class AllMethodsUseProgram {
     public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.println("*****Print Orignal Element*****");
		//Print Orignal Array Element and Reverse Array Element
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 System.out.println(arr[i]);
    	 }
    	 System.out.println("*****Print Reverse Array Element*****");
    	 for(int i=arr.length-1;i>=0;i--)
    	 {
    		 System.out.println(arr[i]);
    	 }
    	 
    	 int arr1[]= {9,8,9,6,5,56,8,5,3};
    	 int max=arr1[0];
    	 int min=arr1[0];
    	 //Print Duplicate Array Element
    	 System.out.println("*****Print Duplicate Array Element*****");
    	 for(int i=0;i<arr1.length;i++)
    	 {
    		 for(int j=i+1;j<arr1.length;j++)
    		 {
    			 if(arr1[i]==arr1[j])
    				 System.out.println(arr1[j]);
    		 }
    	 }
    	 //Print the Max Number and Min Numbre in array Element
    	 for(int i=0;i<arr1.length;i++)
    	 {
    		 if(arr1[i]>max)
    			 max=arr1[i];
       	 }
	      System.out.println("Print Max number array element::"+max);
         //Print min number in array element
	      for(int i=0;i<arr1.length;i++)
	      {
	    	  if(arr1[i]<min)
	    		  min=arr1[i];
	      }
	      System.out.println("Print Min Number In Array Element::"+min);
          
	      int arr2[]= {1,2,3,4,5};
	      int sum=0;
	      for(int i=0;i<arr2.length;i++)
	      {
	    	  sum=sum+arr2[i];
	    	  //System.out.println("Sum of all element in array::"+sum);
	      }
	      System.out.println("Sum of all element in array::"+sum);
     }
     
}
