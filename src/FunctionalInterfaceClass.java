
interface Double
{
    public default void dmethod()
    {
        System.out.println("this is double method");
    }


}
@FunctionalInterface
interface Single extends Double
{
    public void Single(String msq);

}
public class FunctionalInterfaceClass implements Single {
    @Override
    public void Single(String msq) {
        System.out.println(msq);
    }

    public static void main(String[] args) {
        FunctionalInterfaceClass fic=new FunctionalInterfaceClass();
        fic.Single("This is msg");
        fic.dmethod();
    }
}
