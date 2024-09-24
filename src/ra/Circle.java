package ra;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;
    private static final float PI = 3.14f; // Biến tĩnh PI, sử dụng từ khóa final

    public Circle() {}

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức nhập dữ liệu
    public void inputData(Scanner src) {
        System.out.println("Vui lòng nhập bán kính của đường tròn: ");
        this.radius = Double.parseDouble(src.nextLine());
        System.out.println("Nhập màu sắc của đường tròn: ");
        this.color = src.nextLine();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Màu sắc của đường tròn: " + this.color);
        System.out.println("Bán kính của đường tròn: " + this.radius);
        System.out.println("Diện tích của đường tròn: " + this.area());
    }

    // Phương thức tính diện tích
    public float area() {
        return (float) (this.radius * this.radius * Circle.PI);
    }
}
