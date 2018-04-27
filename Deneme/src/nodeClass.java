 
public class nodeClass {
 
    private Node head;
    private Node tail;
    private int size;
     
    public nodeClass() {
        size = 0;
    }

    private class Node {
        String item;
        String type;
        int attack;
        int health;
        Node next;
        Node prev;
 
        public Node(String item,String type,int attack,int health, Node next, Node prev) {
            this.item = item;
            this.type = type;
            this.attack = attack;
            this.health = health;
            this.next = next;
            this.prev = prev;
        }
    }

    public int size() 
    { 
    	return size; 
    }    

    public boolean isEmpty() 
    {
    	return size == 0; 
    }    

    public void addFirst(String item,String type,int attack,int health) {
        Node temp = new Node(item,type,attack,health, head, null);
        if(head != null ) {head.prev = temp;}
        head = temp;
        if(tail == null) { tail = temp;}
        size++;
        System.out.println("Name: "+item+"\nType: "+type+"\nAttack: "+attack +"\nHealth: "+health+"\n");
    }
     
    public void addLast(String item,String type,int attack,int health) {
         
        Node temp = new Node(item,type,attack,health, null, tail);
        if(tail != null) {tail.next = temp;}
        tail = temp;
        if(head == null) { head = temp;}
        size++;
        System.out.println("Name: "+item+"\nType: "+type+"\nAttack: "+attack +"\nHealth: "+health+"\n");
    }
       
    public static void main(String a[]){
         
        nodeClass dll = new nodeClass();
        dll.addFirst("Alakazam","Electric",500,320);
        dll.addFirst("Balbasaur","Grass",450,375);
        dll.addLast("Pikachu","Electric",520,300);
        dll.addLast("Squirtle","Water",450,420); 
    }
}

