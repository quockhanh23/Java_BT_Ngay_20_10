public class Student extends Person {
    private int avgScore;

    public Student(int id, String name, int age, int avgScore) {
        super(id, name, age);
        this.avgScore = avgScore;
    }

    public Student() {

    }

    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }


    @Override
    public String toString() {
        return "Student{"
                + " Tên " + getName() + " id " + getId() + " Điểm " + avgScore +
                '}';
    }
}
