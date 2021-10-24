package service.impl;

import models.Person;
import models.Student;
import models.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TeacherManagement implements Management<Teacher> {
    private ArrayList<Teacher> listTeacher = new ArrayList<>();

    public TeacherManagement(ArrayList<Student> listStudent) {
        this.listTeacher = listTeacher;
    }

    public TeacherManagement() {
        listTeacher = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("_________________________________");
        System.out.println(String.format("%-5s%-10s%-7s%-5s", "ID", "Name", "Age", "Expertise"));
        for (int i = 0; i < listTeacher.size(); i++) {
            System.out.println(listTeacher.get(i));
        }
    }

    @Override
    public void add(Teacher teacher) {
        listTeacher.add(teacher);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < listTeacher.size(); i++) {
            if (listTeacher.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(Teacher teacher, int id) {
        int index = findIndexById(id);
        listTeacher.set(index, teacher);
    }

    @Override
    public void deleteById(int id) {
        int index = findIndexById(id);
        listTeacher.remove(index);
    }

    public void deleteAll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Warrning!!!, you really want to do?. ");
        System.out.print("Enter 'number 1' = (Yes), or other numbers = (No): ");
        int number = scanner.nextInt();
        if (number == 1) {
            listTeacher.clear();
            System.out.println("The lists had been delete!. ");
        } else {
            System.out.println("Back to menu. ");
        }
    }

    public Teacher creat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter specialize: ");
        String specialized = scanner.nextLine();
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        return new Teacher(id, name, age, specialized);
    }

    public void checkList() {
        boolean check = listTeacher.isEmpty();
        if (check) {
            System.out.println("Empty list. ");
        } else {
            System.out.println("The list has: " + listTeacher.size() + " elements. ");
        }
    }

    public String findIndexById2(int id) {
        for (int i = 0; i < listTeacher.size(); i++) {
            if (listTeacher.get(i).getId() == id) {
                return "The teacher have id: " + (i + 1) + ", information: " + listTeacher.get(i);
            }
        }
        return "Can't find. ";
    }

    public void findIndexByName() {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        for (int i = 0; i < listTeacher.size(); i++) {
            boolean check = listTeacher.get(i).getName().equals(name1);
            if (check) {
                System.out.println("Had found: " + listTeacher.get(i).getName() +
                        " information: " + listTeacher.get(i));
            }
        }
    }

    public int size() {
        return listTeacher.size();
    }

    public void sortByName1() {
        listTeacher.sort(Comparator.comparing(Person::getName));
    }

    public void sortBySpecialized() {
        listTeacher.sort(Comparator.comparing(Teacher::getExpertise));
    }
}
