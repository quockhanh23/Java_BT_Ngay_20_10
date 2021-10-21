package models;

import models.Person;

public class Teacher extends Person {
    private String specialized;

    public Teacher(int id, String name, int age, String specialized) {
        super(id, name, age);
        this.specialized = specialized;
    }

    public Teacher() {

    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public String toString() {
        return "models.Teacher{" + " Name the teacher: " + getName() + " age: " + getAge() + " id: " + getId() +
                " specialized: '" + specialized + '\'' +
                '}';
    }
}
