
public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[7];
		marks[0] = 98;
		marks[1] = 75;
		System.out.println("Size of Array = "+ marks.length);
		for(int mark : marks)
		{
			System.out.print(mark+"   ");
		}
		System.out.println();
		
		float[] salaries = new float[6];
		for(float sal : salaries) {
			System.out.print(sal+"   ");
		}
		System.out.println();
		
		boolean status[] = new boolean[8];
		for(boolean stat : status)
		{
		 System.out.print(stat+"   ");	
		}
	}
}