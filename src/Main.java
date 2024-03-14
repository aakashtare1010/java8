import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       List<String> list= Stream.of("AAKASH","TARE","PRAJAKTA").toList();



        list.forEach((data)-> System.out.println(data));


    }
}