import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectStream {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        List<String> productNames = productList.stream()
                .map(Product::getName)
                .toList();

        String productNamesJoin = productList.stream().map(Product::getName)
                .collect(Collectors.joining(", ", "[", "]"));

        Double averageOfCount = productList.stream()
                .collect(Collectors.averagingInt(value -> value.getCnt()));

        productList.stream().mapToInt(Product::getCnt).sum();

        Map<Boolean, List<Product>> mapPartioned = productList.stream()
                .collect(Collectors.partitioningBy(element -> element.getCnt() > 15));
        /*********************************************/

        productNames.stream()
                .forEach(System.out::println);

        System.out.println(productNamesJoin);

        System.out.println(averageOfCount);



    }
}


class Product {
    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int cnt;
    private String name;

    public Product(int cnt, String name) {
        this.cnt = cnt;
        this.name = name;
    }
}
