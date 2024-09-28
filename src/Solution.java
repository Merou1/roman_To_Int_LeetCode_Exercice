class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        Integer x1= x;
        String y = x1.toString();
        StringBuilder sb = new StringBuilder("");
        for(int i=y.length()-1;i>=0;i--){
            sb.append(y.charAt(i));
        }
        if (y.equals(sb.toString())){//sb is an object .toString() to covert it to string
            return true;
        }
        else {
            return false;
        }


    }
}