package Lec8_ObjectAndClass.Constructor5;

public class Student5 {

    int id;
    String name;

    Student5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);

    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Karyan");
        Student5 s2 = new Student5(222, "Aryan");
        s1.display();
        s2.display();
    }
}
