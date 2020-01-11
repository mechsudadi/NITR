
public class ArithmeticOperators 
{
	public static void main(String[] args) {
		System.out.println(10/3); //3
		System.out.println(10%3); //1
		System.out.println(-10%3); //-1
		System.out.println(10%-3); //1
		System.out.println(-10%-3); //-1
		//System.out.println(10/0); //java.lang.ArithmeticException
		System.out.println(10.0/0); //Infinity
		System.out.println(-10.0f/0); //-Infinity
		System.out.println(10/0.0); //Infinity
		System.out.println(0.0/0); //NaN
		
		byte b1 = 12;
		byte b2 = 13;
		//byte b3 = b1+b2; //cannot convert from int to byte
		int b3 = b1+b2;
		System.out.println(b3);
		
		int n1 = 12;
		float f = 23.4f;
		float res = n1+f;
		System.out.println(res);
	}
}
