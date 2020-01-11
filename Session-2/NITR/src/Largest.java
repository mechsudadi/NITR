import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		//int x=10, y=20;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int x = sc.nextInt();
		System.out.print("enter second no: ");
		float y = sc.nextFloat();
		
		/*
		int lar;
		if(x > y){
		   lar = x;
		}
		else{
		   lar = y;
		}
		*/
		
		float lar = (x>y)?x:y;
		
		System.out.println("Largest of ("+x+", "+y+") = "+lar);
		sc.close();
	}
}
