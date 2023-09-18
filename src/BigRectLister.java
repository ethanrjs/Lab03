import java.awt.Rectangle;
import java.util.List;

public class BigRectLister {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
                new Rectangle(1, 2),
                new Rectangle(2, 3),
                new Rectangle(3, 4),
                new Rectangle(4, 5),
                new Rectangle(5, 6),
                new Rectangle(6, 7),
                new Rectangle(10, 11),
                new Rectangle(12, 13),
                new Rectangle(14, 15),
                new Rectangle(16, 17)
        };

        List<Object> bigRectangles = CollectAll.collectAll(rectangles, new BigRectangleFilter());
        System.out.println("Rectangles with big perimeters:");
        for (Object rect : bigRectangles) {
            System.out.println(rect);
        }
    }
}
