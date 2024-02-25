public class StringAllClassMethods {
    public static void main(String args[]) {
        String Str1 = "Hello";
        String Str2 = " World";
        String Str3 = " Deepu";
        String Str4 = "Deepanshu Singh Rajput";
        String Str5 = "HELLO";

        // All String Class Methods
        System.out.println("charAt(0): " + Str1.charAt(0));
        System.out.println("length(): " + Str1.length());
        System.out.println("substring(0, 16): " + Str4.substring(0, 16));
        System.out.println("concat(Str3).concat(Str2): " + Str1.concat(Str3).concat(Str2));
        System.out.println("replace('H', 'h'): " + Str1.replace('H', 'h'));
        System.out.println("equalsIgnoreCase(Str5): " + Str1.equalsIgnoreCase(Str5));
        System.out.println("equals(Str5): " + Str1.equals(Str5));
        System.out.println("toUpperCase(): " + Str1.toUpperCase());
        System.out.println("toLowerCase(): " + Str1.toLowerCase());
        System.out.println("indexOf('e'): " + Str4.indexOf('e'));
        System.out.println("endsWith(\"Rajput\"): " + Str4.endsWith("Rajput"));
    }
}
