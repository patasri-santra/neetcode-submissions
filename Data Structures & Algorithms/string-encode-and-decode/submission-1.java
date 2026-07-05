class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        for(int i=0; i<strs.size(); i++){
            String s = strs.get(i);  // hello,  world
            int n= s.length();     //5, 5
            encoded_string += n + "#" + s; //"5#hello5#world"
        }

        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();

        int i=0; 
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int n = Integer.parseInt(str.substring(i,j));

            String word = str.substring(j+1, j+1+n);

            decoded_strs.add(word);
            i=j+1+n;
        }

        return decoded_strs;
    }
}
