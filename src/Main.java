import java.util.Scanner;

public class Main {
	/**
	 * @author aula9
	 * @version 0.1
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int opcionPelo;
		do {
			System.out.println("1 - WWWWWWWWW");
			System.out.println("2 - \\\\\\//////"); //cada dos \ se interpretan como una por lo que aqui hay 3 \
			System.out.println("3 - |\"\"\"\"\"\"\"|"); // con las \ lo convierte en secuencia de escape
			System.out.println("4 - |||||||||");
			System.out.println("Introduce el numero de la opcion elegida para el pelo: ");
			opcionPelo = in.nextInt();
			if (opcionPelo < 1 || opcionPelo > 4) {
				System.out.println("La opcion elegida no es correcta. Vuelve a intentarlo");
			}			
		} while (opcionPelo < 1 || opcionPelo > 4);
		
		int opcionOjos;
		do {
			System.out.println("1 - |  O O  |");
			System.out.println("2 - |-(· ·)-|"); 
			System.out.println("3 - |-(o o)-|"); 
			System.out.println("4 - |  \\ / |");
			System.out.println("Introduce el numero de la opcion elegida para los ojos: ");
			opcionOjos = in.nextInt();
			if (opcionOjos < 1 || opcionOjos > 4) {
				System.out.println("La opcion elegida no es correcta. Vuelve a intentarlo");
			}			
		} while (opcionOjos < 1 || opcionOjos > 4);
		
		int opcionNariz;
		do {
			System.out.println("1 - @   J   @");
			System.out.println("2 - {   \"   }"); 
			System.out.println("3 - [   j   ]"); 
			System.out.println("4 - <   -   >");
			System.out.println("Introduce el numero de la opcion elegida para la nariz: ");
			opcionNariz = in.nextInt();
			if (opcionNariz < 1 || opcionNariz > 4) {
				System.out.println("La opcion elegida no es correcta. Vuelve a intentarlo");
			}			
		} while (opcionNariz < 1 || opcionNariz > 4);
		
		int opcionBoca;
		do {
			System.out.println("1 - |  ===  |");
			System.out.println("2 - |   -   |"); 
			System.out.println("3 - |  ___  |"); 
			System.out.println("4 - |  ---  |");
			System.out.println("Introduce el numero de la opcion elegida para la boca: ");
			opcionBoca = in.nextInt();
			if (opcionBoca < 1 || opcionBoca > 4) {
				System.out.println("La opcion elegida no es correcta. Vuelve a intentarlo");
			}			
		} while (opcionBoca < 1 || opcionBoca > 4);
		
		switch (opcionPelo) {
		case 1: 
			System.out.println("WWWWWWWWW");
			break; //si no lo pones se ejecutan todos los de debajo tambien
		case 2:
			System.out.println("\\\\\\//////");
			break;
		case 3: 
			System.out.println("|\"\"\"\"\"\"\"|");
			break;
		case 4: 
			System.out.println("|||||||||");
			break;  //se puede omitir 
		}
		
		switch (opcionOjos) {
		case 1: 
			System.out.println("|  O O  |");
			break; //si no lo pones se ejecutan todos los de debajo tambien
		case 2:
			System.out.println("|-(· ·)-|");
			break;
		case 3: 
			System.out.println("|-(o o)-|");
			break;
		case 4: 
			System.out.println("|  \\ / |");
		}
		
		switch (opcionNariz) {
		case 1: 
			System.out.println("@   J   @");
			break; 
		case 2:
			System.out.println("{   \"   }");
			break;
		case 3: 
			System.out.println("[   j   ]");
			break;
		case 4: 
			System.out.println("<   -   >");
		}
		
		switch (opcionBoca) {
		case 1: 
			System.out.println("|  ===  |");
			break; 
		case 2:
			System.out.println("|   -   |");
			break;
		case 3: 
			System.out.println("|  ___  |");
			break;
		case 4: 
			System.out.println("|  ---  |");
		}
		System.out.println(" \\_____/");
	}

}
