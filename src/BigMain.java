import java.util.Scanner;

public class BigMain {
    public static void main(String[] args) {
        BigMain.showMenu();
    }

    public static void showMenu() {
        int choice = -1;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Menu: ");
                System.out.println("1. Student Management. ");
                System.out.println("2. Teacher Management. ");
                System.out.println("0. Exit. ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> MainStudent.Student();
                    case 2 -> MainTeacher.Teacher();
                    case 0 -> System.exit(0);
                }

            } catch (Exception e) {
                System.out.println("Wrong input!. ");

            }
        }
    }
}
