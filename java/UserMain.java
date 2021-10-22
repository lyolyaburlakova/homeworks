import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMain {
    public static ArrayList<User> createUsers(){
        ArrayList<User> users = new ArrayList<>() ;
        String[] surname = {
                "Potter","Granger",
                "Weasley","Jordan",
                "Longbottom","Lovegood",
                "Patil", "Chang",
                "Bell", "Creevey"};
        String[] name = {
                "Harry","Hermione",
                "Ron","Lee",
                "Neville","Luna",
                "Parvati","Cho",
                "Katie", "Colin"};
        int[] age = {15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        for(int i = 0; i< 10; i++){
            users.add(new User(surname[i],name[i],age[i]));
        }
        return users;
    }
    public static Map<Integer, User> processUsers(ArrayList<User> users){
        Map<Integer, User> mapOfages= new HashMap<>();
        for(int i = 0; i< 10; i++){
            mapOfages.put(users.get(i).getAge(), users.get(i));
        }
        return mapOfages;
    }
    public static void printMap(Map<Integer,User> map){
        for(Map.Entry<Integer, User> i : map.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>(createUsers());
        Map<Integer, User> map = processUsers(users);
        printMap(map);
    }
}
