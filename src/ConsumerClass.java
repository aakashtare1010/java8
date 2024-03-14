import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerClass {

    public static void sum(List<Integer> list)
    {
      int result=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<Integer> data= Stream.of(11,20,30,40).toList();


        Consumer<List<Integer>> consumer= ConsumerClass::sum;
        consumer.accept(data);

    }

}
