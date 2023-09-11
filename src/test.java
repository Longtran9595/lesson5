public class test {
    private static int count = 0;             // Biến tĩnh để theo dõi số lượng đối tượng Circle đã được tạo.
    private int id;                          // Biến thể hiện để lưu ID của mỗi Circle.
    private double radius;                   // Biến thể hiện để lưu bán kính của Circle.
    private static final double PI = 3.14;   // Hằng số tĩnh để biểu thị giá trị Pi.
    private static double totalArea = 0;     // Biến tĩnh để tính tổng diện tích của tất cả các đối tượng Circle.
    private static double maxRadius = 0;     // Biến tĩnh để theo dõi bán kính lớn nhất trong tất cả các đối tượng Circle.

    // Constructor để tạo một đối tượng Circle với bán kính cho trước.
    public test(double radius) {
        this.radius = radius;
        id = ++count;                         // Tăng count lên và gán nó là ID của Circle này.
        totalArea += calculateArea();         // Tính diện tích và cộng vào totalArea.
        if (radius > maxRadius) {
            maxRadius = radius;              // Cập nhật maxRadius nếu bán kính hiện tại lớn hơn.
        }
    }

    // Phương thức để tính diện tích của Circle.
    public double calculateArea() {
        return PI * radius * radius;
    }

    // Phương thức tĩnh để lấy số lượng đối tượng Circle đã được tạo.
    public static int getCount() {
        return count;
    }

    // Phương thức tĩnh để lấy tổng diện tích của tất cả các đối tượng Circle.
    public static double getTotalArea() {
        return totalArea;
    }

    // Phương thức tĩnh để lấy bán kính lớn nhất trong tất cả các đối tượng Circle.
    public static double getMaxRadius() {
        return maxRadius;
    }
}

class Runn {
    public static void main(String[] args) {
        // Tạo ba đối tượng Circle với các bán kính khác nhau.
        Circle circle1 = new Circle(11.0);
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(7.0);

        // Hiển thị thông tin.
        System.out.println("Số lượng đối tượng Circle đã được tạo: " + Circle.getCount());
        System.out.println("Diện tích tổng của các hình tròn: " + Circle.getTotalArea());
        System.out.println("Bán kính lớn nhất: " + Circle.getMaxRadius());
    }
}
