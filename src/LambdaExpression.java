import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
@FunctionalInterface
interface Animal
{
        public void eat();
        public default void type(String type)
        {
            System.out.println("Animal is "+type+" type");
        }
        public static void size(String size)
        {
            System.out.println("Animal is "+size+" size");
        }


}


public class LambdaExpression {
    public static void main(String[] args) {
        Animal an=()->{
            System.out.println("Animal its biscuit");
        };
        an.eat();
        an.type("Wild");
        Animal.size("BIG");
    }
}
