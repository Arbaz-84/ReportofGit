package unaryOperationExample;

public class UnaryOperation1 {
     public static void main(String[] args) {
		int r=6;
		System.out.println("r=: "+r++);//6
		System.out.println("r=: "+r);//7
		
		int x=6;
		System.out.println("x=: "+ ++x);//7
		System.out.println("x=: "+x);//7
		
		int v=10;
		System.out.println("v=: "+v--);//10
		System.out.println("v: "+v);//9
		
		int w=20;
		System.out.println("w=: "+ --w);//19
		System.out.println("w=: "+w);//19
	}
}
