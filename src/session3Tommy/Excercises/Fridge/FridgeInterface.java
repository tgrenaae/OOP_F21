package session3Tommy.Excercises.Fridge;

import java.util.ArrayList;

public interface FridgeInterface {

    ArrayList<Food> getFood();
    void addFood(Food food);
    ArrayList<Beverage> getBeverage();
    void addBeverage(Beverage beverage);
    int getTemperature();
    void setTemperature(int temperature);


}
