public class Circle {
    private static int count = 0;
    private int id;
    private double radius;
    private static final double PI = 3.14;
    private static double totalArea = 0;
    private static double maxRadius = 0;

    public Circle(double radius) {
        this.radius = radius;
        id = ++count;
        totalArea += calculateArea();
        if (radius > maxRadius) {
            maxRadius = radius;
        }
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public static int getCount() {
        return count;
    }

    public static double getTotalArea() {
        return totalArea;
    }

    public static double getMaxRadius() {
        return maxRadius;
    }
}

class Run {
    public static void main(String[] args) {
        Circle circle1 = new Circle(11.0);
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(7.0);

        System.out.println("Số lượng đối tượng Circle đã được tạo: " + Circle.getCount());
        System.out.println("Diện tích tổng của các hình tròn: " + Circle.getTotalArea());
        System.out.println("Bán kính lớn nhất: " + Circle.getMaxRadius());
    }
}
