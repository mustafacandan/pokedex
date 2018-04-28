public class BST {
 
    Node root;

 
    private Node addRecursive(Node current, String name, String type, int attack, int health) {
        if (current == null) {
            return new Node(name, type, attack, health);
        }
     
        if (name.compareToIgnoreCase(current.name) > 0) {
            current.left = addRecursive(current.left, name, type, attack, health);
        } else if (name.compareToIgnoreCase(current.name) < 0) {
            current.right = addRecursive(current.right, name, type, attack, health);
        } else {
            // value already exists
            return current;
        }
     
        return current;
    }
    
    public void add(String name, String type, int attack, int health) {
        root = addRecursive(root, name, type, attack, health);
    }
    
    private boolean containsNodeRecursive(Node current, String name) {
        if (current == null) {
            return false;
        } 
        if (name == current.name) {
            return true;
        } 
        return name.compareToIgnoreCase(current.name) < 0
          ? containsNodeRecursive(current.left, name)
          : containsNodeRecursive(current.right, name);
    }
    
    public boolean containsNode(String name) {
        return containsNodeRecursive(root, name);
    }
    
    public void delete(String name) {
        deleteRecursive(root, name);
    }
    
    private Node deleteRecursive(Node current, String name) {
        if (current == null) {
            return null;
        }
     
        if (name.compareToIgnoreCase(current.name) == 0) {
            // Node to delete found
            // ... code to delete the node will go here
        } 
        if (name.compareToIgnoreCase(current.name) < 0) {
            current.left = deleteRecursive(current.left, name);
            return current;
        }
        current.right = deleteRecursive(current.right, name);
        return current;
    }
    
    public Node find(String name) {
    		return findRecurcive(root, name);
    }
    
    private Node findRecurcive(Node current, String name) {

        if (current == null) {
            return null;
        }


        if (name.compareToIgnoreCase(current.name) < 0) {
            return findRecurcive(current.left, name);
        }

        else if (name.compareToIgnoreCase(current.name) > 0) { 
            return findRecurcive(current.right, name);
        } 

        else {
            return current; 
            }

	}
    public void list() {
    		listRecurcive(root);
    }
    private void listRecurcive(Node current) {
    		if (current.left != null) {
    			 listRecurcive(current.left);	
		}
    		if(current.right != null) {
    			 listRecurcive(current.right);
    		}
			System.out.println(current);;
    }
    
}