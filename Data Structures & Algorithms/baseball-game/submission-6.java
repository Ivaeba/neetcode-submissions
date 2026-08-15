class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        int total = 0;
        for (String op : operations) {
            if (op.equals("+")) {
                int top = record.pop();
                int newTop = top + record.peek();
                record.push(top);
                record.push(newTop);
                total += newTop;
            } else if (op.equals("D")) {
                int newTop = record.peek() * 2;
                record.push(newTop);
                total += newTop;
            } else if (op.equals("C")) {
                total -= record.pop();
            } else {
                int score = Integer.parseInt(op);
                record.push(score);
                total += score;
            }
        }
        return total;
    }
}