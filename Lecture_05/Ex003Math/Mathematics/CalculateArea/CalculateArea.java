package Ex003Math.Mathematics.CalculateArea;

import Ex003Math.Mathematics.Shapes.Shape;

public class CalculateArea implements Calculate {

    private static CalculateArea instance;
    // static {
    // instance = new CalculateArea();
    // }

    public static CalculateArea getInstance() {
        if (instance == null)
            instance = new CalculateArea();
        return instance;
    }

    private CalculateArea() {
    }

    /**
     * RefInt
     */
    private class RefInt {
        public double value;

        public RefInt(double ident) {
            value = ident;
        }
    }

    private void calculate(Shape shape, RefInt ref) {
        ref.value += shape.getArea();

        for (Shape item : shape.shapes) {
            calculate(item, ref);
        }

    }

    public double visit(Shape shape) {
        RefInt area = new RefInt(0);

        calculate(shape, area);

        return area.value;
    }

}
