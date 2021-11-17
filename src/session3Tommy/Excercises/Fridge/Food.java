package session3Tommy.Excercises.Fridge;

public class Food implements FoodInterface{
    final String name;
    final String type;
    final String expirationDate;

    public Food(String name, String type, String expirationDate) {
        this.name = name;
        this.type = type;
        this.expirationDate = expirationDate;
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
}
