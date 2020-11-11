package com.jnit.Day11_11_2020;

import java.util.Scanner;

/*
 * Input: nums1 = [1,3], nums2 = [2]
 *Output: 2.00000
 *Explanation: merged array = [1,2,3] and median is 2.
 * Let's say the merged/combined array is - result
 *If (m + n) is odd, then the median will be result[(m + n + 1) / 2].
 *If (m + n) is even, then the median will be (result[(m + n) / 2] + result[(m + n) / 2 + 1]) / 2.
 */
public class MedianSortedArray {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter 1st array length");
		int length1=scanner.nextInt();
		int [] nums1=new int[length1];
		System.out.println("enter 1st array elements");
		for(int i=0;i<length1;i++)
		{
			nums1[i]=scanner.nextInt();
		}
		System.out.println("enter 2nd array length");
		int length2=scanner.nextInt();
		int [] nums2=new int[length1];
		System.out.println("enter 2nd array elements");
		for(int i=0;i<length1;i++)
		{
			nums2[i]=scanner.nextInt();
		}
		
		//int[] nums1 = new int[]{1, 3};
        //int[] nums2 = new int[]{2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
		
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length) {
			return findMedianSortedArrays(nums2, nums1);
		}
			int m = nums1.length;
			int n = nums2.length;
		int start = 0;
		int end = m;
		while (start <= end) {
			int partitionNums1 = (start + end) / 2;
			int partitionNums2 = (m + n + 1) / 2 - partitionNums1;
			int maxLeftNums1 = partitionNums1 == 0 ? Integer.MIN_VALUE : nums1[partitionNums1 - 1];
			int minRightNums1 = partitionNums1 == m ? Integer.MAX_VALUE : nums1[partitionNums1];
			int maxLeftNums2 = partitionNums2 == 0 ? Integer.MIN_VALUE : nums2[partitionNums2 - 1];
			int minRightNums2 = partitionNums2 == n ? Integer.MAX_VALUE : nums2[partitionNums2];
			if (maxLeftNums1 <= minRightNums2 && maxLeftNums2 <= minRightNums1) {
				if ((m + n) % 2 == 0) {
					return (Math.max(maxLeftNums1, maxLeftNums2) + Math.min(minRightNums1, minRightNums2)) / 2.0;
				} else {
					return Math.max(maxLeftNums1, maxLeftNums2);
				}
			} else if (maxLeftNums1 > minRightNums2) {
				end = partitionNums1 - 1;
			} else {
				start = partitionNums1 + 1;
			}
		}
		throw new IllegalArgumentException();
	}

}
