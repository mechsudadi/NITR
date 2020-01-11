
public class ArrayInitialization 
{
	public static void main(String[] args) {
		int[] marks = {96,84,73,90,77,64};
		
		System.out.println("No of Subjects = "+ marks.length);
		
		for(int i=0;i<marks.length;i++)
		{
		 System.out.println("mark for Subject-"+(i+1)+" = "+ marks[i]);	
		}
		
		//enhanced for loop for array iteration
		System.out.print("Marks Obtained   :  ");
		for(int mark : marks)
		{
		 System.out.print(mark+" | ");	
		}
		System.out.println();
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
