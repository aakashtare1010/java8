import java.util.function.Predicate;

public class PredicateClass {

    public static boolean voter(Integer num)
    {
        if( num > 18) return true; else return false;
    }
    public static void main(String[] args) {
        Predicate<Integer> pr=n->(n>10);
        System.out.println(pr.test(9));

        Predicate<Integer> pr1=PredicateClass::voter;
        System.out.println(pr1.test(20));
    }


}
