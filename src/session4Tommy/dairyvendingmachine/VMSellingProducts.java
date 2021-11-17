package session4Tommy.dairyvendingmachine;

public interface VMSellingProducts {

    void setProductAtSlot(Product product, int slot);

    Product getProductAtSlot(int slot);
}
