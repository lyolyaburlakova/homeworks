import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Names {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Potter", "Harry");
        map.put("Granger", "Hermione");
        map.put("Weasley", "Ron");
        map.put("Jordan", "Lee");
        map.put("Longbottom", "Neville");
        map.put("Lovegood", "Luna");
        map.put("Patil", "Parvati");
        map.put("Chang", "Cho");
        map.put("Bell", "Katie");
        map.put("Creevey", "Colin");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> newmap = new HashMap<>(map);
        List<String> valueList = new ArrayList<>(newmap.values());

        for(Map.Entry<String, String> i : newmap.entrySet()) {
            valueList.remove(i.getValue());
            if (valueList.contains(i.getValue())){
                removeItemFromMapByValue(map, i.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copymap = new HashMap<>(map);
        for(Map.Entry<String, String> i : copymap.entrySet()) {
            if(i.getValue().equals(value)){
                map.remove(i.getKey());
            }
        }
    }

    public static void printMap(Map<String, String> map) {
        for(Map.Entry<String, String> i : map.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        printMap(map);

    }
}