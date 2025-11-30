import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class task_2_4 {
    public static void main(String[] args){
        List<Car> cars = Arrays.asList(
            new Car("VIN001", "Camry", "Toyota", 2020, 50000, 25000),
            new Car("VIN002", "X5", "BMW", 2022, 30000, 45000),
            new Car("VIN003", "Civic", "Honda", 2018, 80000, 18000),
            new Car("VIN004", "Corolla", "Toyota", 2019, 60000, 20000),
            new Car("VIN005", "Model 3", "Tesla", 2023, 15000, 35000)
        );
        System.out.println("List of cars:");
        cars.forEach(System.out::println);

        List<Car> lowMileage = cars.stream().filter(car -> car.getMileage() < 50000).collect(Collectors.toList());
        System.out.println("Cars with mileage less then 50 000:");
        lowMileage.forEach(System.out::println);

        List<Car> sortPrice = cars.stream().sorted((c1, c2) -> Double.compare(c2.getPrice(), c1.getPrice())).collect(Collectors.toList());
        System.out.println("Sorted cars:");
        sortPrice.forEach(System.out::println);

        List<Car> topCar = sortPrice.stream().limit(3).collect(Collectors.toList());
        System.out.println("Top-3 cars:");
        topCar.forEach(car -> System.out.printf("%s - %.2f\n", car.getModel(), car.getPrice()));

        double averageMileage = cars.stream().mapToInt(Car::getMileage).average().orElse(0.0);
        System.out.printf("Average mileage = %.2f\n", averageMileage);

        Map<String, List<Car>> carGroup = cars.stream().collect(Collectors.groupingBy(Car::getManufacturer));
        carGroup.forEach((manufacturer, carList) -> {
            System.out.println("\n" + manufacturer + ":");
            carList.forEach(car -> System.out.println(car.getModel()));
        });

    }
}
