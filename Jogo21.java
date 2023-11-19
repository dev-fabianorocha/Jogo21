import java.util.Scanner;

public class MainGame{
	

	public static void main(String[] args) {
	
		Jogador1 j1 = new Jogador1();
		j1.menuJogador1();
		
		
		Jogador2 j2 = new Jogador2();
		j2.menuJogador2();

		
		Validador v = new Validador();
		v.validar(j1, j2);
		
		
	}
	
}

class GerarCarta {
	
	  protected String[] nipes;
	  protected String[] faces;
	  protected String face;
	  protected String nipe;	
	  
}

class Jogador1 extends GerarCarta {
	
	
	private Scanner sc;
	private int op;
	public int totalPontos1;


	void menuJogador1() {	
		
		
		for(int i = 0 ; i <= 10 ; i ++) {
		System.out.println("----------------------------------------------------------------------------");
			System.out.println("");
		System.out.println("Jogador 1 Escolha uma das Opções abaixo:");
		System.out.println("");
		System.out.println("1 -- PEGAR CARTA  --");
		System.out.println("2 -- PARAR JOGADA --");
		System.out.println("");
		sc = new Scanner(System.in);
		System.out.print("Opção : "); op = sc.nextInt();
		String[] nipes = {"Ouros","Copas","Espadas","Paus"};
        String[] faces = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};    
        String nipe = nipes[(int) (Math.random() * 4)];
        String face = faces[(int) (Math.random() * faces.length)];
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        
		if (op == 1) {
			System.out.println("Você Pegou : "+ face + " de " + nipe);
			if (face == "A") {
				totalPontos1 = totalPontos1 + 1;
			}
			if (face == "K" || face == "Q" || face == "J" || face == "10") {
				totalPontos1 = totalPontos1 + 10;
			}
			if (face == "9") {
				totalPontos1 = totalPontos1 + 9;
			}
			if (face == "8") {
				totalPontos1 = totalPontos1 + 8;
			}
			if (face == "7") {
				totalPontos1 = totalPontos1 + 7;
			}
			if (face == "6") {
				totalPontos1 = totalPontos1 + 6;
			}
			if (face == "5") {
				totalPontos1 = totalPontos1 + 5;
			}
			if (face == "4") {
				totalPontos1 = totalPontos1 + 4;
			}
			if (face == "3") {
				totalPontos1 = totalPontos1 + 3;
			}
			if (face == "2") {
				totalPontos1 = totalPontos1 + 2;
			}
		}
		if (op == 2)  {
			System.out.println("Jogador1 parou a jogada");
			System.out.println("Pontos : " +totalPontos1);
			System.out.println("----------------------------------------------------------------------------");
			break;
			
	}
		System.out.println("Pontos : " +totalPontos1);
		System.out.println("----------------------------------------------------------------------------");
	}


		
}
	
}

class Jogador2 extends GerarCarta  {
	
	private Scanner sc;
	private int op;
	public int totalPontos2;
	
	void menuJogador2() {	
		
		 
	    
		for(int i = 0 ; i <= 10 ; i ++) {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Jogador 2 Escolha uma das Opções abaixo:");
		System.out.println("");
		System.out.println("1 -- PEGAR CARTA  --");
		System.out.println("2 -- PARAR JOGADA --");
		System.out.println("");
		sc = new Scanner(System.in);
		System.out.print("Opção : "); op = sc.nextInt();
		String[] nipes = {"Ouros","Copas","Espadas","Paus"};
        String[] faces = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};    
        String nipe = nipes[(int) (Math.random() * 4)];
        String face = faces[(int) (Math.random() * faces.length)];
        System.out.println("----------------------------------------------------------------------------");

		
        if (op == 1) {
            System.out.println("Você Pegou : " + face + " de " + nipe);
			if (face == "A") {
				totalPontos2 = totalPontos2 + 1;
			}
			if (face == "K" || face == "Q" || face == "J" || face == "10") {
				totalPontos2 = totalPontos2 + 10;
			}
			if (face == "9") {
				totalPontos2 = totalPontos2 + 9;
			}
			if (face == "8") {
				totalPontos2 = totalPontos2 + 8;
			}
			if (face == "7") {
				totalPontos2 = totalPontos2 + 7;
			}
			if (face == "6") {
				totalPontos2 = totalPontos2 + 6;
			}
			if (face == "5") {
				totalPontos2 = totalPontos2 + 5;
			}
			if (face == "4") {
				totalPontos2 = totalPontos2 + 4;
			}
			if (face == "3") {
				totalPontos2 = totalPontos2 + 3;
			}
			if (face == "2") {
				totalPontos2 = totalPontos2 + 2;
			}
		}
		if (op == 2)  {
			System.out.println("Jogador2 parou a jogada");
			System.out.println("Pontos   : " +totalPontos2);
			System.out.println("----------------------------------------------------------------------------");
			break;
		}
		System.out.println("Pontos : " +totalPontos2);
		System.out.println("----------------------------------------------------------------------------");
	}	
		
}
	
}

class Validador {
	
	
	void validar(Jogador1 j1, Jogador2 j2) {	
		
		int totalJ1 = j1.totalPontos1;
		int totalJ2 = j2.totalPontos2;
		
		System.out.println("TOTAL PONTOS JOGADOR 1 -----> "+totalJ1);
		System.out.println("TOTAL PONTOS JOGADOR 2 -----> "+totalJ2);
		System.out.println();
		
		if (totalJ1 > totalJ2 && totalJ1 <= 21) {			
			System.out.println("-----------------------------JOGADOR 1 GANHOU-------------------------------");
			}
		else {
			System.out.println("-----------------------------JOGADOR 2 GANHOU-------------------------------");
		}
		
		if (totalJ1 == totalJ2) {
			System.out.println("----------------------------------EMPATE------------------------------------");
		}
		if(totalJ1 > 21 && totalJ2 > 21) {
			System.out.println("----------------------------------EMPATE------------------------------------");
		}
	}
	
}


