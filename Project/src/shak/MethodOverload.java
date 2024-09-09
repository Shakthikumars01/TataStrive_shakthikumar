package shak;

public class MethodOverload {
	private int a=2;
	private int b=8;
	private int c=8;
	public MethodOverload(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public MethodOverload(int a, int b,int c) {
		super();
		c=a+b;
		this.c=c;
	}
	public static void main(String args[]) {
		MethodOverload hi=new MethodOverload(45, 646);
		System.out.println("sjdjd"+hi);
	}
	
}
