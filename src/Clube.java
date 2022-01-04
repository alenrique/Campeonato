
public class Clube {
	
	public String nome;
	public int pontos;
	public int saldoGols;
	
	public Clube(String nome) {
		this.nome = nome;
	}
	
	public void ganhar(int saldoGols) {
		this.pontos += 3;
		this.saldoGols += saldoGols;
	}
	
	public void empatar() {
		this.pontos += 1;
	}
	
	public void perder(int saldoGols) {
		this.saldoGols -= saldoGols;
	}

}
