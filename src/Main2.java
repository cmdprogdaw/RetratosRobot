import java.util.Scanner;
public class Main2 {
		
		static Scanner in = new Scanner(System.in);
		static String [][] rasgos = {
			{"pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
			{"ojos", "|  O O  |", "|-(� �)-|", "|-(o o)-|", "|  \\ /  |"},
			{"nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
			{"boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
			{"barbilla", "\\_______/", "\\,,,,,,,/"}
		};
		
		static String obtenerRasgo(int faccion) {
			int rasgo;
			for (int i=1; i<rasgos[faccion].length; i++)
				System.out.println(i + " - " + rasgos[faccion][i]);
			do {
				System.out.println("Elige la opci�n para " + rasgos[faccion][0] + " (1-" + (rasgos[faccion].length - 1) + "):");
				rasgo = in.nextInt();
				if (rasgo < 1 || rasgo > rasgos[faccion].length)
					System.out.println("La opci�n elegida no es correcta. Vuelve a introducirla");
			} while (rasgo < 1 || rasgo > rasgos[faccion].length);
			return rasgos[faccion][rasgo];
		}
		
		public static void main(String[] args) {
			
			String [] retrato = new String[5];
			for (int faccion=0; faccion<retrato.length; faccion++) //pide opciones y las guarda en el entorno
				retrato[faccion] = obtenerRasgo(faccion);
			for (int faccion=0; faccion<retrato.length; faccion++) //los recorre otra vez para imprimirlo
				System.out.println(retrato[faccion]);
		}
		
	}

