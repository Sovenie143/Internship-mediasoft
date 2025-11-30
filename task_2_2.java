import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class task_2_2 {
    public static void main(String[] args){
        List<String> carModels = new ArrayList<>(Arrays.asList(
            "Toyota Camry", "BMW X5", "Tesla Model S", "Honda Civic",
            "Toyota Camry", "Tesla Model 3", "Audi A4", "BMW X5",
            "Mercedes C-Class", "Tesla Model Y", "Ford Focus"));
        System.out.println("List of cars: " + carModels);
        
        Set<String> uniqueModels = new LinkedHashSet<>(carModels);
        // используем LinkedHashSet потому, что сохраняется порядок вставки при хранении уникальных элементов
        List<String> sortedModels = new ArrayList<>(uniqueModels);
        Collections.sort(sortedModels);
        

        System.out.println("An ordered list of cars without duplicates: " + sortedModels);
        Set<String> Models = new TreeSet<>();
        Models.addAll(sortedModels);
        
        List<String> elCars = new ArrayList<>(Models);
        for (int i = 0; i < elCars.size(); i++){
            if (elCars.get(i).toLowerCase().contains("tesla")){
                elCars.set(i, "ELECTRO_CAR");
            }            
        }

        System.out.println("List of cars after replacement: " + elCars);
    }
}
