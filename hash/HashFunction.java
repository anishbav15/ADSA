package hash;
import java.util.Scanner;

public class HashFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }
        System.out.println(sum);
        sc.close();
    }
}
