

interface InstanceInterface
{
    public void display();
}

public class MethodReferenceByInstanceMthod {
    public static void staticMethodCall()
    {
        System.out.println("this is static Method");
    }
    public void empData()
    {
        System.out.println("this is Method referece by using Instance Method");
    }

    public static void main(String[] args) {
        MethodReferenceByInstanceMthod mi= new MethodReferenceByInstanceMthod();
        InstanceInterface ii=mi::empData;
        ii.display();
        InstanceInterface if2=new MethodReferenceByInstanceMthod()::empData;
        if2.display();

        //same way static method call
        InstanceInterface if3=MethodReferenceByInstanceMthod::staticMethodCall;
        if3.display();

    }
}
