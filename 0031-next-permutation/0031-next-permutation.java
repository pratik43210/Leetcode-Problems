class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        
        // Find the first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        
        // If no such element is found, reverse the array
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        
        // Find the smallest element larger than nums[idx]
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, idx, i);
                break;
            }
        }
        
        // Reverse the subarray after idx
        reverse(nums, idx + 1, n - 1);
    }
    
    // Helper function to swap two elements in an array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Helper function to reverse a subarray
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
