import java.util.Scanner;

public class May20_Hangman {
    public static void main(String[] args) {
//        String: array of characters
//            "Duc": 'D' + 'u' + 'c'
//        Strings are immutable

//        String name = "Duc"; // -> Duk
//
////        name = "Duk";
//
//        System.out.println(name.charAt(2));

//        name[2] = 'k';
//        char[] name2 = {'D', 'u', 'c', '\0'}; // in C/C++ languages
//        char[20] name
//                20 - 4 = 16

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (true) {
            if (something wrong) {
                System.out.println("error message here");
                continue;
            }

            methods 2

            methods 3
        }

        ensure that the input only has 1 char -> string.length == 1
        valid chars: a-z

        String description = "Vietnamese noodle soup originated from the central of Vietnam";
        String word = "bunbohue";
        char[] answer

//        answer.equals(word)

        The word has 8 letters
        "description"
        Enter your guess: a
        No letter 'a' in the word
        _ _ _ _ _ _ _ _

        Enter your guess: b
        There are 2 'b's in the word
        b _ _ b _ _ _ _


        Enter your guess: b
        There are 2 'b's in the word
        b u n b o h u e

        Congratulations! The answer is "bunbohue"

    }
}
