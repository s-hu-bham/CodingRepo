import java.io.*;

public class reversearray {
	

	public static void main(String[] args)
	{
		int[] array = new int[] {1,2,3,4,5,6,7,8};
		int size = array.length;

		System.out.println("The reverse order of an array : ");
		for(int i=size-1;i>=0;i--)
		{
			
			System.out.print(" "+array[i]+" ");
		}
		
		
	}
}
