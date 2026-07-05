class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> checkGroup = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        HashSet<String> visited = new HashSet<>();
        for(int i=0; i<strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            checkGroup.add(sorted);
        }
        //['act', 'opst', 'opst', 'act', 'opts', 'aht']

        for(int i=0; i<checkGroup.size(); i++){
            String word = checkGroup.get(i);

            if(visited.contains(word)) continue;

            List<String> group = new ArrayList<>();
            for(int j=0;j<checkGroup.size();j++){
                
                if(checkGroup.get(j).equals(word)){
                    group.add(strs[j]);
                }
            }
            visited.add(word);
            result.add(group);
        }

        return result;
    }
}
