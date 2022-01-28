package Model;

import Model.Product;

public class Scrub extends Product {
    @Override
    public void setPrice(double price) {
        price = 15.00;
        super.setPrice(price);
    }

    @Override
    public void setProductType(String productType) {
        productType = "Model.Scrub";
        super.setProductType(productType);
    }
}
