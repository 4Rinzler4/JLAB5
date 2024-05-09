import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lab5_3 {
    public static void main(String[] args) {
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(outputFile))) {
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Кількість слів у файлі: " + wordCount);
        } catch (IOException e) {
            System.out.println("Помилка обробки файлу: " + e.getMessage());
        }
    }
}
