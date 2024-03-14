
interface ABC
{
    public void print();
}
public class AllMethodReference {
    public static void staticMethod()
    {
        System.out.println("Reffering Static Method ");
    }
    public void instanceMethod()
    {
        System.out.println("Refering Instance Method");
    }
    AllMethodReference()
    {
        System.out.println("Refering Constructor");
    }

    public static void main(String[] args) {
        ABC staticABC=AllMethodReference::staticMethod;
       staticABC.print();
        ABC instanceABC=new AllMethodReference()::instanceMethod;
       instanceABC.print();
        ABC constructorABC=AllMethodReference::new;
        constructorABC.print();

    }
}
