/*
+------------------+
|Rodrigo CavanhaMan|
|     URI 1961     |
|     Pula Sapo    |
+------------------+
*/
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int sapo = sc.nextInt();
		int ncanos = sc.nextInt();
		int canoant, canoatual=0;
		int ok=0;
		canoant=sc.nextInt();
		for (int i=1 ; i<ncanos ; i++){
			canoatual = sc.nextInt();
			if (canoant+sapo < canoatual){
				System.out.println("GAME OVER");
				ok=1;
				break;
			}
			else
				canoant=canoatual;
		}
		if(ok==0)
			System.out.println("YOU WIN");
		
	}
}