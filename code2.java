package codingchallenge1;

public class code2 {
	public static void main(String[] args) {
	byte a1=75;
	byte a2=80;
	int sum=a1+a2;
	if(sum>Byte.MAX_VALUE || sum<Byte.MIN_VALUE)
	System.out.println("Overflow detected:"+sum);
	else
		System.out.println(sum);
	}

}
