import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {

        ArrayList<Product> productObj = new ArrayList<Product>();
        productObj.add(new Product(1, "perfumes", 1000));
        productObj.add(new Product(2, "laptop", 50000));
        productObj.add(new Product(3, "mobile", 20000));
        productObj.add(new Product(4, "keyboard", 1500));
        productObj.add(new Product(5, "headSet", 2000));

        List<Double> obj = productObj.stream().filter(p -> p.getPrice() < 10000).map(p -> p.getPrice()).collect(Collectors.toList());
        System.out.println("The list price is:" + obj);


    }
}

