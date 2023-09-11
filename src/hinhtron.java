import java.sql.SQLOutput;

public class hinhtron {
    private static int count = 0;
    private int id;
    private double radius;
    private static final double PI = 3.14;
    private static double TotalArea = 0;
    private static double maxRadius = 0;

    public hinhtron(double radius) {
        this.radius = radius;
        id = ++count;
        TotalArea += hinhtronArea();
        if (radius > maxRadius) {
            maxRadius = radius;
        }
    }



    public double hinhtronArea(){
        return PI * radius * radius;
    }

    public static int getCount(){return count;};
    public static double getTotalArea(){return TotalArea;};
    public static double getMaxRadius(){return maxRadius;};
}

class run{
    public static void main(String[] args) {
        hinhtron tron1 = new hinhtron(20.0);
        hinhtron tron2 = new hinhtron(10.0);
        hinhtron tron3 = new hinhtron(24.0);

        System.out.println("số lượng đối tượng được tạo "+ hinhtron.getCount());
        System.out.println("Tổng dt hình tròn "+ hinhtron.getTotalArea());
        System.out.println("bán kính lớn nhất "+hinhtron.getMaxRadius());
    }
}
