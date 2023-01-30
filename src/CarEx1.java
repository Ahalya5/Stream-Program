import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarEx1 {
    public static void main(String[] args) {
        ArrayList<Car> carObj = new ArrayList<>();
        carObj.add(new Car(1, "Hyundai ", 1000000, 10));
        carObj.add(new Car(2, "Maruti Swift ", 5000000, 200));
        carObj.add(new Car(3, "Maruti Wagon R ", 10000000, 20));
        carObj.add(new Car(4, "Toyota Fortune ", 100000, 30));
        carObj.add(new Car(5, "Honda City ", 200000, 40));

        carObj.stream()
                .filter(c -> c.getPrices()==10000000)
                .forEach(c -> System.out.println(c.getName()));


        }
    }

