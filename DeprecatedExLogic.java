import java.lang.reflect.Method;

public class DeprecatedExLogic {
    public static void logicClass(Class<?> anyClass) {
        if (anyClass.isAnnotationPresent(DeprecatedEx.class)){
            DeprecatedEx annotation = anyClass.getAnnotation(DeprecatedEx.class);
            System.out.println("! класс '" + anyClass.getSimpleName() + "' устарел - альтернатива: '" + annotation.message() + "'");
        }

        for (Method method : anyClass.getDeclaredMethods()){
            if (method.isAnnotationPresent(DeprecatedEx.class)){
            DeprecatedEx annotation = method.getAnnotation(DeprecatedEx.class);
            System.out.println("! метод '" + method.getName() + "' устарел - альтернатива: '" + annotation.message() + "'");
        }
        }
    }
}
