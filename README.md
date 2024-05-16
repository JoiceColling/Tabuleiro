# Tabuleiro - Jogo da Velha
**Projeto realizado na disciplina de Programação II, dentro do curso de Ciência da Computação, no ano de 2019.**

Neste trabalho vamos implementar o Jogo da Velha. Ele é composto por um tabuleiro 3x3, cujo estado inicial é todas as posições vazias. Então, cada jogador assume um símbolo, geralmente O e X. Os jogadores se intercalam em jogadas que preenchem uma das posições com seu símbolo. Ganha aquele que conseguir incluir 3 símbolos adjacentes no tabuleiro, seja em linhas ou colunas paralelas ou nas diagonais (principal ou secundária).
Sua tarefa é implementar uma classe Tabuleiro que represente o tabuleiro do jogo. Por meio dela deve ser possível:
1) Incluir o símbolo de um jogador.
2) Verificar se houve um vencedor.
3) Reiniciar o tabuleiro (retornando para o estado inicial).
4) Deve haver apenas uma instância do tabuleiro, de forma que não haja possibilidade de alguém roubar no jogo, assim como nenhuma outra classe deve ter acesso aos dados do tabuleiro.
5) A classe deve permitir a impressão em texto (método toString) do estado do tabuleiro.
6) Um objeto Tabuleiro não deve permitir que jogadas se repitam (jogar em um posição já preenchida), assim como também jogadas inválidas.
7) Por fim, um jogador pode treinar jogadas a partir de um tabuleiro com posições já estabelecidas. Portanto, inclua a possibilidade de um construtor de classe, por meio de sobrecarga, ser capaz de inicializar o tabuleiro.
