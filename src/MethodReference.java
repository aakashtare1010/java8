

//used to refer method of functional interface
//it is compact and easy form of lambda expression.
//each time when you are using lambda expression to just refering method.
@FunctionalInterface
interface Vehicle
{
    public void print();
}
public class MethodReference {

    public static void size()
    {
        System.out.println("static method");
    }
    public void type()
    {
        System.out.println("instance method");
    }
    public static void main(String[] args) {
        Vehicle vc=MethodReference::size;
        vc.print();
        MethodReference rd= new MethodReference();
        Vehicle vc1=rd::type;
        vc1.print();


    }
}
