package Algorithm;
//Form Code With Mosh


import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int numbers [] = {10,9,7,5,3131,0};
		
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	
	
	public static void sort(int [] array) {
		if(array.length<2)
			return; 
		
		var middle = array.length/2;
		//System.out.println("Middle is -->" +middle);
		
		int left [] = new int[middle];
		int right[] = new int[array.length-middle];
		
		for(int i =0 ;i<middle ;i++)
			left[i] = array[i];
		
		for(int i =middle ;i<array.length ;i++)
			right[i-middle] = array[i];
		
		
		sort(left);
		sort(right);
		
		merge(left , right ,array);
		
		
	}
	
	private static void merge(int [] left ,int[] right ,int[] result)
	
	{
	
		int i=0 ,j=0,k=0;
		
		while(i<left.length && j<right.length) {
			
			if(left[i]<right[j])
				result[k++]=left[i++];
			else
				result[k++]=right[j++];
			
		}
		
		while(i<left.length)
			result[k++] = left[i++];
		while(j<right.length)
		result[k++] =right[j++];
		
		
	}

}
