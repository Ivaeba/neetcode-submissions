class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < 9;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
            }
        for( int j = 0;j < 9;j++){
            for(int r = 0; r < 9;r++){
                char val = board[j][r];
                if(val == '.') continue;
                int boxIndex =  (j / 3) * 3 + r / 3;
                if(rows[j].contains(val) || cols[r].contains(val) || boxes[boxIndex].contains(val)){
                    return false;
                }
            rows[j].add(val);
            cols[r].add(val);
            boxes[boxIndex].add(val);

            }
        }
        return true;
    }
}
