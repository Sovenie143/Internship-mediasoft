@DeprecatedEx(message = "используйте NewClass вместо OldClass")
public class testClass {
    @DeprecatedEx(message = "используйте NewMethod вместо OldMethod")
    public void OldMethod(){
        System.out.println("старый метод");
    }

    public void NewMethod(){
        System.out.println("новый метод");
    }
}


