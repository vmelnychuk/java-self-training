package lsp.violation;

public class Rectangle {
    private double height;
    private double width;

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return (height + width) * 2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
