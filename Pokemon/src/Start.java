import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pokedex ash = new Pokedex();
		ash.initializePokemon();
		int choice;
		
		do{
			System.out.print("\n1-Create Custom Pokemon \n2-List Pokemons \n3-Shut Down Device \nChoice? :");
			choice = input.nextInt();
			
			if(choice == 1){
				System.out.print("Name? :");
				String _name = input.nextLine();
				String name = input.nextLine();
				System.out.print("Type? :");
				String type = input.nextLine();
				System.out.print("Attack? :");
				int attack = input.nextInt();
				System.out.print("Health? :");
				int health = input.nextInt();
				
				ash.add(name, type, attack, health);
				
				
			} else if (choice == 2){
				ash.listPokemon();
			
			} else if (choice == 3){
				System.out.println("Good Luck..");
				break;
				
			}
			
		}while(choice != 3);

	}

}
