class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    static Node convertToNodeArray(int[] arr){
        Node[] nodes = new Node[arr.length];
        for(int i = 0; i<arr.length;i++){
            
            nodes[i] = new Node(arr[i]);
        }  
        
        for(int i = 0;i<arr.length;i++){
            int leftInd = 2 * i  + 1;
            int rightInd = 2 * i + 2;
            if(leftInd < arr.length) nodes[i].left = nodes[leftInd];
            if(rightInd<arr.length) nodes[i].right = nodes[rightInd];
        }
        return nodes[0];
    }
}


