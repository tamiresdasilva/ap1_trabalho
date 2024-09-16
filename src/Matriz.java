import java.util.Arrays;
import java.util.Random;

public class Matriz {
    private int[][] matriz;
    private int linhas;
    private int colunas;
    private int posicaoAtual;

    //Construtor
    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = new int[linhas][colunas];
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void preencherRandom() {
        Random random = new Random();
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                matriz[l][c] = random.nextInt(100);
            }
        }
    }

        public void exibir(){
            for (int l = 0; l < linhas; l++) {
                for (int c = 0; c < colunas; c++) {
                    System.out.print(matriz[l][c] + " ");
                }
                System.out.println();
            }
        }

    public void excluir(int linha, int coluna, int elemento){
        if(matriz[linha][coluna] == elemento){
            matriz[linha][coluna] = 0;;
            posicaoAtual--;
        }else{
            System.out.println("Não foi possível excluir o elemento.");
        }
    }

    public void inserir(int linha, int coluna, int elemento){
        if(posicaoAtual < this.matriz.length){
            matriz[linha][coluna] = elemento;
            posicaoAtual++;
        }else{
            System.out.println("Não foi possível inserir o elemento.");
        }
    }
}

