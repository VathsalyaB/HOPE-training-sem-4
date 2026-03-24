class BalancedStringSplit {

    public static int balancedStringSplit(String s) {
        int count = 0;  
        int balance = 0; 

        for (char c : s.toCharArray()) {
            if (c == 'R') balance++;
            else balance--;

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int result = balancedStringSplit(s);

        System.out.println("Maximum balanced substrings: " + result);
    }
}