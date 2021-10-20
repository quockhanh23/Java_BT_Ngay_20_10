public interface Management<T> {

    void print();

    void add(T t);

    int findIndexById(int id);

    void update(T t, int id);

    void deleteById(int id);

    void sortByScore();

    int sumScore();

    Student create();



}
