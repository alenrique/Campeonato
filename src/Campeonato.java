import java.util.Random;

public class Campeonato {
	
	public Clube[] clubes;
	
	public Campeonato(Clube[] clubes) {
		this.clubes = clubes;
	}
	
	public void jogarCampeonato() {
		int i,j;
		
		for(j = 0; j < this.clubes.length; j++) {
			for(i = j + 1; i < this.clubes.length; i++) {
				jogarPartida(clubes[i], clubes[j]);
			}
		}
		for(j = 0; j < this.clubes.length; j++) {
			for(i = j + 1; i < this.clubes.length; i++) {
				jogarPartida(clubes[j], clubes[i]);
			}
		}
	}
	
	public void jogarPartida(Clube m, Clube v) {
		int im,iv;
		Random random = new Random();
		im = random.nextInt(5);
		iv = random.nextInt(5);
		if(im > iv) {
			m.ganhar(im - iv);
			v.perder(im - iv);
		}
		else if(im == iv) {
			m.empatar();
			v.empatar();
		}
		else {
			m.perder(iv - im);
			v.ganhar(iv - im);
		}
		String resultado = m.nome + " " + im + " x " + iv + " " + v.nome;
		System.out.println(resultado);
	}
	
	public Clube getCampeao() {
		Clube campeao;
		campeao = clubes[0];
		for (int i = 1; i < clubes.length; i++) {
			if(clubes[i].pontos > campeao.pontos) {
				campeao = clubes[i];
			}
			else if(clubes[i].pontos == campeao.pontos) {
				if(clubes[i].saldoGols < campeao.saldoGols) {
					campeao = clubes[i];
				}
			}
		}
		return campeao;
	}

}
