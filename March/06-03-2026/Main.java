import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        String ans = SmallestWindowContainingAllCharacters.minWindow(s, p);
        System.out.println(ans);
    }
}
