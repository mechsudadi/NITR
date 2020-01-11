import java.util.Scanner;

public class Naturals3 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many natural numbers: ");
		int n = sc.nextInt();
		
		//method call
		printNaturals(n);
		
		sc.close();
	}
	/*method definition*/
	static void printNaturals(int num)
	{
		int n = 1;
		while(n <= num )
		{
			if(n==num)
				System.out.println(n);
			else
				System.out.print(n+", ");
			
			n = n + 1;
		}		
	}
}
