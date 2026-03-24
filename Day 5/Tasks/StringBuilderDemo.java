public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("I");
        sb.append(" am");
        sb.append(" learning");

        sb.insert(5, " currently");

        sb.append(" Java");

        int start = sb.indexOf("learning");
        int end = start + "learning".length();
        sb.replace(start, end, "mastering");

        sb.append("!");

        System.out.println("Final Sentence: " + sb);

        sb.setCharAt(sb.length() - 1, '?');
        System.out.println("After changing tone: " + sb);
    }
}