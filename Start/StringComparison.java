public class StringComparison {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "Banana";

        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographic order.");
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2 + " in lexicographic order.");
        } else {
            System.out.println(str1 + " and " + str2 + " are equal when ignoring case.");
        }
    }
}
