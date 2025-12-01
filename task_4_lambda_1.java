public class task_4_lambda_1 {
    public static void main(String[] args) {
        Printable str = () -> System.out.println("Printing");
        str.print();
    }
}
