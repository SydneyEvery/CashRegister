package Model;

import Model.Product;

public class Soap extends Product {
    @Override
    public void setPrice(double price) {
        price = 8.00;
        super.setPrice(price);
    }

    @Override
    public void setProductType(String productType) {
        productType = "Model.Soap";
        super.setProductType(productType);
    }
}
