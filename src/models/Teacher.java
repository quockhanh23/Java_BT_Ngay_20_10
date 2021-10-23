package models;

public class Teacher extends Person {
    private String expertise;

    public Teacher(int id, String name, int age, String specialized) {
        super(id, name, age);
        this.expertise = specialized;
    }

    public Teacher() {

    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "models.Teacher{" + " Name teacher: " + getName() + ", Age: " + getAge() + ", Id: " + getId() +
                ", Expertise: '" + expertise + '\'' +
                '}';
    }
}
