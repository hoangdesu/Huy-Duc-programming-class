import java.util.HashMap;

public class Apr23_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();

//        keys must be unique
//        values can be duplicated

//        vietnam: ha noi
//        korea: seoul

//        Add
        countries.put("vietnam", "Ha Noi");
        countries.put("japan", "Kyoto");
        countries.put("korea", "Seoul");
        countries.put("france", "Paris");

//        Access
        System.out.println(countries.get("vietnam"));

//        Overwriting
        countries.put("japan", "Tokyo");
        System.out.println(countries.get("japan"));

//        System.out.println(countries.get("france"));
        if (countries.containsKey("france")) {
            System.out.println(countries.get("france"));
        } else {
            System.out.println("france is not in the hashmap");
        }

    }
}
