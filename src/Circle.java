public class Circle {

    private int radius;
    final double PI=3.14;

    public Circle(){}

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }



    static void getArea (Circle circle){
        System.out.println("Area of circle with radius "+circle.radius+" is: "+Math.pow(circle.radius, 2)* circle.PI);
    }
    static void getCircumference(Circle circle){
        System.out.println("Circumference of circle with radius "+circle.radius+" is: "+2* circle.PI* circle.radius);
    }
}
