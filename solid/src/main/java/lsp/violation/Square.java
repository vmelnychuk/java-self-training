package lsp.violation;

public class Square extends Rectangle {

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(double width) {
        setHeight(width);
    }
}
