
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =100;
		int b =35;
		int c =14;
		int d =64;
		System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
		b=c;
		c=a;
		a=d;
		d=b;
		System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
	}

}
