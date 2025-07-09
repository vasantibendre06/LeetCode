class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
        int[] count = new int[501];

    // Count frequencies
        for (int num : arr) {
            count[num]++;
        }

    // Check each value from 1 to 500
        for (int i = 1; i <= 500; i++) {
            if (count[i] == i) {
                res = Math.max(res, i);
            }
        }

        return res;
    }
}