package HashMap;

import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[]args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "A");
        hashMap.put(1, "B");
        hashMap.put(6, "");
        hashMap.put(null, "nullp");
        hashMap.put(3, "F");
        hashMap.put(4, "null");
        hashMap.put(12, "null");
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        for(Integer key : hashMap.keySet()) {
            System.out.println(hashMap.get(key).contains("p"));
        }


    }
}
