/*
+------------------+
|Rodrigo CavanhaMan|
|     URI 2493     |
| Jogo do Operador |
+------------------+
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int bomba=0;
		List<String> lista = new ArrayList<String>();
		int n = Integer.parseInt(sc.nextLine());
		String[] expressao = new String[n];
		String[] jogadores = new String[n];
		for (int i=0 ; i<n ; i++)
			expressao[i] = sc.nextLine();
		for (int i=0 ; i<n ; i++)
			jogadores[i] = sc.nextLine();
		
		for (int i=0 ; i<n ; i++){
			String[] auxJo = new String[3];
			auxJo = jogadores[i].split(" ");
			String jnome = auxJo[0];
			int jnum = Integer.parseInt(auxJo[1])-1;
			String jsimbolo = auxJo[2];
			
			String[] auxEx = new String[5];
			auxEx = expressao[jnum].split("");
			int n0 = Integer.parseInt(auxEx[0]);
			int n2 = Integer.parseInt(auxEx[2]);
			int n4 = Integer.parseInt(auxEx[4]);
			
			int resposta=0;
			if(jsimbolo.equals("+"))
				resposta=n0+n2;
			if(jsimbolo.equals("-"))
				resposta=n0-n2;
			if(jsimbolo.equals("*"))
				resposta=n0*n2;
			if (resposta != n4){
				lista.add(jnome);
				bomba++;
			}
		}
		if (bomba == 0)
			System.out.println("You Shall All Pass!");
		else{
			Collections.sort(lista);	// ordena a lista
			if (bomba == n)
				System.out.println("None Shall Pass!");
			else
				System.out.println(lista);
		}
		sc.close();
	}
}

/*



3
8 4=5
2 5=5
1 3=4
Samuel 2 +
Abner 3 +
Aline 1 *

2
1 2=-1  //ERRO NO MENOS 1!!
0 7=7
Luiz 2 -
Absolut 1 +

*/