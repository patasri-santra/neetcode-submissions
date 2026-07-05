class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, (map.containsKey(ch))? map.get(ch)+1 : 1);
        }

        for(int j=0; j<t.length(); j++){
            char sh = t.charAt(j);
            if(map.containsKey(sh) && map.get(sh) > 0){
                map.put(sh, map.get(sh)-1);
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}
