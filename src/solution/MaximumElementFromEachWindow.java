package solution;

public class MaximumElementFromEachWindow {

	public static int[] computeSolution(int[] arr, int k) 
	{	
		int[] solution = new int[arr.length-k+1];
		int maximumInEachWindow = Integer.MIN_VALUE;
		int i=0;
		int counter=0;
		
		for (; i < k; i++)
			maximumInEachWindow =Math.max(maximumInEachWindow, arr[i]);
		solution[counter++]=maximumInEachWindow;
		
		for(int j=i ; j < arr.length; j++)
		{
			maximumInEachWindow =Math.max(maximumInEachWindow, arr[j]);
			solution[counter++]=maximumInEachWindow;
		}
		System.out.println(counter);
		return solution;
	}

	public static void main(String[] args) {
		//int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int arr[] = { 1, 7, -2, 8};
		int k= 3;
		int solution[] = computeSolution(arr, 3);
		for (int i = 0; i < solution.length; i++)
			System.out.print(arr[i]);
	}
}
