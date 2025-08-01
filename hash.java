import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the hash table size: ");
        int tableSize = scanner.nextInt();

        int hashValue = 0;
        for (int i = 0; i < input.length(); i++) {
            hashValue += (int) input.charAt(i);
        }

        int index = hashValue % tableSize;

        System.out.println("Hash value (sum of ASCII): " + hashValue);
        System.out.println("Index in hash table (mod " + tableSize + "): " + index);

        scanner.close();
    }
}
