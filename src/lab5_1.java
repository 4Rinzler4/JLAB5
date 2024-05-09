import java.util.Scanner;

public class lab5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текстовий рядок:");
        String input = "";

        while (true) {
            input = scanner.nextLine();
            if (!input.matches(".*\\d.*")) {
                break;
            }
            System.out.println("Рядок не повинен містити цифр. Будь ласка, введіть текстовий рядок знову:");
        }

        String[] words = input.split("\\s+");

        int equalVowelConsonantCount = 0;
        String longestWord = "";

        for (String word : words) {
            int vowels = 0, consonants = 0;
            word = word.toLowerCase();

            for (char letter : word.toCharArray()) {
                if (letter == 'а' || letter == 'о' || letter == 'е' || letter == 'у' || letter == 'і' || letter == 'и') {
                    vowels++;
                } else if (Character.isLetter(letter)) {
                    consonants++;
                }
            }

            if (vowels == consonants) {
                equalVowelConsonantCount++;
            }

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Кількість слів, які містять однакову кількість голосних і приголосних літер: " + equalVowelConsonantCount);
        System.out.println("Найдовше слово: " + longestWord);

        scanner.close();
    }
}
