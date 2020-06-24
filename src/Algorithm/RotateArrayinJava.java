package Algorithm;

import java.util.Arrays;

public class RotateArrayinJava {
	
	// Question Link -- https://www.programcreek.com/2015/03/rotate-array-in-java/
	// sandkum - Works

	public static void main(String[] args) {
		
		
		int [] arr = new int [] {1, 2, 3, 4, 5,6,7};
		int [] arr1 = new int[arr.length];
		System.out.println("arr.length " +arr.length);  
		int k =3;
		System.out.println(Arrays.toString(arr));    
		
		for(int i=0; i < arr.length; i++){
			
			if(i<arr.length-k) {
				arr1[i+k] = arr[i];				
				
			}else {arr1[i-(arr.length-k)] = arr[i];}
				
			
			
			
			
		}
		
		
		System.out.println(Arrays.toString(arr1));    
	}

}
