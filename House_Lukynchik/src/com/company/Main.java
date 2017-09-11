package com.company;

/* Дом состоит за подъездов, а те в свою в очередь из квартир*/

public class Main {

    public static void main(String[] args) {

        House house = new House();
        house.setNumberHouse(13);
        house.setStreet("Elm");
        house.setCountEntrance(2);


        Entrance entrance1 = new Entrance();
        entrance1.setNumberEntrance(1);
        entrance1.setCountEntrance(house.getCountEntrance());
        entrance1.setStreet(house.getStreet());
        entrance1.setNumberHouse(house.getNumberHouse());


        Apartment apartment13 = new Apartment();
        apartment13.setCountInhabitants(3);
        apartment13.setFloor(2);
        apartment13.setNumberEntrance(entrance1.getNumberEntrance());
        apartment13.setCountEntrance(house.getCountEntrance());
        apartment13.setStreet(house.getStreet());
        apartment13.setNumberHouse(house.getNumberHouse());

System.out.println(apartment13.getNumberEntrance());

    }
}
