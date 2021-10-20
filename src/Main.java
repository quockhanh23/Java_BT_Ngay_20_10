import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.add(new Student(1," ",1 ,1));

        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mục lục: ");
            System.out.println("1. In danh sách học viên. ");
            System.out.println("2. Thêm học viên. ");
            System.out.println("3. Tìm kiếm học viên theo id.");
            System.out.println("4. Sắp xếp học viên theo điểm tăng dần.");
            System.out.println("5. Xóa học viên theo id. ");
            System.out.println("6. Tổng điểm của tất cả học viên. ");
            System.out.println("0. Kết thúc chương trình. ");

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
                    System.out.println(" Tổng điểm: " + studentManagement.sumScore());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
                    System.out.println("****************************");

            }
        }
    }
}
