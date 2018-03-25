package pack2;

public class TestGraphicalObject {
    public static void main(String[] args) {
        GraphicObject rectangle = new Rectangle();
        double rectArea = rectangle.area(3, 4);
        GraphicObject circle = new Circle();
        double circleArea = circle.area(2.7, 1);
        System.out.printf("Rectagle area is: %.2f\nCircle area is: %.2f"
            ,rectArea,circleArea);
    }

}
