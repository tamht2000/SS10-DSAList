import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("uy", "UY");
        stringMap.put("nam", "NAM");
        stringMap.put("huy", "HUY");
        System.out.println(stringMap);

        System.out.println(stringMap.values());
        System.out.println(stringMap.containsKey("uy"));
        System.out.println(stringMap.containsValue("Nam"));
        System.out.println(stringMap.isEmpty());
        stringMap.replace("uy", "Tâm");
        System.out.println(stringMap);
    }
}
