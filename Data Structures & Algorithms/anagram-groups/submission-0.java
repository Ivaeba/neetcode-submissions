class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();


    for (String s : strs) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        count[c - 'a']++;
        }
        String key = Arrays.toString(count);
        if(map.containsKey(key)){
            map.get(key).add(s);
        }
        else{
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        }
        return new ArrayList<>(map.values());
    }
}
