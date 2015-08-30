package lsp.fix;

public class Square {

    private double side;

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +" {" +
                "side=" + side +
                '}';
    }
}
