class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i < n;i++){
            ans.add(nums[i]);
        }
        int longest = 0;
        for (int num : ans) {
            if (!ans.contains(num - 1)) {
                int length = 1;
                while (ans.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
    return longest;

    }
}
