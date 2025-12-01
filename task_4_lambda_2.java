import java.util.function.Predicate;

public class task_4_lambda_2 {
    public static void main(String[] args) {
        Predicate<String> notNull = str -> str!= null;
        Predicate<String> notEmpty = str -> !str.isEmpty();
        Predicate<String> notEmptyNull = notNull.and(notEmpty);

        String str1 = "";
        String str2 = null;
        String str3 = "Java";

        System.out.println(notEmptyNull.test(str1));
        System.out.println(notEmptyNull.test(str2));
        System.out.println(notEmptyNull.test(str3));    
    }
}
