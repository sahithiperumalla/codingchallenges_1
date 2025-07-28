package codingchallenge2;


public class code3 {
	int a=10;
	public void print()
	{
		int a=20;
		System.out.println("Instance variable: "+this.a);
		System.out.println("Local variable: "+a);
	}

	public static void main(String[] args) {
		code3 v=new code3();
		v.print();
	}

}
