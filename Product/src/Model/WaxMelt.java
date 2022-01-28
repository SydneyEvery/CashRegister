package Model;

import Model.Product;

public class WaxMelt extends Product {
    @Override
    public void setPrice(double price) {
        price = 4.00;
        super.setPrice(price);
    }

    @Override
    public void setProductType(String productType) {
        productType = "Wax Melt";
        super.setProductType(productType);
    }
}
