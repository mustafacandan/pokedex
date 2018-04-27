
public class Tree {
   private TreeNode root;


   public void insert(String d) {
      if (root == null) { 
         root = new TreeNode(d);
         return;
      }
      TreeNode loc = root;
      while (true) {
         if (d.compareTo(loc.data) < 0) {
            if (loc.left != null) loc = loc.left;
            else { loc.left = new TreeNode(d); break; }
         }
         else if (d.compareTo(loc.data) > 0) {
            if (loc.right != null) loc = loc.right;
            else { loc.right = new TreeNode(d); break; }
         }
         else break;
      }
   }

   public void inorderTraversal() 
   {
	   inorderT(root); 
   }

   private void inorderT(TreeNode t) {
      if (t != null) {
         inorderT(t.left);
         System.out.print(t.data + " ");
         inorderT(t.right);
      }
   }
}
