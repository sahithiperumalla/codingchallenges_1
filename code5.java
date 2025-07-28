package codingchallenge2;


public class code5 {
	int a=10;
	public static int c=30;

	public void display()
	{
		int b=20;
		System.out.println("Instance variable: "+this.a);
		System.out.println("Local variable: "+b);
		System.out.println("static variable: "+c);


	}

	public static void main(String[] args) {
		code5 v=new code5();
		v.display();
	}

}
