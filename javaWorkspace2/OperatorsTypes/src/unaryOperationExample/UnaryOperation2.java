package unaryOperationExample;

public class UnaryOperation2 {
    public static void main(String[] args) {
		int a=10;
		System.out.println(a++);//10-->11
		System.out.println(++a);//12-->12
		System.out.println(a);//12
		System.out.println(a++);//12-->13
		System.out.println(++a);//14-->14
		System.out.println(a++);//14-->15
		System.out.println(a);//15
		System.out.println(a--);//15-->14
		System.out.println(--a);//13-->13
		System.out.println(a);//13
		System.out.println(a--);//13-->12
		System.out.println(a--);//12-->11
		System.out.println(--a);//10-->10
		System.out.println(--a);//9-->9
	}
}
