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

    public Teacher creat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter majors: ");
        String specialized = scanner.nextLine();
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        System.out.print("Enter age : ");
        int age = scanner.nextInt();

        return new Teacher(id, name, age, specialized);

    }

    public void sortByName1() {
        listTeacher.sort(Comparator.comparing(Person::getName));
    }

    public void sortBySpecialized() {
        listTeacher.sort(Comparator.comparing(Teacher::getSpecialized));
    }

}
