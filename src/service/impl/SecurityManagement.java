package service.impl;

import models.Security;

import java.util.ArrayList;

public class SecurityManagement implements Management<Security> {
    private ArrayList<Security> listSecurity;

    public SecurityManagement(ArrayList<Security> listSecurity) {
        this.listSecurity = listSecurity;
    }

    public SecurityManagement() {
        listSecurity = new ArrayList<>();
    }

    @Override
    public void print() {
        for (int i = 0; i < listSecurity.size(); i++) {
            System.out.println(listSecurity.get(i));

        }
    }

    @Override
    public void add(Security security) {
        listSecurity.add(security);
    }


    @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public void update(Security security, int id) {

    }
    @Override
    public void deleteById(int id) {

    }

}
