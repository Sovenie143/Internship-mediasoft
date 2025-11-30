import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class task_2_3 {
    public static void main(String[] args){
        Car car1 = new Car("VIN001", "Camry", "Toyota", 2020, 50000, 25000);
        Car car2 = new Car("VIN002", "X5", "BMW", 2022, 30000, 45000);
        Car car3 = new Car("VIN003", "Civic", "Honda", 2018, 80000, 18000);
        Car car4 = new Car("VIN001", "Corolla", "Toyota", 2019, 60000, 20000);
        Car car5 = new Car("VIN004", "Model 3", "Tesla", 2023, 15000, 35000);

        Set<Car> carSet = new HashSet<>();
        System.out.println("add car1 " + carSet.add(car1));
        System.out.println("add car2 " + carSet.add(car2));
        System.out.println("add car3 " + carSet.add(car3));
        System.out.println("add car4 " + carSet.add(car4));
        System.out.println("add car5 " + carSet.add(car5));
        
        System.out.println("Cars into HashSet:");
        for (Car car: carSet){
            System.out.println(car);
        }

        List<Car> carlist = new ArrayList<>(carSet);
        Collections.sort(carlist);

        System.out.println("Sorted cars(year):");
        for (Car car: carlist){
            System.out.println(car);
        }
    }
}
