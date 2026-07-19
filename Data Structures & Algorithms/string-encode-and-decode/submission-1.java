class Solution { // Optimal

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s: strs){
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++; // This represents the length
            }
            int length = Integer.parseInt(str.substring(i, j)); // converts the substring into an integer length
            i = j + 1; // move i to the character right after '#'
            j = i + length; 
            res.add(str.substring(i, j)); 
            i = j;
        }
        return res;
    }
}
