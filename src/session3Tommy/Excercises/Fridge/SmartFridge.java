package session3Tommy.Excercises.Fridge;

import java.sql.Time;
import java.util.ArrayList;

public class SmartFridge implements FridgeInterface, TimeInterface{
    Time time;
    int temperature;
    ArrayList<Food> foods;
    ArrayList<Beverage> beverages;

    public SmartFridge(Time time, int temperature, ArrayList<Food> foods, ArrayList<Beverage> beverages) {
        this.time = time;
        this.temperature = temperature;
        this.foods = foods;
        this.beverages = beverages;
    }

    @Override
    public ArrayList<Food> getFood() {
        return this.foods;
    }

    @Override
    public void addFood(Food food) {
        this.foods.add(food);
    }

    @Override
    public ArrayList<Beverage> getBeverage() {
        return this.beverages;
    }

    @Override
    public void addBeverage(Beverage beverage) {
        this.beverages.add(beverage);
    }

    @Override
    public int getTemperature() {
        return this.temperature;
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public Time getTime() {
        return this.time;
    }

    @Override
    public void setTime(Time time) {
        this.time = time;
    }
}
