class Solution {
    public int reverse(int x) {

        double rev = 0;
        int flag = 0;

        if (x < 0) {
            x = x * -1;
            flag = 1;
        }

        while (x > 0) {
            int num = x % 10;
            rev = rev * 10 + num;
            x = x / 10;
        }

        if (flag == 1) {
            rev = rev * -1;
        }
        
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}