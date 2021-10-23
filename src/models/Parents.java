package models;

public class Parents extends Person{
    private double money;

    public Parents(int id, String name, int age, double money) {
        super(id, name, age);
        this.money = money;
    }

    public Parents() {

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "Parents{" +
                " Name " +getName() + ",Age "+ getAge() +  ", Money " + money +
                '}';
    }
}
