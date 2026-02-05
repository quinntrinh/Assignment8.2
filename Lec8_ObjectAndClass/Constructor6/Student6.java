package Lec8_ObjectAndClass.Constructor6;

public class Student6 {

    int id;
    String name;

    Student6() {
        System.out.println("default constructor is invoked");
    }

    Student6(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student6 e1 = new Student6(111, "Aryan");
        Student6 e2 = new Student6(222, "Karan");
        e1.display();
        e2.display();
    }
}
