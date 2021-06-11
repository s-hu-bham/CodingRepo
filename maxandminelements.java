
import java.io.*;

public class maxandminelements {
	
 public static long	maxElement(int arr[], int size)
 {
	   
	    int max = 0;
	    int min = 0;
	    int temp = 0;
	    for(int i=0;i<size;i++)
	    {
	    	for(int j=i+1;j<size;j++)
	    	{
	    		if(arr[i]>arr[j]) 
	    		{
	    		temp = arr[i];
	    		arr[i] = arr[j];
	    		arr[j] = temp;
	    		}
	    	}
	    	System.out.println(arr[i]);  
	    	
	    }
	    max=arr[size-1];
	    min = arr[size-size];
	    System.out.println("The min element in the array is :"+min);
	    
	    return max;
 }
	

 
	
  public static void main(String[] arg)
  { 
	  int arr[] = new int[]{1,3,5,6,3,7,2};
	  int size =arr.length;
	 // long min = minElement(arr, size);
	  long max = maxElement(arr, size);
	  
	  System.out.println("The max element in the array is :"+max);
	  //System.out.println("The min element in the array is :"+min);
	  
  }
	
	
}
