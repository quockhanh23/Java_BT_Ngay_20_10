import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagement implements Management<Student> {
    private ArrayList<Student> listStudent;

    public StudentManagement(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public StudentManagement() {
        listStudent = new ArrayList<>();
    }

    @Override
    public void print() {
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i));
        }

    }

    @Override
    public void add(Student student) {
        listStudent.add(student);


    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                return i;

            }
        }
        return -1;
    }

    @Override
    public void update(Student student, int id) {
        int index = findIndexById(id);
        listStudent.set(index, student);

    }

    @Override
    public void deleteById(int id) {
        int index = findIndexById(id);
        listStudent.remove(index);

    }


    public void sortByScore() {
        listStudent.sort(Comparator.comparingInt(s -> s.getAvgScore()));

    }

    public int sumScore() {
        int sumScore = 0;
        for (int i = 0; i < listStudent.size(); i++) {
            sumScore += listStudent.get(i).getAvgScore();

        }
        return sumScore;

    }

        public Student create () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            System.out.print("Enter medium score: ");
            int avg = scanner.nextInt();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            return new Student(id, name, avg, age);

        }
    }




