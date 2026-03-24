class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Let's code Java";
        String output = reverseWords(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed Words: " + output);
    }
}