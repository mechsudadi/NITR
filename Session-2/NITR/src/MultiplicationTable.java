import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Which number multiplication table: ");
		int num = sc.nextInt();
		
		printTable(num);
		
		sc.close();
	}
	
	static void printTable(int num)
	{
	  System.out.println("Multiplication Table of "+ num+": ");
	  for(int i = 1; i<=10; i++)
	  {
		int p = num * i;
		System.out.println(num+" x "+i+" = "+p);
	  }
	}
}
