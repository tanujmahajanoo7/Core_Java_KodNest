import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();
        
        System.out.println("Character Frequencies:");
        
        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
            int count = 1;
            for (int j = 0; j < i; j++) {
                if (characters[j] == currentChar) {
                    count = 0; // Already counted
                    break;
                }
            }
            if (count == 1) {
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[j] == currentChar) {
                        count++;
                    }
                }
                // Print the character and its frequency
                System.out.println(currentChar + ": " + count);
            }
        }
        
        scanner.close();
    }
}