class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int minElement = nums[0];
        int n = nums.length;

        for(int i=1; i<n; i++) {
            if(nums[i] > minElement) {
                maxDiff = Math.max(maxDiff, nums[i] - minElement);
            } else {
                minElement = nums[i];
            }
        }
        
        return maxDiff;
    }
}