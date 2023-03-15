package Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Poit2D-----");
        Point2D pointD = new Point2D();
        System.out.println(pointD);

        Point2D point2D = new Point2D(3, 8);
        System.out.println(" point 2d: " + point2D);
        System.out.println("point 2d getXY: " + Arrays.toString(point2D.getXY()));
        point2D.setXY(6, 9);
        System.out.println(point2D);

        System.out.println("------Point3D-----");
        Point3D poin3d1=new Point3D();
        System.out.println(poin3d1);
        poin3d1.setXYZ(2,5,6);
        System.out.println(poin3d1);

        System.out.println("point 3d có giá trị getXYZ: "+Arrays.toString(poin3d1.getXYZ()));
        System.out.println("point 3d có giá trị gestXY: "+ Arrays.toString(poin3d1.getXY()));

    }
}
