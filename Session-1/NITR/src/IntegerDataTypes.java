
public class IntegerDataTypes 
{
	public static void main(String[] args) 
	{
		//byte b = -127;
		//byte b = 128; //CE - cannot convert from int to byte
		//byte b = (byte)128;
		//byte b = (byte)300;
		//byte b = (byte)1000;
		byte b = (byte)-129;
		System.out.println(b);
		
		//long pop = 7878787849; //The literal 7878787849 of type int is out of range
		long pop = 7878787849L;
		System.out.println("World Population = " + pop);
		
		int n = (int)12L;
		System.out.println(n);
	}
}
