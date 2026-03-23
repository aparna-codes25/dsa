import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] edges = new int[E][2];
        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }

        LengthOfLongestCycleInAGraph obj = new LengthOfLongestCycleInAGraph();
        System.out.println(obj.longestCycle(V, edges));

        sc.close();
    }
}
