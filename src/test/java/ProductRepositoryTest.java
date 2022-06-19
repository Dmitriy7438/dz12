import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.product.Product;
import ru.netology.repository.ProductRepository;

public class ProductRepositoryTest {
    Product first = new Product(1, "first", 20);
    Product second = new Product(2, "second", 30);
    Product third = new Product(3, "third", 40);

    @Test
    public void myTest() {
        ProductRepository repo = new ProductRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);

        repo.removeById(2);

        Product[] actual = repo.findAll();
        Product[] expected = {first, third};

        Assertions.assertArrayEquals(expected, actual);
    }
}
