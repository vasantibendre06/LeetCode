class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int n = nums.length;
        int cnt = 0;
    
        for(int i=0; i<n; i++){
            if(nums[i] == 1) {
                cnt++;
                maxCount = Math.max(maxCount, cnt);
            } else {
                cnt = 0;
            }
        }
        return maxCount;
    }
}