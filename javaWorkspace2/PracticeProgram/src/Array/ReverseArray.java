package Array;

public class ReverseArray {
	public static void main(String[] args) {
		
     int arr[]= {5,6,7,8,9};
     System.out.println("***normal array***");
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.print(arr[i]);
     }
     System.out.println(" ");
     System.out.println("***Reverse array***");
     for(int i=arr.length-1;i>=0;i--)
     {
    	 System.out.print(arr[i]);
     }
     
	}
}
