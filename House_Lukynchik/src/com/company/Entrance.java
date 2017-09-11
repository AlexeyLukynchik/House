package com.company;

/**
 * Created by Алексей on 11.09.2017.
 */
/*Класс подъезд, он наследуется от дома, благодаря чему можно узнать в каком он доме*/
public class Entrance extends House {

    private int numberEntrance;// здесь храниться номер подъезда

    public int getNumberEntrance() {
        return numberEntrance;
    }

    public void setNumberEntrance(int numberEntrance) {
        this.numberEntrance = numberEntrance;
    }
}
