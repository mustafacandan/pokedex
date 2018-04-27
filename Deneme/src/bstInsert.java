public class bstInsert {
 
    private bstClass root;
 
    public boolean isEmpty() {
 
        return (this.root == null);
    }
 
    public void insert(String item) {
 
        System.out.print("[input: "+item+"]");
        if(root == null) {
            this.root = new bstClass(item);
            System.out.println(" -> inserted: "+item);
            return;
        }
 
        insertNode(this.root, item);
        System.out.print(" -> inserted: "+item);
        System.out.println();
    }
 
    private bstClass insertNode(bstClass root, String item) {
 
    	bstClass tmpNode = null;
        System.out.print(" ->"+root.getItem());
        if(root.getItem().equals(item)) {
            System.out.print(" [L]");
            if(root.getLeft() == null) {
                root.setLeft(new bstClass(item));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if(root.getRight() == null) {
                root.setRight(new bstClass(item));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
 
        return insertNode(tmpNode, item);
    }
 
    public static void main(String a[]) {
 
    	bstInsert bst = new bstInsert();
        bst.insert("Alakazam");
        bst.insert("Balbasaur");
        bst.insert("Pikachu");
        bst.insert("Squirtle");
    }
}