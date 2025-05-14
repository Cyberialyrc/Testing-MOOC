package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;

public class DiscountApplierTest {

    @Test
    public void applyDiscountsToHomeProduct() {
        Product homeProduct = Mockito.mock(Product.class);
        when(homeProduct.getCategory()).thenReturn("HOME");
        when(homeProduct.getPrice()).thenReturn(100.0);

        ProductDao dao = Mockito.mock(ProductDao.class);
        when(dao.all()).thenReturn(List.of(homeProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        verify(homeProduct).setPrice(90.0); // 100 * 0.9
    }

    @Test
    public void applyDiscountsToBusinessProduct() {
        Product businessProduct = Mockito.mock(Product.class);
        when(businessProduct.getCategory()).thenReturn("BUSINESS");
        when(businessProduct.getPrice()).thenReturn(200.0);

        ProductDao dao = Mockito.mock(ProductDao.class);
        when(dao.all()).thenReturn(List.of(businessProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        verify(businessProduct).setPrice(220.0); // 200 * 1.1
    }

    @Test
    public void ignoreProductsOfOtherCategories() {
        Product otherProduct = Mockito.mock(Product.class);
        when(otherProduct.getCategory()).thenReturn("OTHER");

        ProductDao dao = Mockito.mock(ProductDao.class);
        when(dao.all()).thenReturn(List.of(otherProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        verify(otherProduct, never()).setPrice(anyDouble());
    }
}
