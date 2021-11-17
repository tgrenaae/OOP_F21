package session2Tommy.Excercises.Excercise4;

public class Apple implements Fruit{
    String color;
    String taste;
    int calorieCount;

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getTaste() {
        return this.taste;
    }

    @Override
    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public int getCalorieCount() {
        return this.calorieCount;
    }

    @Override
    public void setCalorieCount(int calorieCount) {
        this.calorieCount = calorieCount;
    }
}
