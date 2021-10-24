import models.Teacher;
import service.impl.TeacherManagement;

import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {
        TeacherManagement teacherManagement = new TeacherManagement();
        teacherManagement.add(new Teacher(1, "k1", 22, "Match"));
        teacherManagement.add(new Teacher(2, "k2", 30, "Chemistry"));
        teacherManagement.add(new Teacher(3, "k3", 45, "Biological"));
        teacherManagement.add(new Teacher(4, "k4", 38, "Geography"));

        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Main menu: ");
            System.out.println("1. Print list teacher. ");
            System.out.println("2. Add teacher. ");
            System.out.println("3. Find the teacher by id. ");
            System.out.println("4. Sort the teacher by expertise. ");
            System.out.println("5. Delete the teacher by id. ");
            System.out.println("6. Edit teacher. ");
            System.out.println("7. DELETE ALL. ");
            System.out.println("8. Check list is empty. ");
            System.out.println("9. Find the teacher by name. ");
            System.out.println("0. End program. ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You just chose number " + choice);
                    teacherManagement.print();
                    System.out.println("_________________________________");
                    break;
                case 2:
                    System.out.println("You just chose number " + choice);
                    teacherManagement.add(teacherManagement.creat());
                    System.out.println("_________________________________");
                    break;
                case 3:
                    System.out.println("You just chose number " + choice);
                    System.out.print("Enter id: ");
                    int find = scanner.nextInt();
                    teacherManagement.findIndexById2(find);
                    System.out.println(teacherManagement.findIndexById2(find));
                    System.out.println("_________________________________");
                    break;
                case 4:
                    System.out.println("You just chose number " + choice);
                    teacherManagement.sortBySpecialized();
                    teacherManagement.print();
                    System.out.println("_________________________________");
                    break;
                case 5:
                    System.out.println("You just chose number " + choice);
                    int delete = scanner.nextInt();
                    teacherManagement.deleteById(delete);
                    teacherManagement.print();
                    System.out.println("The teacher have id: " + delete + ", had been delete. ");
                    System.out.println("_________________________________");
                    break;
                case 6:
                    System.out.println("You just chose number " + choice);
                    System.out.print("Enter id of the teacher want to edit: ");
                    int edit = scanner.nextInt();
                    boolean check = (teacherManagement.findIndexById(edit) < teacherManagement.size()
                            && teacherManagement.findIndexById(edit) > -1);
                    if (check) {
                        teacherManagement.update(teacherManagement.creat(), edit);
                        System.out.println("Fix done!. ");
                    } else
                        System.out.println("No id had found. ");
                    System.out.println("_________________________________");
                    break;
                case 7:
                    System.out.println("You just chose number " + choice);
                    teacherManagement.deleteAll();
                    System.out.println("_________________________________");
                    break;
                case 8:
                    System.out.println("You just chose number " + choice);
                    teacherManagement.checkList();
                    System.out.println("_________________________________");
                    break;
                case 9:
                    System.out.println("You just chose number " + choice);
                    System.out.print("Enter name: ");
                    teacherManagement.findIndexByName();
                    System.out.println("_________________________________");
                    break;

                case 0:
                    System.out.println("You just chose number " + choice + " --> Ending!...");
                    System.out.println("_________________________________");
                    System.exit(0);

                default:
                    System.out.println("This option is not available. ");
                    System.out.println("_________________________________");
            }
        }
    }
}
