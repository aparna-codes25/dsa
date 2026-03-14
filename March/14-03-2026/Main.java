import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");

        int n = arr.length;
        int[] nums = new int[n];

        for(int i = 0; i<n;i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        // Find root node of the tree
        Node root = Node.convertToNodeArray(nums);

        TopViewOfBinaryTree sol = new TopViewOfBinaryTree();
        System.out.println(sol.topView(root));
    }
    
}
