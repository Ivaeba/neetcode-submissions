class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
    for (String str : strs) {
        result.append(str.length()).append("#").append(str);
        }
    return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
    
        while (i < str.length()) {
        // 1. Найди позицию '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
        
            // 2. Прочитай число (длину строки)
            int length = Integer.valueOf(str.substring(i, j));
        
            // 3. Извлеки саму строку
            String decoded = str.substring(j + 1, j + 1 + length);
            result.add(decoded);
        
        // 4. Переместись на следующую строку
                i = j + 1 + length;
            }
    
        return result;
    }
}
