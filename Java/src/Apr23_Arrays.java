import java.util.HashMap;

public class Apr23_Arrays {
    public static void main(String[] args) {
//        int[] arr = { 2, 1, 3, 6, 5, 8, 4, 7 };

        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  1 + (int) (Math.random() * 100);
        }

//        2 ways to solve for this:
//            1. array: 2 nested for loops => O(n^2)
//            2. hashmap: a single for loop => O(1) + O(n)
//
//        Time complexity / Big O notation
//
//        Linear O(n): time will take for the algo to run is in linear (1:1)
//        e.g. linear search

        long startTime = System.nanoTime();
        System.out.println(hasDuplicationArray(arr));
        long endTime = System.nanoTime();
        System.out.println("Array took " + (endTime - startTime) + " milliseconds");


        startTime = System.nanoTime();
        System.out.println(hasDuplicatedHashMap(arr));
        endTime = System.nanoTime();
        System.out.println("HashMap took " + (endTime - startTime) + " milliseconds");


        HW:
        countWordFrequency("hi hello hey hi");

        output:
        {
            hi: 2,
            hello: 1,
            hey: 1
        }

    }

    static boolean hasDuplicationArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }


    static boolean hasDuplicatedHashMap(int[] arr) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int n : arr) {
            if (!seen.containsKey(n)) {
                seen.put(n, 1);
            } else {
                return true;
            }
        }

        return false;
    }

    HashMap<String, Integer> countWordFrequency(String s) {

    }
}
