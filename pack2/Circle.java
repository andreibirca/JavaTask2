package pack2;

public class Circle extends GraphicObject {
    @Override
    double area(double value1, double value2) {
        return 3.14 * value1 * value1;
    }
}
