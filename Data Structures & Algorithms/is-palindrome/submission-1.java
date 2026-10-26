class Solution { // Two Pointers
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r){
            while(l < r && !alphaNum(s.charAt(l))){ //Skips inner while loop if not alphanumeric
                l++;
            }
            while(r > l && !alphaNum(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++; 
            r--;
        }
        return true;
    }

    public boolean alphaNum(char c){ // checks whether a single character (c) is an alphabetic letter or a number
        return (c >= 'A' && c <= 'Z' || c>= 'a' && c<= 'z' || c>= '0' && c<= '9');
    }
}
