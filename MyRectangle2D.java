/*
+--------------------------------------------------------------------+
|                           MyRectangle2D                            |
+--------------------------------------------------------------------+
| - x: double                                                        |
| - y: double                                                        |
| - width: double                                                    |
| - height: double                                                   |
+--------------------------------------------------------------------+
| + MyRectangle2D()                                                  |
| + MyRectangle2D(x: double, y: double, width: double, height: double)|
| + getX(): double                                                   |
| + setX(x: double): void                                            |
| + getY(): double                                                   |
| + setY(y: double): void                                            |
| + getWidth(): double                                               |
| + setWidth(width: double): void                                    |
| + getHeight(): double                                              |
| + setHeight(height: double): void                                  |
| + getArea(): double                                                |
| + getPerimeter(): double                                           |
| + contains(x: double, y: double): boolean                          |
| + contains(r: MyRectangle2D): boolean                              |
| + overlaps(r: MyRectangle2D): boolean                              |
+--------------------------------------------------------------------+
*/

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    // No-arg constructor
    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    // Constructor with specified x, y, width, and height
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Check if point (x, y) is inside this rectangle
    public boolean contains(double x, double y) {
        return Math.abs(x - this.x) <= width / 2 && Math.abs(y - this.y) <= height / 2;
    }

    // Check if rectangle r is strictly inside this rectangle
    public boolean contains(MyRectangle2D r) {
        return (Math.abs(r.getX() - this.x) + r.getWidth() / 2 <= width / 2) &&
               (Math.abs(r.getY() - this.y) + r.getHeight() / 2 <= height / 2);
    }

    // Check if rectangle r overlaps with this rectangle
    public boolean overlaps(MyRectangle2D r) {
        return Math.abs(r.getX() - this.x) < (width + r.getWidth()) / 2 &&
               Math.abs(r.getY() - this.y) < (height + r.getHeight()) / 2 &&
               !contains(r);
    }

    // Main Method for Testing
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Contains point (3, 3): " + r1.contains(3, 3));
        System.out.println("Contains rect (4, 5, 10.5, 3.2): " + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("Overlaps rect (3, 5, 2.3, 5.4): " + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}