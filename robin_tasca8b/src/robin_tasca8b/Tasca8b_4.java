//  Escriu un programa que demani quants números volem entrar (n). A continuació llegeixi n números enters entre 0 i 100 i conti les vegades que apareix cada número.
package robin_tasca8b;

import java.util.Scanner;


public class Tasca8b_4 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numeros = 0;
		int number;
		System.out.print("Digues quants números vols entre 0 i 100: ");
		number = in.nextInt();
		
		int m[] = new int[101];
		
		
		for (int j = 0; j < number; j++) {
			System.out.printf("Entra el número %d: ",j +1);
			numeros = in.nextInt();
			m[numeros] = m[numeros] +1;

		}
			
		
		System.out.println("---- RESULTAT ----");
		
		for(int j = 0; j < 101; j++) {
			if (m[j] > 0) {
				System.out.printf("%d apareix %d vegades \n",j,m[j]);
			}
		}
		

		

		in.close();
	}
}
