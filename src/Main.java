public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Cylinder cylinder = new Cylinder(4.0, 10.0);

        System.out.println(circle);
        System.out.println("Circumference: " + (int) circle.circumference());
        System.out.println("Area: " + (int) circle.area());

        System.out.println(cylinder);
        System.out.println("Surface Area: " + (int) cylinder.surfaceArea());
        System.out.println("Volume: " + (int) cylinder.volume());
    }
}
