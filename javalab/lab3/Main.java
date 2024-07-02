class Main
{
	// Function to print all subarrays with a zero-sum
	// in a given array
	public static void printAllSubarrays(int[] nums)
	{
		// consider all subarrays starting from `i`
		for (int i = 0; i < nums.length; i++)
		{
			int sum = 0;

			// consider all subarrays ending at `j`
			for (int j = i; j < nums.length; j++)
			{
				// sum of elements so far
				sum += nums[j];

				// if the sum is seen before, we have found a subarray with zero-sum
				if (sum == 0) {
					System.out.println("sub array: ");
					for(int k=i;k<=j;k++){
					System.out.print(nums[k]+" ");
				}
				System.out.println("\n");
			}

			}
		}
	}

	public static void main (String[] args)
	{
		int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

		printAllSubarrays(nums);
	}
}