import java.util.function.BiConsumer;
import java.util.function.BiFunction;

interface Employee
{
    public void display();
}
public class MethodReferenceByStaticMethod {
    public static void EmpData()
    {
        System.out.println("this is method reference by using static method");
    }

    public static void ThreadStatus()
    {
        System.out.println("thread is running");
    }
    public static int Add(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Employee emp=MethodReferenceByStaticMethod::EmpData;
        emp.display();

        Thread t1=new Thread(MethodReferenceByStaticMethod::ThreadStatus);
        t1.start();

        //Addition Program
        BiFunction<Integer,Integer,Integer> adder = MethodReferenceByStaticMethod::Add;
        int result=adder.apply(10,20);
        System.out.println(result);


    }


}
