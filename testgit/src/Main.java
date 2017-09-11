import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key1",1);
        map.put("key2",2);
        map.put("key3",3);
        map.put("key4",4);
        map.put("key5",5);

        System.out.println(map);

    }
}
