package String;

public class CountStringElements {
    public static void main(String[] args) {
		String name="Selenium";
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=0)
				count ++;
		}
		System.out.println(count);
				
	}
}
