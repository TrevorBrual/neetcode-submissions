class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (String s : strs){
            int[] count = new int [26];
            for (char c : s.toCharArray()){
                count[c - 'a']++; // By subtracting 'a' (97) from any character, we map it to an index from 0 to 25 in the count array
            }
            String key = Arrays.toString(count);
            mp.putIfAbsent(key, new ArrayList<>()); // If we haven't seen this specific signature before, we create an empty list for it in the map.
            mp.get(key).add(s); // We grab the list associated with our signature and add the current word to it.
        }
        return new ArrayList<>(mp.values());
    }
} 
