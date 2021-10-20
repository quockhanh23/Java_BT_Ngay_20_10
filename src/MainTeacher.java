public class MainTeacher {
    public static void main(String[] args) {
        TeacherManagement teacherManagement = new TeacherManagement();
        teacherManagement.add(new Teacher(1, "k", 22, "vật lý"));
        teacherManagement.add(new Teacher(2, "k", 30, "Toán"));
        teacherManagement.add(new Teacher(3, "k", 45, "GDCD"));
        teacherManagement.add(new Teacher(4, "k", 28, "Địa lý"));
        teacherManagement.add(new Teacher(5, "k", 25, "Sinh học"));
        System.out.println(teacherManagement.findIndexById(2));

        teacherManagement.sortBySpecialized();
        teacherManagement.print();

    }
}
