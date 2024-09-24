package ra;

import java.awt.*;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void XYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }
    public float [] getXYZ(){
        return new float[]{getX(), getY(),z};
    }
    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() + "z=" + z +
                '}';
    }
}
