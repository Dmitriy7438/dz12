import ru.netology.product.Product;

public class Smartphone extends Product {

    private String manufacturer;

    public Smartphone(String name, String manufacturer) {
        super(name);
        this.manufacturer = manufacturer;
    }
}
