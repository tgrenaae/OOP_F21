package session2Tommy.Excercises.Excercise9;

import static session2Tommy.Excercises.Excercise9.timeOfWeek.*;

enum timeOfWeek {
    WEEKDAY,
    WEEKENDS
}
public class ParkingMeter implements PMInterface{
    int money;
    timeOfWeek timeOfWeek;

    public ParkingMeter(int money, timeOfWeek timeOfWeek) {
        this.money = money;
        this.timeOfWeek = timeOfWeek;
    }

    public void insertCoins(int coins){
        this.money =+ coins;
    }

    public int payForMinutes(){
        if(this.timeOfWeek == WEEKDAY){
            return payForWeekday(money);
        } else {
            return payForWeekends(money);
        }
    }


    @Override
    public int payForWeekday(int money) {
        return money / 5;
    }

    @Override
    public int payForWeekends(int money) {
        return money / 15;
    }
}
