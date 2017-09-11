package com.company;

/**
 * Created by Алексей on 11.09.2017.
 */
/*Класс дом, основной в данной программе, от него будем наследовать остальные */

public class House {

    private int countEntrance; //здесь будет храниться количесво подъездов
    private double numberHouse; // здесь будет храниться ноомер дома
    private String street; // здесь будет храниться улица на которой находиться дом

    public int getCountEntrance() {
        return countEntrance;
    }

    public void setCountEntrance(int countEntrance) {
        this.countEntrance = countEntrance;
    }

    public double getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(double numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
