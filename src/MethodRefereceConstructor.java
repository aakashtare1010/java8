
interface Message
{
    public void say(String msg);
}
public class MethodRefereceConstructor {

    MethodRefereceConstructor(String message)
    {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Message mg=MethodRefereceConstructor::new;
        mg.say("This is method reference bu using constructor");
    }
}
