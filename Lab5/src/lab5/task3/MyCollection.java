package lab5.task3;


public interface  MyCollection {
    void add(int element);
    void add(int index, int element);
    void clear();
    boolean contains(int o);
    int get(int index);
    int indexOf(int o);
    boolean isEmpty();
    void removeAt(int index);
    void remove(int element);
    void removeAll(int element);
    void reverse();
    void set(int index, int element);
    int size();
    void sort();
    void toArray();
    String toString();
}