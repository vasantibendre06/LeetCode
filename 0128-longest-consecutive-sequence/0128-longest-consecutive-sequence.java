class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        int n = nums.length;
        int longest = 1;
        int currCnt = 0;
        int lastSmall = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(nums[i]-1 == lastSmall) {
                currCnt += 1;
                lastSmall = nums[i];
            } else if(nums[i] != lastSmall) {
                currCnt = 1;
                lastSmall = nums[i];
            }
            longest = Math.max(longest, currCnt);
        }
        return longest;
    }
}