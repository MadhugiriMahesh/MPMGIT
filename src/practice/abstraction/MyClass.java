package practice.abstraction;

public class MyClass {

    public static void main(String[] args) {

        Circle circle = new Circle("RED", 2);
        System.out.println(circle.info());

        System.out.println(circle.getColor());
    }

}
