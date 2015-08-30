package lsp.violation;

import java.util.ArrayList;
import java.util.List;

public class LSPRunner {
    public static void main(String[] args) {
        List<Rectangle> rects = new ArrayList<Rectangle>();
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        Rectangle square = new Square();
        square.setHeight(10);
        square.setWidth(20);
        rects.add(rectangle);
        rects.add(square);

        for(Rectangle rect: rects) {
            System.out.println(rect.toString());
            rect.setHeight(30);
            System.out.println(rect.toString());
        }
    }
}
