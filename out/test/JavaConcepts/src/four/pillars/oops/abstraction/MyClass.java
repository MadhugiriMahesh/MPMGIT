package four.pillars.oops.abstraction;

public class MyClass {

    public static void main(String[] args){
        Circle circle = new Circle("Red", 5.0);
        //System.out.println(circle.info());
        System.out.println(circle.area());
        System.out.println( circle.getColor());


        Square square = new Square("Blue", 12.0);
        System.out.println(square.area());
    }
}
