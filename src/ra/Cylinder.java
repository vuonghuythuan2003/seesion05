package ra;

import java.util.Scanner;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {}

    public Cylinder(double radius, String color, double height) {
        super(radius, color); // Gọi constructor của lớp cha Circle
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Phương thức nhập dữ liệu cho Cylinder
    public void inputDataCylinder(Scanner src) {
        inputData(src); // Gọi phương thức nhập dữ liệu của lớp cha
        System.out.println("Vui lòng nhập chiều cao của hình trụ: ");
        this.height = Double.parseDouble(src.nextLine());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ", height=" + height +
                '}';
    }

    // Phương thức hiển thị dữ liệu của Cylinder
    public void displayCylinder() {
        displayData(); // Gọi phương thức hiển thị của lớp cha
        System.out.println("Chiều cao của hình trụ: " + height);
        System.out.println("Thể tích của hình trụ: " + this.volume());
    }

    // Phương thức tính thể tích hình trụ
    public float volume() {
        return (float) (area() * height);
    }
}
