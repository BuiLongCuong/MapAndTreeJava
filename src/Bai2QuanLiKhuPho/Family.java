package Bai2QuanLiKhuPho;

import java.util.ArrayList;

public class Family {
    private int numberHouse;
    private ArrayList<Person> people;
    private int numberPerson;
    private static int numberHouseIncrement = 1;

    public Family() {
        this.numberHouse = numberHouseIncrement;
        this.people = new ArrayList<>();
        this.numberPerson = 0;
        numberHouseIncrement++;

    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void addPerson(Person person) {
        this.people.add(person);
        this.numberPerson++;
    }

    public ArrayList<Person> getPeople() {
        return this.people;
    }
}
