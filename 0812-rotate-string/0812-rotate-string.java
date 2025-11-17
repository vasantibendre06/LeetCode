class Solution {
    public boolean rotateString(String s, String goal) {
        String rot = s;
        for(int i=0; i<=s.length(); i++) {
            rot = swap(rot);
            System.out.println(rot);
            if(rot.equals(goal)) {
                return true;
            }
        }
        return false;
    } 

    private String swap(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<s.length() - 1; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(i+1)); 
            sb.setCharAt(i+1, temp);
         }

        return sb.toString();
    }
}