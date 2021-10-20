import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {
        TeacherManagement teacherManagement = new TeacherManagement();
        teacherManagement.add(new Teacher(1, "k1", 22, "Match"));
        teacherManagement.add(new Teacher(2, "k2", 30, "Physicscal"));
        teacherManagement.add(new Teacher(3, "k3", 45, "Biological"));

        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Print list teacher. ");
            System.out.println("2. Add teacher. ");
            System.out.println("3. Find the teacher by id.");
            System.out.println("4. Sort the teacher by specialize.");
            System.out.println("5. Delete the teacher by id. ");
            System.out.println("6. Edit teacher");
            System.out.println("0. End program. ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    teacherManagement.print();
                    break;
                case 2:
                    teacherManagement.add(teacherManagement.creat());
                    break;
                case 3:
                    int find = scanner.nextInt();
                    teacherManagement.findIndexById(find);
                    System.out.println(teacherManagement.findIndexById(find));
                    break;
                case 4:
                    teacherManagement.sortBySpecialized();
                    teacherManagement.print();
                    break;
                case 5:
                    int delete = scanner.nextInt();
                    teacherManagement.deleteById(delete);
                    teacherManagement.print();
                    break;
                case 6:
                    System.out.print("Enter id teacher need to fix: ");
                    int edit = scanner.nextInt();

                    if (teacherManagement.findIndexById(edit)  != -1) {
                        teacherManagement.update(teacherManagement.creat(), edit);
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
