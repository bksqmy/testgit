import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key1",1);
        map.put("key2",2);
        map.put("key3",4);
        map.put("key3",4);
        map.put("key3",4);

        System.out.println(map);

    }
}
