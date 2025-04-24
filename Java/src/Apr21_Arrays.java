public class Apr21_Arrays {
    public static void main(String[] args) {
//        1. static array: length of the array is fixed
//        2. dynamic array (ArrayList): varied length of the array



//        1. ask the user for many items in the array
//        2. create a static array with that length, default to 0


//        Math.random(): 0.0 -> 0.999

//        random from 1 to 100
//        Math.random() * 100 => 0.0 - 99.999
//        (int) Math.floor(Math.random() * 99) + 1


//        Selection sort
//        Bubble sort


        int[] arr = {3, 2, 5, 7, 6, 1};

//        sort ascending using selection sort
//      | 3, 2, 5, 7, 6, 1
//        1 | 2, 5, 7, 6, 3
//        1, 2 | 5, 7, 6, 3
//        1, 2, 3 | 7, 6, 5
//        1, 2, 3, 5 | 6, 7
//        1, 2, 3, 5, 6 | 7 => sorted


        int a = 1;
        int b = 2;

//        swap a & b

        int temp = a;
        a = b;
        b = temp;


//        System.out.println(a); // 2
//        System.out.println(b); // 1

//        Duplicated numbers: 16, 38
//
////        HashMap: key-value pairs
//        => nested loops
//        if a number is duplicated. add that num to ArrayList


    }
}
