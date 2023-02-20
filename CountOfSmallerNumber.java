package review2;
import java.util.*;

public class CountOfSmallerNumber {

	public static void main(String[] args) {
		int arr[] ={5,6,3,5,7,5,3,9,5,3,4,7,3};
		int n = arr[0];
		int total =0;
		for(int i =1;i<arr.length;i++) {
			if(arr[i]<n) {
				n=arr[i];
				
			}
		}
		System.out.println("The smallest number is:"+n);
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==n) {
				total+=1;
			}
		}
		System.out.println("Count of elements:"+total);
	}

}
