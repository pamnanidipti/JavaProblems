package myProject;
import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6}; 
		int totalSum = 5;
		getPairs(arr,totalSum);
	}
	
	public static void getPairs(int arr[],int totalSum) {
		Set<Integer> set = new HashSet<>();
		 for (int i = 0; i < arr.length; i++) {
			 int diff = totalSum - arr[i];
			 if(set.contains(diff)) System.out.println("Pair for sum "+totalSum +": "+arr[i]+", "+diff);
			 else set.add(arr[i]);
		 }
	}
}
