import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.add(new Student(1, "Khánh", 1, 1));

        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Print list student. ");
            System.out.println("2. Add student. ");
            System.out.println("3. Find student by id.");
            System.out.println("4. Sort student by medium score. ");
            System.out.println("5. Delete student by id. ");
            System.out.println("6. Total score of all students. ");
            System.out.println("7. Edit students. ");
            System.out.println("0. End program. ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManagement.print();
                    break;
                case 2:
                    studentManagement.add(studentManagement.create());
                    break;
                case 3:
                    int find = scanner.nextInt();
                    studentManagement.findIndexById(find);
                    System.out.println(studentManagement.findIndexById(find));
                    break;
                case 4:
                    studentManagement.sortByScore();
                    studentManagement.print();
                    break;
                case 5:
                    int delete = scanner.nextInt();
                    studentManagement.deleteById(delete);
                    studentManagement.print();
                    break;
                case 6:
                    System.out.println(" Total score : " + studentManagement.sumScore());
                    break;
                case 7:
                    System.out.print("Enter id student need to fix: ");
                    int edit = scanner.nextInt();
                    if (studentManagement.findIndexById(edit) != -1) {
                        studentManagement.update(studentManagement.create(), edit);
                    } else
                        System.out.println("No id had found");
                    System.out.println("****************************");
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("This option is not available");
                    System.out.println("****************************");

            }
        }
    }
}
