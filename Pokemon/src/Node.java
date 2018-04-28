
class Node {
    String name;
    String type;
    int attack;
    int health;
  
    Node left;
    Node right;
 
    Node(String name) {
        this.name = name;
        right = null;
        left = null;
    }
    
    Node(String name, String type, int attack, int health) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.health = health;
        right = null;
        left = null;
    }
    
    @Override
    public String toString() {
    	return "Name: " + name + ", Type: " + type + ", Attack: " + attack + ", Health: " + health;
    }
    
}