import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class May19_Arrays {
    public static void main(String[] args) {
//        ArrayList<Integer> nums = new ArrayList<>(10);
        int[] nums1 = new int[10];

//        for-each loop
//        for (int num : nums1) {
//            System.out.println(num);
//        }


        String[] games = new String[5];
//        System.out.println(games.toString());


//        games[0] = "Valorant";
        for (String g : games) {
            g = "Valorant";
//            System.out.println(g);
        }

        for (int i = 0; i < games.length; i++) {
            games[i] = i + ". Valorant";
        }

        for (String g : games) {
            System.out.println(g);
        }


        ArrayList<String> carCollection = new ArrayList<>();
        carCollection.add("Mercedes");
        carCollection.add("Ferrari");
        carCollection.add("Aston Martin");
        carCollection.add("Porsche");


        System.out.println(carCollection.get(2));

        carCollection.set(0, "Lamborghini");



        carCollection.add(2, "Toyota"); // insert

        carCollection.addFirst("Nissan GTR");

        System.out.println("Removed: " + carCollection.remove("Toyota"));

        System.out.println("Remove last: " + carCollection.removeLast());

        System.out.println(carCollection.size());

        System.out.println("Contains Ferrari: " + carCollection.contains("Ferrari"));
        System.out.println("Contains Subaru: " + carCollection.contains("Subaru"));

        System.out.println("Index of Ferrari: " + carCollection.indexOf("Ferrari"));
        System.out.println("Index of Subaru: " + carCollection.indexOf("Subaru"));

        ArrayList<String> hyperCarCollection = new ArrayList<>();
        hyperCarCollection.add("Koenigsegg");
        hyperCarCollection.add("Bugatti");
        hyperCarCollection.add("Pagani");

        carCollection.addAll(hyperCarCollection);

        System.out.println(carCollection);

//        lambda / anonymous function
        hyperCarCollection.forEach(car -> {
            System.out.println("Hypercar: " + car);
        });

//        nums2[i] = nums1[i];

//        Ex1:
//        - Generate a static num array with 10 random intergers from 1-100
//        - Calculate the total of the array
//        - Calculate the average

//        int[] nums = new int[10];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = (int) (Math.random() * 100 + 1);
//            System.out.print(nums[i] + " ");
//        }
//
//        int total = 0;
//        for (int n : nums) {
//            total += n;
//        }
//
//        System.out.println("\nTotal = " + total);
//
//        double avg = (double) total / (double) nums.length;
//        System.out.println("Average = " + avg);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(2);

        AtomicInteger total = new AtomicInteger(0);

        nums2.forEach(n -> {
            total.addAndGet(n);
        });

        total.doubleValue();

        System.out.println(total);









    }
}
