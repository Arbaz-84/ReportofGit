package Array;

public class DuplicateArrayElement {
	public static void main(String[] args) {
		
	 int arrelement[]= {23,45,78,56,45,67,23,78};
     for(int i=0;i<arrelement.length;i++)
     {
    	 for(int j=i+1;j<arrelement.length;j++)
    	 {
    		 if(arrelement[i]==arrelement[j])
    			 System.out.println(arrelement[j]);
    	 }
     }
}
}
