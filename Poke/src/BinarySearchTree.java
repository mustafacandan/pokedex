
public class BinarySearchTree 
{

    private Node root;

    public BinarySearchTree() 
    { 
        root = null; 
    }
     
    public void add(String name, String type, int attack, int health) {
       root = addRec(root,name,type,attack,health);
    }
         
    private  Node addRec(Node root, String name, String type, int attack, int health) {
         
        if (root == null) {
            root = new Node(name,type,attack,health);
            return root;
        }
        
        if (name.compareToIgnoreCase(root.name) < 0)
            root.left = addRec(root.left, name,type,attack,health);
        else if (name.compareToIgnoreCase(root.name) > 0)
            root.right = addRec(root.right, name,type,attack,health); 
        
        return root;
    }
     
    public void InOrder()  {
       InOrderrRec(root);
    }
     
    private void InOrderrRec(Node root) {
        if (root != null) {
        	InOrderrRec(root.left);
            System.out.println("Name: " + root.name + "\nType: " + root.type + "\nAttack: " + root.attack + "\nHealth: " + root.health + "\n");
            InOrderrRec(root.right);
        }
    }
    
    public Node getNodeWithName(String name) {
    		return getNodeWithNameRec(root, name);
    }
    
    private Node getNodeWithNameRec(Node root, String name){
        if (root==null || root.name.equalsIgnoreCase(name))
            return root;

        if (name.compareToIgnoreCase(root.name)<0)
            return getNodeWithNameRec(root.left, name);

        return getNodeWithNameRec(root.right, name);
    }
    
}
