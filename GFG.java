/*package whatever //do not write package name here */

import java.io.*;


class GFG {
    
    public static boolean checkElementOccurance(int arr[], int size,int x, int k)
 {
     int j=0;
     boolean flag = false;
     for(int i=0;i<size;i=i+k)
     {
        // flag = false;
         for(j=i;j<i+k;j++)
         {
             if(j<size && arr[j]==x)
             {
                 break;
             }
             if(j>=size)
             return flag;
            
           
             
            
            // 5, 8, 7, 12, 14, 3, 9
           
             
         }
         /*
         if(j<size)
         {
             return true;
         }
         else
         {
             return flag;
         }
         */
     }
     return true;
 }
 
	public static void main (String[] args) {
	
	int arr[] = new int[]{ 5, 8, 7, 12, 14, 3, 9} ;
	int size = arr.length;
	int x=8;
	int k=2;
	//Boolean result = calculate(arr,size,x,k);

    System.out.println(checkElementOccurance(arr,size,x,k));
 }
 
 
 
}