class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int posIndex = 0;
        int negIndex = 1;
        int n = nums.length;

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) {
                ans.set(posIndex, nums[i]);
                posIndex += 2;
            } else {
                ans.set(negIndex, nums[i]);
                negIndex += 2;
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    
    }
}