class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size();
        int interest = -1;
        for(int i=n-1;i>0;i--) {
            cout<<i<<endl;
            if (nums[i-1]<nums[i]) {
                interest = i-1;
                break;
            }
        }
        if (interest == -1) {
            sort(nums.begin(), nums.end());
            return;
        }
        int index =  greaterThanXIndex(nums, interest+1, n-1, nums[interest]);
        swap(nums[interest], nums[index]);
        sort(nums.begin()+interest+1, nums.end());
        return;
    }

    int greaterThanXIndex(vector<int> nums, int j, int k, int x) {
        int mm = j;
        for (int i=j;i<=k;i++) {
            if (nums[i] > x && nums[i] < nums[mm]) {
                mm = i;
            }
        }
        return mm;
    }
};