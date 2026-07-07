class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map = new HashMap<>();

       int i=0;
       int j=0;
       int len=0;
       int n=0;
       while(j<s.length()){
        char ch = s.charAt(j);
        if(map.containsKey(ch)){
            i = Math.max(i, map.get(ch) + 1);
            n=0;
        }
            map.put(ch,j);
            n=j-i+1;
            len = Math.max(len,n);
            j++;
       }

       return len;
    }
}
