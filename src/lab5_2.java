import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lab5_2 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            boolean skipFirstSentence = true;

            while ((line = reader.readLine()) != null) {
                if (skipFirstSentence && line.endsWith("!")) {
                    skipFirstSentence = false;
                    continue; // Пропускаємо перше речення з окликом
                }
                writer.write(line + System.lineSeparator());
            }

            System.out.println("Речення з ! було видалено з першого файлу і результат записано у другий файл.");
        } catch (IOException e) {
            System.out.println("Помилка обробки файлів: " + e.getMessage());
        }
    }
}
