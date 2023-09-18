import javax.swing.*;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Demonstrate ShortWordFilter
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                String line;
                Object[] words;
                while ((line = br.readLine()) != null) {
                    words = line.split("\\s+");
                    List<Object> shortWords = CollectAll.collectAll(words, new ShortWordFilter());
                    System.out.println("Short words: " + shortWords);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Demonstrate BigRectangleFilter
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
        System.out.println("\nRectangles with big perimeters:");
        for (Object rect : bigRectangles) {
            System.out.println(rect);
        }
    }
}
