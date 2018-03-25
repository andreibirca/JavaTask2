package pack1;

public class UsePoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setX(11);
        point1.setY(9);
        point1.setZ(75);
        System.out.println("x="+point1.getX()+" y="+point1.getY()+" z="+point1.getZ());
        Point point2 = new Point(11, 32);
        System.out.println("x="+point2.getX()+" y="+point2.getZ());
    }
}
