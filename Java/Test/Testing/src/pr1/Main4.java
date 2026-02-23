package pr1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Jose");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        System.out.println(nombres);
        for (int i = 0; i < nombres.size(); i++) {
            for (int j = i + 1; j < nombres.size(); ) {
                if (nombres.get(i).equals(nombres.get(j))) {
                    nombres.remove(j);
                } else {
                    j++;
                }
            }
        }
        System.out.println(nombres);
        String[] nombres2 = new String[nombres.size()];
        nombres.toArray(nombres2);
        System.out.println(Arrays.toString(nombres2));

    }
}
