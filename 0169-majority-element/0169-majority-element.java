class Solution {
    public int majorityElement(int[] nums) {
                int n = nums.length;
        // for(int i=0; i<nums.length; i++) {
        //     int cnt = 0;
        //     for(int j=0; j<nums.length; j++) {
        //         if(nums[i] == nums[j]) {
        //             cnt++;
        //         }
        //         if(cnt > (n/2)) {
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;

        //Better - Hashmap
        // HashMap<Integer, Integer> mpp = new HashMap<>();

        // //storing elements with its occurence
        // for(int i =0; i<n; i++) {
        //     int value = mpp.getOrDefault(nums[i], 0);
        //     mpp.put(nums[i], value+1);
        // }

        // //searching for the majority element
        // for(Map.Entry<Integer, Integer> key : mpp.entrySet()) {
        //     if(key.getValue() > (n/2)) {
        //         return key.getKey();
        //     }
        // }

        //Moore's Voting Algorithm
        int cnt = 0;
        int cnt1 = 0;
        int ele = -1;

        for(int i=0; i<n; i++) {
            if(cnt == 0) {
                cnt = 1;
                ele = nums[i];
            } else if(nums[i] == ele) {
                cnt++;
            } else {
                cnt--;
            }
        }
        for(int i=0; i<n; i++) {
            if(nums[i] == ele) {
                cnt1++;
            }
        }
        if(cnt1 > (n/2)) {
            return ele;
        }
        return -1;
    }
}