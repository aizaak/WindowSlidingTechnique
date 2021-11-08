package solution;

public class Solution {
	
	/**
	 * Approach 1
	 * Use Two Loops
	 * Time Complexity O(n^2)
	 */
	public static int getMaximumSumUsingTwoLoops(int[] arr, int k)
	{
		int maxSum=Integer.MIN_VALUE;
		int arrSize=arr.length;
		
		for(int i= 0 ; i <= arrSize-k ; i++)
		{
			int currSum=0;
			for(int j= 0 ; j < k ; j++)
				currSum+=arr[i+j];
			
			maxSum=Math.max(currSum, maxSum);
		}
		return maxSum;
	}
	
	/**
	 * Approach 2
	 * Use Sliding Window
	 * Time Complexity O(n)
	 */
	public static int getMaximumSumUsingSlidingWindow(int[] arr, int k)
	{
		int maximumSum=Integer.MIN_VALUE;
		int arrSize=arr.length;
		int currWindowSum=0;
		int i=0;
		
		for(i= 0 ; i < k ; i++)
			currWindowSum+=arr[i];

		for(int j= i ; j < arrSize ; j++) {
			currWindowSum=currWindowSum+arr[j]-arr[j-k];
			maximumSum=Math.max(currWindowSum, maximumSum);
		}
		return maximumSum;
	}
	
	public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int windowSize=4;
        System.out.println(getMaximumSumUsingTwoLoops(arr,windowSize));
        System.out.println(getMaximumSumUsingSlidingWindow(arr,windowSize));
	}
}
