class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (ans.isEmpty() || ans.pop() != map.get(c)) return false;
            } else {
                ans.push(c);
            }
        }
        return ans.isEmpty();
    }
}
