class Box {
    private double length, breadth, height; // data - members

    public Box() {
        System.out.println("Default constructor called.");
        length=breadth=height=0.0f;
    }

    public Box(double l, double b, double h) {
        System.out.println("Parameterized constructor called.");
        length=l;
        breadth=b;
        height=h;
    }

    public Box(Box obj) {
        System.out.println("Copy constructor called.");
        length=obj.length;
        breadth=obj.breadth;
        height=obj.height;
    }

    public static void main(String args[]) {
        Box b1=new Box(); // default constructor

        Box b2=new Box(2.5, 4.5, 5.5); // parameterized constructor

        Box b3=new Box(b2);
    }
}

/**
    --------------OUTPUT -------------
    Default constructor called.
    Parameterized constructor called.
    Copy constructor called.
*/