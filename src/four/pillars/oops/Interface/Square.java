package four.pillars.oops.Interface;

import static java.lang.Math.pow;

public class Square implements Shape {
    String color;
    double side;

    public Square(String color,double side){
        this.color=color;
        this.side=side;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return pow(side,2);
    }

    @Override
    public String info() {
        return "I'm a"+ color()+"Square and my area is "+area();
    }
}
