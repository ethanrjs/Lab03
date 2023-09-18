import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ShortLister {
    public static void main(String[] args) {
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
    }
}
