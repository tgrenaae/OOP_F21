package session2Tommy.Excercises.Excercise11;

public class PizzaTruck implements Vehicle, Kitchen{
    String name;
    String maker;
    String model;
    int year;
    int wheels;

    public PizzaTruck(String name, String maker, String model, int year, int wheels) {
        this.name = name;
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String makeHawaii() {
        return "foo";
    }

    @Override
    public String makeProsciutto() {
        return "bar";
    }

    @Override
    public String getMaker() {
        return this.maker;
    }

    @Override
    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getYear() {
        return this.year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getWheels() {
        return this.wheels;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
