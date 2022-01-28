package com.Test;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 56, 34, 89 };
		int n = arr.length;
//		System.out.println("largest element : "+largest(arr,n));
		System.out.println("palindrone :: " + isPalindrome(-121));

	}

//	public static int largest(int arr[], int n)
//    {
//        int largestElement = arr[0];
//        for(int i = 1 ; i<n; i++){
//            if(arr[i]>largestElement) {
//            	largestElement = arr[i];
//            }
//        }
//		return largestElement;
//    }

	public static boolean isPalindrome(int x) {
		int reverseNum = 0;
		for (int i = x; i > 0; i /= 10) {
			reverseNum = reverseNum * 10 + i % 10;
		}
		return (reverseNum == x);
//			return true;
//		else
//			return false;
	}

}
