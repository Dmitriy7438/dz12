import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.product.Product;
import ru.netology.repository.ProductRepository;
import static org.junit.jupiter.api.Assertions.*;

public class ProductManagerTest {
    Book book1 = new Book("Тромб", "Гримм");
    Smartphone smartphone1 = new Smartphone("Гэлакси", "Самсунг");
    Book book2 = new Book("Коробка", "Агеев");

    @Test
    public void myTest1() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        manager.add(book1);
        manager.add(smartphone1);
        manager.add(book2);

        Product[] actual = manager.searchBy("ро");
        Product[] expected = { book1, book2 };

        assertArrayEquals(expected, actual);

    }

    @Test
    public void myTest2() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        manager.add(book1);

        Product[] actual = manager.searchBy("ро");
        Product[] expected = { book1 };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void myTest3() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        Product[] actual = manager.searchBy("ро");
        Product[] expected = new Product[0];

        assertArrayEquals(expected, actual);
    }
}
