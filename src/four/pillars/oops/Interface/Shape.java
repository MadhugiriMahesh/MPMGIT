package four.pillars.oops.Interface;

public interface Shape {
    int i=5;

    String color();
    double area();
    String info();

    default void defaultMethod(){
        System.out.println("Default Method");
    }

    static void staticMethod(){
        System.out.println("Static Method");
    }

}
