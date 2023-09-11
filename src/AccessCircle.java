public class AccessCircle {
    private double radius = 1.0;
    private String color = "red";

    public AccessCircle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public AccessCircle(double radius){
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }
}

class runnn{
    public static void main(String[] args) {
        AccessCircle circle1 = new AccessCircle();
        AccessCircle circle2 = new AccessCircle(3.0);

        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
    }
}
