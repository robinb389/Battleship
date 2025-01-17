// Fes un programa que demani per pantalla la mida n de la matriu i generi una matriu de n x n i l’ompli de la següent manera: La posició (i, j) de la matriu ha de contenir i+j (la suma dels índex).  Exemple matriu[1][3] = 4 . Un cop construïda la matriu cal mostrar-la per pantalla. Si la mida n és 4 hauria de sortir això:
package robin_tasca8b;

import java.util.Scanner;
// class
public class Tasca8b_1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int number;
		System.out.print("Put here a Number: ");
		number = in.nextInt();
		
		int m[][] = new int[number][number];

		
		for(int i = 0; i < m.length; i++) {
			
			for(int j = 0; j < m.length ; j++) {
				m[i][j] = i + j;
				System.out.print( m[i][j] + " ");
			}
			
			System.out.println();
		}
		
		in.close();
	}
}
