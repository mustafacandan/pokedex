import java.util.Scanner;

public class Start 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Pokedex pd = new Pokedex();
		pd.initializePokemon();
		int choice;
	
		
		do{
			System.out.print("\n1-Create Custom Pokemon \n2-List Pokemons \n3-Search Pokemon \n4-Shut Down Device \nChoice :");
			choice = sc.nextInt();
			
			if(choice == 1)
			{
				System.out.print("Name? :");				
				String _name = sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Type? :");
				String type = sc.nextLine();
				System.out.print("Attack? :");
				int attack = sc.nextInt();
				System.out.print("Health? :");
				int health = sc.nextInt();
				
				pd.add(name, type, attack, health);								
			} 
			else if (choice == 2)
			{
				pd.listPokemon();			
			} 
			else if (choice == 3)
			{
				System.out.print("Name of Pokemon? :");	
				String _name = sc.nextLine();
				String name = sc.nextLine();
				pd.searchPokemon(name);
				
			}
			else if (choice == 4)
			{
				System.out.println("Good Bye..");
				break;				
			}
		}
		while(choice != 4);
	}
}