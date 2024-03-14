import java.util.*;
import java.util.stream.Collectors;
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamApiMapClass {

    public static void main(String[] args) {
        List<Integer> numlist= Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> mul=numlist.stream().map(x ->x*x).collect(Collectors.toList());
        System.out.println(mul);

        List<Integer> evenN = numlist.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(evenN);

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Product> ledata=productsList.stream().for(Product product : productsList)->{
            System.out.println();
        };

        List<Float> pro= productsList.stream().filter(x ->x.price> 20000).map(y -> y.price).collect(Collectors.toList());
        System.out.println(pro);

        Float totalPrice=productsList.stream().map(x->x.price).reduce(0.0f,Float::sum);
        System.out.println(totalPrice);

        double totalPriceN=productsList.stream().collect(Collectors.summingDouble(p->p.price));
        System.out.println(totalPriceN);

        Product maxprice = productsList.stream().max((p1,p2)->(p1.price >p2.price)? 1:-1).get();
        Product miprice=productsList.stream().min((p1,p2)->(p1.price>p2.price)?1:-1).get();
        System.out.println(maxprice.price);
        System.out.println(miprice.price);

        long count=productsList.stream().count();
        System.out.println(count);

        Float lp=productsList.stream().map(x->x.price).collect(Collectors.toSet());
        System.out.println(lp.stream().collect(Collectors.toList()));



    }
}
