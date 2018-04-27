public class bstClass {
 
    private bstClass left;
    private bstClass right;
    private String item;
 
    public bstClass(String item) {
        this.item = item;
    }
 
    public bstClass getLeft() {
        return left;
    }
    public void setLeft(bstClass left) {
        this.left = left;
    }
    public bstClass getRight() {
        return right;
    }
    public void setRight(bstClass right) {
        this.right = right;
    }
 
    public String getItem() {
        return item;
    }
}