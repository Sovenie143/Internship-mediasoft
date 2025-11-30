import java.util.Objects;

public class Car implements Comparable<Car>{
    private String VIN;
    private String model;
    private String manufacturer;
    private int year;
    private int mileage;
    private double price;

    public Car(String VIN, String model, String manufacturer, int year, int mileage, double price){
        this.VIN = VIN;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public String getVIN() {
        return VIN;
    }

    public String getModel(){
        return model;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Car that = (Car) obj;
        
        return Objects.equals(VIN, that.VIN);
    }

    @Override
    public int hashCode(){
        return Objects.hash(VIN);
    }

        public int compareTo(Car other){
        return Integer.compare(other.year, this.year);
    }

    @Override
    public String toString(){
        return String.format("Car{VIN='%s', model='%s', manufacturer='%s', year='%d', mileage='%d', price=%.2f}",
            VIN, model, manufacturer, year, mileage, price);
    }

    

}
