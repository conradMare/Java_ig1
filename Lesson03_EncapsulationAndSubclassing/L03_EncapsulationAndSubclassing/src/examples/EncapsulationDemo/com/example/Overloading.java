package examples.EncapsulationDemo.com.example;

public class Overloading {

    public void print(int i) {
        System.out.println(i);
    }

    public void print(float f) {
        System.out.println(f);
    }

    public void print(String s) {
        System.out.println(s);

    }

    public static void main(String args[]) {
        Overloading ov = new Overloading();
        ov.print(5);
        ov.print("hello");
        ov.print(5.5f);
    }
}
