import javax.swing.JOptionPane;

public class TabuleiroTest {

	public static void main(String[] args) {
		Tabuleiro tabuleiro1 = new Tabuleiro('0', 'X');
		
		char simbolo1, simbolo2, simbolo=' ', vencer = 'f', jogadaValida='s';
		String mensagem;
		int linha, coluna, jogador = 1;

		simbolo1 = JOptionPane.showInputDialog("Insira o símbolo do jogador 1:").charAt(0);
		tabuleiro1.setJogador1(simbolo1);
		simbolo2 = JOptionPane.showInputDialog("Insira o símbolo do jogador 2:").charAt(0);
		tabuleiro1.setJogador2(simbolo2);
		
		mensagem = String.format("Jogador 1: %c\nJogador 2: %c", 
				tabuleiro1.getJogador1(), tabuleiro1.getJogador2());
		JOptionPane.showMessageDialog(null, mensagem);
		
		do{
			if (jogadaValida=='s'){
				if (jogador == 1){
					simbolo = simbolo1;
					JOptionPane.showMessageDialog(null, "Jogador 1:");
				}else{
					simbolo = simbolo2;
					JOptionPane.showMessageDialog(null, "Jogador 2:");
				}
			}
			
			linha = Integer.parseInt(JOptionPane.showInputDialog("Digite a linha a ser marcada"));
			coluna = Integer.parseInt(JOptionPane.showInputDialog("Digite a coluna a ser marcada"));

			jogadaValida=tabuleiro1.setJogada(linha, coluna, simbolo);
			
			if (jogadaValida=='s'){
				vencer = tabuleiro1.checkVencedor(simbolo);
					
				if (vencer == 'v'){
					mensagem = String.format("Jogador %d é o vencedor", jogador);
					JOptionPane.showMessageDialog(null, mensagem);
				}else{
					if (jogador == 1){
						jogador = 2;
					}else if (jogador == 2){
						jogador = 1;
					}
				}
				
				tabuleiro1.tabuleiroToString();
			}			
		} while(vencer == 'f');
	}

}
