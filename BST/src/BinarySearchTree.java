
public class BinarySearchTree {
	
    private Node root;

    public class Node {
        String key;
        int value;
        Node left;
        Node right;
        Node next;
        
        Node(Node copy){
            this.key=copy.key;
            this.value=copy.value;
            this.left=copy.left;
            this.right=copy.right;
        }

        Node(String key, int value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;      
            next=null;
        }

        Node(String key) {
            this(key, Integer.parseInt(key));
        }

        public String toString() {
            return "(" + key + "," + value + ")";
        }
    }

    public BinarySearchTree() {
        root = null;
    }
    
    public BinarySearchTree(Node root) {
        this.root=root;
    }
 
    public void insert(String key) {
        if(root==null) root= new Node(key);            
        else insert(root, key);
    }

    private void insert(Node cur, String key) {
        if (cur.value>=Integer.parseInt(key)){
            if(cur.left!=null) insert(cur.left, key);
            else  cur.left= new Node(key); 
        }
        else{
            if(cur.right!=null) insert(cur.right, key);
            else  cur.right= new Node(key);             
        }
    }

    public Node search(Node cur, String key) {
        if (cur == null)
            return cur;
        if (cur.key.compareTo(key) > 0)
            return search(cur.left, key);
        else {
            if (cur.key.compareTo(key) < 0)
                return search(cur.right, key);
            else
                return cur;
        }
    }

    public int size(){
        return size(root, 0);
    }    
   
    private int size(Node cur, int num) {
        if (cur == null)
            return num;
        return size(cur.left, num) + 1 + size(cur.right, num);
    }
   
    public int countTree(int N){
        if(N<=1) return 1;
        int sum=0;
        for(int i=1;i<=N;i++){
            sum+=countTree(i-1)*countTree(N-i);
        }
        return sum;
    }
 
    public boolean isBST(){
        return isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    
        private boolean isBST(Node node, int max, int min){
        if (node==null) return true;
        if (node.value>max || node.value<min) return false;
        return isBST(node.left, node.value-1, min) && isBST(node.right, max, node.value+1);
    }

    public static void main(String[] args) {
        
    }
    

}