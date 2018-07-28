public class Pokedex extends BinarySearchTree
{
	public void initializePokemon() 
	{		
        add("Alakazam","Electric",500,320);
        add("Balbasaur","Grass",450,375);
        add("Pikachu","Electric",520,300);
        add("Squirtle","Water",450,420);
        add("Eevee","Fire",600,600);
        add("Charizard","Fire",470,370);
        add("Blastoise","Water",490,440);
        add("Squirtle","Water",450,420);
        add("Jigglypuff","Fairy",370,350);
        add("Togepi","Fairy",270,240);
	}
	
	public void listPokemon() {
		InOrder();
	}
	public void searchPokemon(String name) {
		Node pokemon = getNodeWithName(name);
		System.out.println(pokemon);
	}
	
}
