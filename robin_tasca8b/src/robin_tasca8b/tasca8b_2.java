// Fes un programa que generi una matriu de 10x10 aleatòriament amb enters entre 0 i 9. A continuació mostri la suma de cada fila i de cada columna com al següent exemple:
package robin_tasca8b;

import java.util.Scanner;
import java.util.Random;

public class tasca8b_2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		
		int m[][] = new int[10][10];
		int mc[] = new int[10];

		Random random = new Random();
		
		for(int i = 0; i < m.length ; i++) {
			int totalf = 0;
			for(int j = 0; j < m.length ; j++) {
				m[i][j] = random.nextInt(9);
				System.out.print(m[i][j] + "  ");
				totalf += m[i][j];
				mc[j] += m[i][j];
	
			}
			
			System.out.println("| " + totalf );	
		}
			System.out.print("------------------------------+");
			System.out.println();
		for(int c = 0; c < m.length; c++) {
			
			System.out.print(mc[c] +" ");			
		}
		
		

		in.close();
	}
}
