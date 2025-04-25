import java.util.ArrayList;
import java.util.HashMap;

public class Apr25_HashMap {
    public static void main(String[] args) {
//        HW:
        System.out.println(countWordFrequency("hi hello hey hi"));

//        output:
//        {
//            hi: 2,
//            hello: 1,
//            hey: 1
//        }

        String[][] wordMatrix = {
            {"apple", "banana", "apple"},
            {"orange", "banana", "grape"},
            {"grape", "apple", "melon"}
        };

        ArrayList<String> uniqueWords = extractUniqueWords(wordMatrix);
        System.out.println(uniqueWords);
    }

    static HashMap<String, Integer> countWordFrequency(String s) {
        String[] words = s.split(" ");
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            // create a pair of { word: 1 } inside the hashmap if the word is not in the hashmap yet
            if (!wordFrequency.containsKey(word)) {
                wordFrequency.put(word, 1);
            } else {
                int currentCount = wordFrequency.get(word);
                int newCount = currentCount + 1;
                wordFrequency.put(word, newCount);
            }
        }

        return wordFrequency;

    }

    static ArrayList<String> extractUniqueWords(String[][] wordMatrix) {
        ArrayList<String> uniqueWords = new ArrayList<>();
//        [apple, grape, banana]

        for (String[] row : wordMatrix) {
            for (String word : row) {
                boolean exists = false;
                for (int i = 0; i < uniqueWords.size(); i++) {
                    if (uniqueWords.get(i).equals(word)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    uniqueWords.add(word);
                }
            }
        }

        return uniqueWords;
    }
}
