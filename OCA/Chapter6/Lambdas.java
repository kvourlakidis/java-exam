import java.util.function.Predicate;

public class Lambdas {
    private boolean instanceBool = false;
    private Predicate<String> instancePredicate = x -> instanceBool;

    private static Predicate<String> staticPredicate = x -> true;

    public static void main(String[] args) {
        Predicate<String> localPredicate1 = (s) -> s.length() > 5;
        Predicate<String> localPredicate2 = x -> x == "a string";
        Predicate<String> localPredicate3 = (String s) -> { return false; };
        Predicate<String> classPredicate = new PredicateClass();
        Predicate<String> staticMethodPredicate = Lambdas::staticMethod;

        localPredicate1.test("a string");
        classPredicate.test("");

        boolean ok = staticPredicate.test("whatever");
        System.out.println(ok);

        testString("this string is 28 chars long", s -> s.length() == 28);

        staticMethodPredicate.test("This is boring now");
    }

    static class PredicateClass implements Predicate<String> {
        public boolean test(String s) {return false;}
    }

    static boolean staticMethod(String s) { return false; }

    static void testString(String s, Predicate<String> test) {
        System.out.println(test.test(s));
    }
}