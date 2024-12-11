// Millora el joc dels vaixells que vas fer en la tasca7: Utilitza 5 files i 5 columnes  i amaga 2 vaixells. També cal que vagis mostrant les caselles on hi ha aigua després de cada jugada. El joc s'acaba quan s'han trobat els 2 vaixells Ex:
package robin_tasca8b;

import java.util.Scanner;
import java.util.Random;

public class Tasca8b_3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		
		char m[][] = new char[5][5];


		char word = (' ');
		char word1 = (' ');
		String Vaixell1 = ("");
		String Vaixell2 = ("");
		String Aigua = ("");
		int intents = 0;
		
		int wincount = 0;
		
		int v1 = random.nextInt(5) +1 ;
		int v11 = random.nextInt(5) +1 ;
		int v2 = random.nextInt(5) +1 ;
		int v22 = random.nextInt(5) +1 ;
		
		// LETTERS AS A NUMBER AND ALSO TO RANDOM CORDINATES.
		for(int n = 0; n < 1; n++) {
		
			if (v1 == 1 ) {
				word = ('A');
			} else if (v1 == 2) {
				word = ('B');
			}  else if (v1 == 3) {
				word = ('C');
			}  else if (v1 == 4) {
				word = ('D');
			}  else if (v1 == 5) {
				word = ('E');
			}
			Vaixell1 = (word + "," + v11);
			
			
			if (v2 == 1) {
				word1 = ('A');
			} else if (v2 == 2) {
				word1 = ('B');
			}  else if (v2 == 3) {
				word1 = ('C');
			}  else if (v2 == 4) {
				word1 = ('D');
			}  else if (v2 == 5) {
				word1 = ('E');
			}
			Vaixell2 = (word1 + "," + v22);
			
					
			
		}
		
		System.out.print("  A B C D E");
		System.out.println();
		
		// Box Pattren
		for(int i = 0; i < m.length; i++) {
			System.out.print(i +1 + " ");

			
			for(int j = 0; j < m[i].length ; j++) {
				
				m[i][j] = '*';
				System.out.print(m[i][j] + " ");
				
			}

			System.out.println();
		}
		char lletra=' ';
		int convert = 0;
		int convert1 = 0;
		while(wincount < 2) {
			
			
			// Asking for coordinations.
			System.out.printf("Put here the corrdinates,Exmple(A,2) (Portes: %d intents): ",intents);
			String cord = in.nextLine();
			cord = cord.toUpperCase();
			
			
			lletra = cord.charAt(0);
			
			
			if(lletra == 'A') {
				convert = 1;
			} else if(lletra == 'B') {
				convert = 2;
			} else if(lletra == 'C') {
				convert = 3;
			} else if(lletra == 'D') {
				convert = 4;
			} else if(lletra == 'E') {
				convert = 5;
			}
			
			
			
			char numero = cord.charAt(2);
			
			if(numero == '1') {
				convert1 = 1;
			} else if(numero == '2') {
				convert1 = 2;
			} else if(numero == '3') {
				convert1 = 3;
			} else if(numero == '4') {
				convert1 = 4;
			} else if(numero == '5') {
				convert1 = 5;
			}
			
			
			
				
			
				if (Vaixell1.equals(cord)) {
					System.out.println("Vaixell fundat!!");
					m[v11 -1 ][v1 -1] = 'V';
					wincount++;
					intents++;
				} else if (Vaixell2.equals(cord)) {
					System.out.println("Vaixell fundat!!");
					m[v22 -1][v2 -1] = 'V';
					wincount++;
					intents++;
				} else {
					System.out.println("Aigua");
					m[convert1 -1][convert -1] = 'A';
					intents++;
				}
				
					
				
			System.out.print("  A B C D E");
			System.out.println();
			
		
			
			// Box Pattren
			for(int i = 0; i < m.length; i++) {
				System.out.print(i+1 + " ");	
					for(int j = 0; j < m.length; j++) {
						
						System.out.print(m[i][j] + " ");
					}
				System.out.println();
		}
			
		}
		//Ha adivinat
		System.out.printf("Has fet %d intents",intents);
		in.close();
	}
}
