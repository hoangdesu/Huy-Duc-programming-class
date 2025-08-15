import java.util.ArrayList;

public class May20_NestedArrays {
    public static void main(String[] args) {
//        2D arrays: static version
//         int[][] phonePad = new int[3][3]; // 3x3: 3 rows x 3 elements on each row (columns)
//
//         int counter = 1;
////         i = row
//         for (int i = 0; i < phonePad.length; i++) {
//             for (int j = 0; j < phonePad[i].length; j++) {
//                 phonePad[i][j] = counter;
//                 counter++;
//             }
//         }
//
////        System.out.println(phonePad);
////        enhanced for loop
//        for (int[] row : phonePad) {
//            for (int num : row) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }


//        2D: dynamic version
        ArrayList<ArrayList<Integer>> phonePad = new ArrayList<>(); // automatically type-inferred
        int rows = 3;
        int cols = 3;

//        [1 2 3] -> row1
//        [4 5 6] -> row2
//        [7 8 9] -> row3

        int counter = 1;

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(counter);
                counter++;
            }
//            System.out.println("Row: " + row);
            phonePad.add(row);
        }

//        System.out.println(phonePad);
        for (ArrayList<Integer> row : phonePad) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
