class Solution {
    public int lengthOfLastWord(String s) {
        // int n = s.length();
        // String start = "";

        // StringBuilder sb = new StringBuilder(start);

        // for(int i=n - 1; i>=0; i--) {
        //     if(s.charAt(i) != ' ') {
        //         start = String.valueOf(s.charAt(i));

        //         while(!start.equals(" ")) {
        //             break;
        //         }
        //     }
        // }
        // int length = sb.length();
        // return length;

        // int n = s.length();
        // int count;

        // int i = n-1;
        // while(i >= 0 && s.charAt(i) == ' ') {
        //     i--;
        // }

        // while(i >= 0 && s.charAt(i) != ' ') {
        //     count++;
        //     i--;
        // }

        // return count;

        int n = s.length();
        int count=0;

        for(int i=n - 1; i>=0; i--) {
            if(s.charAt(i) == ' ') {
                continue;
            }

            while(i >= 0 && s.charAt(i) != ' ') {
                count++;
                i--;
            }
            break;
        }
        return count;
    }
}