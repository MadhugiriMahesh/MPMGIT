package four.pillars.oops.Interface;

import static java.lang.Math.*;

public class Circle implements Shape{

    String color;
    double radius;

    public Circle(String color,double radius){
        this.color=color;
        this.radius=radius;

    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {

        return PI * pow(radius,2);
    }

    @Override
    public String info() {
        return "I'm a"+ color()+"Circle and my area is "+area();
    }
}
