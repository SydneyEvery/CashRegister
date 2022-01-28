package Model;

public class Candle extends Product {
    @Override
    public void setPrice(double price) {
        price = 12.00;
        super.setPrice(price);
    }

    @Override
    public void setProductType(String productType) {
        productType = "Model.Candle";
        super.setProductType(productType);
    }
}
