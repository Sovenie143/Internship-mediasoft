import java.util.Arrays;
import java.util.Random;

public class task_2_1 {
    public static void main(String[] args){
        int[] arr = new int[50];
        double n = 0;

        System.out.println("Cars with year of release 2015 and above:");
        for (int i = 0; i < 50; i++){
            arr[i] = new Random().nextInt(26) + 2000;
            
            if (arr[i] >= 2015){
                System.out.println("Car number " + i + ", car year " + arr[i]);
            }

            n += 2025 - arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Average age of cars = " + n/50);
        
    }
}
