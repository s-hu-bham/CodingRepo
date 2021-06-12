import java.io.*;
import java.math.*;

public class maxandminusingfunc {
	
	public static long minelement(int array[],int size)
	{
		long min = array[0];
		for(int i=0;i<size;i++)
		{
			min = Math.min(min, array[i]);
		}
		return min;
	}
	
	public static long maxelement(int array[],int size)
	{
		long max = array[0];
		for(int i=0;i<size;i++)
		{
			max = Math.max(max, array[i]);
		}
		return max;
	}

	public static void main(String[] arg)
	{
		int array[] = new int[]{5,9,3,7,1,4,6,2};
		int size = array.length;
		long min = minelement(array,size);
		long max = maxelement(array,size);
		
		System.out.println("The min element in the array : "+min);
		System.out.println("The max element in the array : "+max);
	}
}
