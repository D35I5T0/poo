package poo;
public class CadastroProduto {
    private Produto[] lista;
    private int qtd;

    public CadastroProduto(int tam) {
        this.lista = new Produto[tam];
    }
    public void cadastrarProduto(Produto p) {
        if (this.qtd < lista.length) {
            int i = buscarVetor(p);
            if (i == -1) {
                this.lista[this.qtd] = p;
                this.qtd++;
            }
            else {
                System.out.println("O código já existe na loja.");
            }
        }
        else {
            System.out.println("Lista cheia");
        }
    }
    public void exibirLista() {
        for (int i = 0; i < this.qtd; i++) {
            System.out.println(this.lista[i].toString());
            System.out.println(" ");
        }
    }
    public void exibirProduto (Produto p) {
        int i = buscarVetor(p);
        if (i == -1) {
            System.out.println("O código não foi encontrado");
        }
        else {
            System.out.println(this.lista[i].toString());
        }
    }
    public void alterarPreco (Produto p, double perc, int op) {
        int i = buscarVetor(p);
        if (i == -1) {
            System.out.println("O código não foi encontrado");
        }
        else {
            if (op == 1) {
                this.lista[i].aplicarAumento(perc);
            }
            else if (op == 2) {
                this.lista[i].aplicarDesconto(perc);
            }
            else {
                System.out.println("Digite a opção certa");
            }
        }
    }
    public void atualizarEstoque (Produto p, int quantidade) {
        int i = buscarVetor(p);
        if (i == -1) {
            System.out.println("O código não foi encontrado");
        }
        else {
            this.lista[i].atualizarEstoque(quantidade);
        }
    }
    public void venderProduto (Produto p, int quantidade) {
        int i = buscarVetor(p);
        if (i == -1) {
            System.out.println("O código não foi encontrado");
        }
        else {
            this.lista[i].venderProduto(quantidade);    
        }
    }
    public void removerProduto (Produto p) {
        int posicao = buscarVetor(p);
        if (posicao == -1) {
            System.out.println("O código não foi encontrado");
        }
        else {
            this.lista[posicao] = null;
            for (int i = posicao; i < qtd - 1; i++) {
                this.lista[i] = this.lista[i + 1];
                this.lista[i + 1] = null;
            }
            qtd --;
        }
    }
    public int buscarVetor (Produto p) {
        int result = -1;
        for (int i = 0; i < this.qtd; i++) {
            if (p.compareTo(this.lista[i]) == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
