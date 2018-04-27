
public class TreeTest {
   public static void main(String[] argv) {
      String[] months = {"Pikachu","Squirtle","Alakazam","Balbasaur"};
      Tree tree = new Tree();
      for (int i = 0; i < months.length; i++)
         tree.insert(months[i]);
      tree.inorderTraversal();
      System.out.println();
   }
}