
public class Teste {
	
	public static void main(String[] args) {

		Clube a1 = new Clube("Liverpool");
		Clube a2 = new Clube("Manchester United");
		Clube a3 = new Clube("Chelsea");
		Clube a4 = new Clube("Arsenal");
		Clube a5 = new Clube("Manchester City");
		Clube a6 = new Clube("Tottenham");
		Clube a7 = new Clube("West Ham");
		Clube a8 = new Clube("Everton");
		Clube a9 = new Clube("Brighton");
		Clube a10 = new Clube("Leicester");
		Clube a11 = new Clube("Brentford");
		Clube a12 = new Clube("Aston Villa");
		Clube a13 = new Clube("Watford");
		Clube a14 = new Clube("Southhampton");
		Clube a15 = new Clube("Crystal Palace");
		Clube a16 = new Clube("Leeds");
		Clube a17 = new Clube("Burnley");
		Clube a18 = new Clube("Newcastle");
		Clube a19 = new Clube("Wolverhampton");
		Clube a20 = new Clube("Norwich");
		Clube[] clubes = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20};
		
		Campeonato campeonato = new Campeonato(clubes);
		
		campeonato.jogarCampeonato();
		
		Clube clubeCampeao = campeonato.getCampeao();
		
		System.out.println("Campeão: " + clubeCampeao.nome + " Pontos: " + clubeCampeao.pontos);
		
	}

}
