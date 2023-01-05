class Volume {
    public double getVolume(double radius) {
        return 4.0/3*Math.PI*radius*radius;
    }

    public double getVolume(double radius, double height) {
        return 1.0/3*Math.PI*radius*radius*height;
    }

    public double getVolume(double length, double breadth, double height) {
        return length*breadth*height;
    }

    public static void main(String args[]) {
        Volume ob=new Volume();
        System.out.println("Example of Function Overloading.");

        System.out.println("Volume of Sphere: " + ob.getVolume(10.5));

        System.out.println("Volume of Cone: " + ob.getVolume(10.0, 5.0));

        System.out.println("Volume of Cuboid: " + ob.getVolume(10.5, 12.5, 10));
    }
}

/**
    ----------------OUTPUT------------------
    Example of Function Overloading.
    Volume of Sphere: 461.8141200776996
    Volume of Cone: 523.5987755982989  
    Volume of Cuboid: 1312.5
 */