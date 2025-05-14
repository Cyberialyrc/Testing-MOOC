package tudelft.invoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InvoiceFilterTest {
    @Test
    void filterInvoices() {

        InvoiceDao dao = new InvoiceDao();
        Invoice i1 = new Invoice("Mauricio", 20.0);
        Invoice i2 = new Invoice("Arie", 300.0);
        dao.save(i1);dao.save(i2);

        InvoiceFilter filter = new InvoiceFilter();
        List<Invoice> result = filter.filter();

        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(i1, result.get(0));
        dao.close();
    }

}
