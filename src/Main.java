import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); //Capturar Entrada de Dados
        String escolha;
        int linhas = 0, colunas = 0;


        while (true) {
            try {
                System.out.println("Digite o número de linhas: ");
                linhas = leitor.nextInt();
                if (linhas <= 0) {
                    System.out.println("O número de linhas deve ser um número positivo e inteiro.");
                } else {
                    System.out.println("Número de linhas inserido com sucesso.");
                    break;
                }
            } catch (InputMismatchException excecao) {
                System.out.println("Opção inválida. Por favor, digite um número inteiro e positivo.");
                leitor.next();
            }
        }


        while (true) {
            try {
                System.out.println("Digite o número de colunas: ");
                colunas = leitor.nextInt();
                if (colunas <= 0) {
                    System.out.println("O número de colunas deve ser um número positivo e inteiro.");
                } else {
                    System.out.println("Número de colunas inserido com sucesso.");
                    break;
                }
            } catch (InputMismatchException excecao) {
                System.out.println("Opção inválida. Por favor, digite um número inteiro e positivo.");
                leitor.next();
            }
        }

        Matriz matriz = new Matriz(linhas, colunas);

        matriz.preencherRandom();

        System.out.println("Aguarde! A sua matriz está sendo preenchida com valores aleatórios...");
        System.out.println("...");
        System.out.println("Aqui está a sua matriz: ");
        matriz.exibir();

        while (true) {
            System.out.println("Você deseja inserir ou deletar algum elemento da sua matriz? Escolha uma das opções abaixo: ");
            System.out.println("1 - Inserir Elemento");
            System.out.println("2 - Excluir Elemento");
            System.out.println("3 - Não, eu quero continuar do jeito que está.");
            int escolha1 = leitor.nextInt();
            switch (escolha1) {
                case 1:
                    System.out.println("Digite a linha onde deseja inserir o elemento: ");
                    int linhaInserir = leitor.nextInt();
                    System.out.println("Digite a coluna onde deseja inserir o elemento: ");
                    int colunaInserir = leitor.nextInt();
                    System.out.println("Digite o valor que deseja inserir: ");
                    int elementoInserir = leitor.nextInt();
                    matriz.inserir(linhaInserir, colunaInserir, elementoInserir);
                    System.out.println("Matriz após a inserção: ");
                    matriz.exibir();;
                    break;
                case 2:
                    System.out.println("Primeiramente, verifique novamente a matriz para ter certeza se o elemento que deseja excluir existe.");
                    matriz.exibir();
                    System.out.println("Digite a linha onde deseja excluir o elemento: ");
                    int linhaExcluir= leitor.nextInt();
                    System.out.println("Digite a coluna onde deseja excluir o elemento: ");
                    int colunaExcluir = leitor.nextInt();
                    System.out.println("Digite o valor que deseja excluir: ");
                    int elementoExcluir = leitor.nextInt();
                    matriz.excluir(linhaExcluir, colunaExcluir, elementoExcluir);
                    System.out.println("Matriz após a exclusão: ");
                    matriz.exibir();;
                    break;
                case 3:
                    System.out.println("Certo! Iremos continuar o programa mostrando outra função.");
                    break;
                default:
                    System.out.println("Opção inválida, por favor, escolha uma das opções entre 1, 2 e 3");
                    continue;
            }
            break;
        }

        while (true) {
            System.out.println("Como você deseja ordenar a matriz?");
            System.out.println("Digite a letra 'L' para ordenar por linhas");
            System.out.println("Digite a letra 'C' para ordenar por colunas");
            System.out.println("Digite a letra 'M' para ordenar a matriz por completo");

            escolha = leitor.next();
            escolha = escolha.toUpperCase();

            switch (escolha) {
                case "L":
                    System.out.println("Você escolheu ordenar por linhas");
                    break;
                case "C":
                    System.out.println("Você escolheu ordenar por colunas.");
                    break;
                case "M":
                    System.out.println("Você escolheu ordenar a matriz por completo.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite as letras 'L', 'C' ou 'M'.");
                    continue;
            }
            break;
        }
    }
}