package Algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		reverse();

		

	}
	public static void reverse() {
		
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		
	int[] arr = new int[queue.size()];
	System.out.println("Size "+queue.size());
	
	
	System.out.println("arr size is  "+arr.length);
	for(int i=0 ;i<=0 ; i++) {
	
	//for(int i=queue.size() ;i>=0 ; i--) {	
	 System.out.println(i);
	 int temp = queue.remove();
	 System.out.println("temp is "+temp);
	 
	 
	 arr[i] = temp;
	
	
	}
	System.out.println(arr);
		
	}

}
