package session4Tommy.dairyvendingmachine;

public interface VMSellingDairyProducts {

    void setProductAtSlot(DairyProduct product, int slot);

    DairyProduct getProductAtSlot(int slot);
}
