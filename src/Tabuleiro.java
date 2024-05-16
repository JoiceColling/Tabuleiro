import javax.swing.JOptionPane;

public class Tabuleiro {
	private char tabuleiro[][] = new char[3][3];
	private char jogador1;
	private char jogador2;
	
	public Tabuleiro (char jogador1Inicial, char jogador2Inicial) {
		setTabuleiro();
		setJogador1(jogador1Inicial);
		setJogador2(jogador2Inicial);
	}
	
	public void setTabuleiro() {
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				tabuleiro[i][j] = '-';
			}
		}
	}
	
	public void setJogador1(char jogador1Inicial) {
		this.jogador1 = jogador1Inicial;
	}
	
	public void setJogador2(char jogador2Inicial) {
		this.jogador2 = jogador2Inicial;
	}
	
	public char[][] getTabuleiro() {
		return tabuleiro;
	}
	
	public char getJogador1() {
		return jogador1;
	}
	
	public char getJogador2() {
		return jogador2;
	}

	public char setJogada(int linha, int coluna, char simbolo) {
		if (tabuleiro[linha][coluna] == '-'){
			tabuleiro[linha][coluna] = simbolo;
			return 's';
		}else{
			JOptionPane.showMessageDialog(null, "Espaço já preenchido! Tente Novamente.");
			return 'n';
		}
	}
	
	public char checkVencedor(char simbolo){	
		char retorno = 'f';
		
		if ((tabuleiro[0][0] == simbolo && tabuleiro[0][1] == simbolo && tabuleiro[0][2] == simbolo) ||
			(tabuleiro[1][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[1][2] == simbolo) ||
			(tabuleiro[2][0] == simbolo && tabuleiro[2][1] == simbolo && tabuleiro[2][2] == simbolo)){
			retorno = 'v';
		}
		
		if ((tabuleiro[0][0] == simbolo && tabuleiro[1][0] == simbolo && tabuleiro[2][0] == simbolo) ||
			(tabuleiro[0][1] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][1] == simbolo) ||
			(tabuleiro[0][2] == simbolo && tabuleiro[1][2] == simbolo && tabuleiro[2][2] == simbolo)){
				retorno = 'v';
		}
		
		if ((tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) ||
			(tabuleiro[2][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[0][2] == simbolo)){
			retorno = 'v';
		}
		
		return retorno;
	}
	
	public void tabuleiroToString() {
		String mensagem = "";
		
		for (int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				mensagem += tabuleiro[i][j]+ "	";
			}
			mensagem += "\n";
		}		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
