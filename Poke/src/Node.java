
public class Node 
{	
    String name;
    String type;
    
    int attack;
    int health;
    
    Node left;
    Node right;

    public Node(String name, String type, int attack, int health)
    {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.health = health;
        right = null;
        left = null;
    }
    @Override
    public String toString() {
    	return "\nName: " + name + "\nType: " + type + "\nAttack: " + attack + "\nHealth: " + health + "\n";
    }
}
