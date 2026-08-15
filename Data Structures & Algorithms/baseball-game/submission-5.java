class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int top = record.pop();
                int newTop = top + record.peek();
                record.push(top);
                record.push(newTop);
            } else if (op.equals("D")) {
                record.push(record.peek() * 2);
            } else if (op.equals("C")) {
                record.pop();
            } else {
                record.push(Integer.parseInt(op));
            }
        }
        
        int total = 0;
        for (int score : record) {
            total += score;
        }
        return total;
    }
}