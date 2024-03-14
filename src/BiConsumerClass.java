import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerClass {
    public static void showDetails(String name,Integer age)
    {
        System.out.println(name+"  "+age);
    }

    public static void MapDisplay(Map<Integer, String> map, String MapName)
    {
        System.out.println("------------"+MapName+"----------------");
        map.forEach((key,value)-> System.out.println(key+"  "+value));
    }


    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer=BiConsumerClass::showDetails;
//        biConsumer.accept("Satish",22);
//        biConsumer.accept("Priyanka",32);

        Map<Integer,String> data= new HashMap<Integer,String>();
        data.put(101,"Aakash");
        data.put(102,"Rajat");
        data.put(103,"Shubham");

        BiConsumer<Map<Integer,String>,String> biConsumer2= BiConsumerClass::MapDisplay;
        biConsumer2.accept(data,"Employee Data");

    }
}
