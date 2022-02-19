package service.impl;

import models.Parents;
import models.Person;

import java.util.LinkedList;

public class ParentManagement implements Management<Parents> {
    private LinkedList<Parents> listParent = new LinkedList<>();

    public ParentManagement(LinkedList<Parents> listParent) {
        this.listParent = listParent;
    }

    public ParentManagement() {
        listParent = new LinkedList<>();
    }

    @Override
    public void print() {
        for (Parents parents : listParent) {
            System.out.println(parents);
        }
    }

    @Override
    public void add(Parents parents) {
        listParent.add(parents);
    }


    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < listParent.size(); i++) {
            if (listParent.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(Parents parents, int id) {

    }

    @Override
    public void deleteById(int id) {

    }

    public void checkParentsRich1st() {
        for (int i = 0; i < listParent.size(); i++) {
            double check = listParent.get(i).getMoney();
            if (check > 10000) {
                System.out.println(" wow " + listParent.get(i).getMoney() + " USD");

            }
        }
    }

    public void checkAllMoney() {
        double sum = 0;
        for (int i = 0; i < listParent.size(); i++) {
            sum = sum + listParent.get(i).getMoney();
        }
        System.out.println(sum);
    }
}









