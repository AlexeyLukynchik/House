package com.company;

/**
 * Created by Алексей on 11.09.2017.
 */
/* Класс квартира, он наследуется от класса подъезда,что автоматически означает наследование от класса дом,
и можно получить полный адрес*/
public class Apartment extends Entrance {
    private int countInhabitants;//здесь храниться количество жильцов в квартире
    private int floor;//здесь храниться этаж на котором находиться квартира

    public int getCountInhabitants() {
        return countInhabitants;
    }

    public void setCountInhabitants(int countInhabitants) {
        this.countInhabitants = countInhabitants;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
