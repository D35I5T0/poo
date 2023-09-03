package poo;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Produto p;
        String codigo;
        int op, opcao;
        System.out.println("Informe a quantidade máxima de produtos: ");
        int tam = Integer.parseInt(sc.nextLine());
        CadastroProduto loja = new CadastroProduto(tam);

        do {
            menu();
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1: 
                    System.out.println("Informe o código do produto: ");
                    codigo = sc.nextLine();
                    p = new Produto(codigo);
                    loja.cadastrarProduto(p);
                    break;
                case 2: 
                    System.out.println("Informe o código do produto: ");
                    codigo = sc.nextLine();
                    p = new Produto(codigo);
                    loja.exibirProduto(p);
                    break;
                case 3: 
                    loja.exibirLista();
                    break;
                case 4:
                    System.out.println("Informe o código do produto: ");
                    codigo = sc.nextLine();
                    p = new Produto(codigo);
                    System.out.println("Digite 1, para aumento. E 2, para desconto: ");
                    opcao = Integer.parseInt(sc.nextLine());
                    System.out.println("Informe o percentual de mudança: ");
                    double perc = Double.parseDouble(sc.nextLine());
                    loja.alterarPreco(p, perc, opcao);
                    break;
                case 5: 
                    System.out.println("Informe o código do produto: ");
                    codigo = sc.nextLine();
                    p = new Produto(codigo);
                    System.out.println("Informe a quantidade a ser alterada: ");
                    opcao = Integer.parseInt(sc.nextLine());
                    while (opcao <= 0) {
                        System.out.println("O número precisa ser maior que 0");
                        opcao = Integer.parseInt(sc.nextLine());
                    }
                    loja.atualizarEstoque(p, opcao);
                    break;
                case 6: 
                    System.out.println("Informe o código do produto: ");
                    codigo = sc.nextLine();
                    p = new Produto(codigo);
                    System.out.println("Informe a quantidade a ser alterada: ");
                    opcao = Integer.parseInt(sc.nextLine());
                    while (opcao <= 0) {
                        System.out.println("O número precisa ser maior que 0");
                        opcao = Integer.parseInt(sc.nextLine());
                    }
                    loja.venderProduto(p, opcao);
                    break;
                case 7:
                    System.out.println("Informe o código do produto: ");
                    codigo = sc.nextLine();
                    p = new Produto(codigo);
                    loja.removerProduto(p);
                    break;
                case 0: 
                    System.out.println("Fim de programa");
                    break;
                default: 
                    System.out.println("Tente novamente");
                    break;
            }
        } while (op != 0);
        sc.close();
    }
    public static void menu() {
        System.out.println("1 - Cadastro de um produto");
        System.out.println("2 - Exibição dos dados de um produto");
        System.out.println("3 - Exibição de todos os produtos da loja");
        System.out.println("4 - Alterar o preço de um produto");
        System.out.println("5 - Atualizar estoque de um produto");
        System.out.println("6 - Realizar a venda de um produto");
        System.out.println("7 - Remover um produto do cadastro");
        System.out.println("0 - Sair do programa");
        System.out.println("Digite a opção desejada: ");
    }
}
