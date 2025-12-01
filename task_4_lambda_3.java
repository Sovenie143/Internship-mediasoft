import java.util.function.Predicate;

public class task_4_lambda_3 {
    public static void main(String[] args) {
        Predicate<String> startWith = str -> !str.isEmpty() & str != null 
        & (str.toUpperCase().startsWith("J") | str.startsWith("N")) 
        & str.endsWith("A");

        String str1 = "Jason";
        String str2 = "JAVA";
        String str3 = "NOVA";

        System.out.println(startWith.test(str1));
        System.out.println(startWith.test(str2));
        System.out.println(startWith.test(str3));

    }
}
