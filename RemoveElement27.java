package com.Test;

public class RemoveElement27 {
	
	public static void main(String[] args) {
		int nums [] = {0,1,2,2,3,0,4,2};
		int val = 2;
		int [] result = removeElement(nums, val);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	private static int[] removeElement(int[] nums, int val) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = nums.length-1;
		while(i<=j) {
			if(nums[i] == val && nums[j] != val) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
				i++;
				j--;
			}else if(nums[i] != val) {
				i++;
			}else if(nums[j] == val) {
				j--;
			}
		}
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		return nums;
	}

}
