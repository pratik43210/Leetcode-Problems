class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize sum to 0, and maxi to the smallest possible value
        int sum = 0, maxi = Integer.MIN_VALUE;//we could also use maxi=nums[0]

        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];  // Add the current element to the sum
            
            // Update maximum sum if the current sum exceeds it
            maxi = Math.max(maxi, sum);
            
            // If the sum becomes negative, reset it to 0 (start a new subarray)
            if (sum < 0) {
                sum = 0;
            }
        }
        
        return maxi;

    }
}