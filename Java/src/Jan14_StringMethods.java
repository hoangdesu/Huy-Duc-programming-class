import java.util.Locale;

public class Jan14_StringMethods {
    public static void main(String[] args) {
        String name = "Jack";

        System.out.println(name.toUpperCase());
        System.out.println(name);

        System.out.println(name.toLowerCase());

        System.out.println(name.charAt(2));

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

//        Ex: palindrome

//        An | na
//
//                Ra d ar

//        input: enter a word: madam
//            madam is a palindrome
//
//                enter a word: hello
//                hello is not a palindrome
    }

//    methods: reusable blocks of code
}
