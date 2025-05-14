package tudelft.discount;

public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier (ProductDao dao) {
        this.dao = dao;
    }

    public void setNewPrices() {
        for(Product product : dao.all()) {
            double originalPrice = product.getPrice();

            if(product.getCategory().equals("BUSINESS")) {
                double newPrice = Math.round(originalPrice * 1.1 * 100.0) / 100.0;
                product.setPrice(newPrice);
            }

            if(product.getCategory().equals("HOME")) {
                double newPrice = Math.round(originalPrice * 0.9 * 100.0) / 100.0;
                product.setPrice(newPrice);
            }
        }
    }
}
