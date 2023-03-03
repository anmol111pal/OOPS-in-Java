// defining an abstract class
// we can't instantiate this class

abstract class Shape {
    protected abstract void area(); // abstract method does not have a definition
}

class Circle extends Shape {
    private double radius;

    public Circle(double rad) {
        radius = rad;
    }

    public void area() {
        double a = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + a);
    }
}

class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public void area() {
        double a = length * breadth;

        System.out.println("Area of Rectangle: " + a);
    }
}

class Square extends Shape {
    private double side;

    public Square(double s) {
        side = s;
    }

    public void area() {
        double a = side * side;

        System.out.println("Area of Square: " + a);
    }
}

public class AbstractClass {
    public static void main(String args[]) {
        Circle c = new Circle(10.5);
        c.area();

        Rectangle r = new Rectangle(11.5, 13.5);
        r.area();

        Square s = new Square(15);
        s.area();

        // Shape s1 = new Shape();
        // s1.area();
    }
}

/*
    Output:
    Area of Circle: 346.36059005827474
    Area of Rectangle: 155.25
    Area of Square: 225.0 
*/