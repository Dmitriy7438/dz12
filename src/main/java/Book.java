import ru.netology.product.Product;

public class Book extends Product {

    private String author;


    public Book(String name, String author) {
        super(name);
        this.author = author;
    }
}
