package Algorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {		
		bubbleSort();

	}	
	
	public static void bubbleSort() {
		
		int a [] = {10,9,7,5,3131,0};

		for(int i=0 ; i<a.length ; i++) {
			
			for (int j= 1 ; j<a.length ; j++)
			{
				if (a[j]<a[j-1]) {
					var temp = a[j];
					a[j] = a[j-1];
					a[j-1] =temp;
					
				}
					
			}
			
			
		}
		
		System.out.println(Arrays.toString(a));

	}

}
