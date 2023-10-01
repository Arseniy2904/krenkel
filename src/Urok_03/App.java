package Urok_03;

public class App {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.i = 90;
        a.j = 30;

        a.display();

        b.i = 1;
        b.j = 2;
        b.k = 3;

        b.display();
        b.displayB();
        b.sumAB();
    }
}
