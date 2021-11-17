package session3Tommy.Excercises.Fridge;

public class Beverage implements BeverageInterface{
    final String name;
    final String type;
    final String expirationDate;
    int size;

    public Beverage(String name, String type, String expirationDate, int size) {
        this.name = name;
        this.type = type;
        this.expirationDate = expirationDate;
        this.size = size;
    }

    @Override
    public String getExpirationDate() {
        return this.expirationDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
