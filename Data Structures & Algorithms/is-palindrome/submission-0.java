class Solution {
    public boolean isPalindrome(String s) {
        String str ="";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z' ||
               ch >= 'A' && ch <='Z' ||
               ch >= '0' && ch <= '9'){
                str += Character.toLowerCase(ch);
               }
        }

        int j=0;
        int z=str.length()-1;
        while(j<z){
            if(str.charAt(j) != str.charAt(z)){
                return false;
            }
            j++;
            z--;
        }

        return true;
    }
}
