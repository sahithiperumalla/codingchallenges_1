package codingchallenge1;

import java.util.Scanner;

public class code5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter byte value: ");
		byte d_byte=sc.nextByte();
		System.out.println("Enter short value: ");
		short d_short=sc.nextShort();
		System.out.println("Enter int value: ");
		int d_int=sc.nextInt();
		System.out.println("Enter long value: ");
		long d_long=sc.nextLong();
		System.out.println("Enter float value: ");
		float d_float=sc.nextFloat();
		System.out.println("Enter double value: ");
		double d_double=sc.nextDouble();
		System.out.println("Enter char value: ");
		char d_char=sc.next().charAt(0);
		System.out.println("Enter boolean value: ");
		boolean d_boolean=sc.nextBoolean();
		System.out.println("byte value: "+d_byte);
		System.out.println("short value: "+d_short);
		System.out.println("int value: "+d_int);
		System.out.println("long value: "+d_long);
		System.out.println("float value: "+d_float);
		System.out.println("double value: "+d_double);
		System.out.println("char value: "+d_char);
		System.out.println("boolean value: "+d_boolean);

	}


}
