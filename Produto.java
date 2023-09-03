package poo;
public class Produto implements Comparable <Produto>{
    private String codigo;
    private String descricao;
    private String fornecedor;
    private double preco;
    private int qtd;

    public Produto(String codigo, String descricao, String fornecedor, double preco, int qtd) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.qtd = qtd;
    }

    public Produto (String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void aplicarDesconto(double desconto) {
        if (desconto <= 0) {
            System.out.println("Ensira uma quantidade superior a 0");
        }
        else {
            desconto = desconto / 100;
            double novoPreco = this.preco - (this.preco * desconto);
            this.preco = novoPreco;
        }
    }

    public void aplicarAumento(double aumento) {
        if (aumento <= 0) {
            System.out.println("Ensira uma quantidade superior a 0");
        }
        else {
            aumento = aumento / 100;
            double novoPreco = this.preco + (this.preco * aumento);
            this.preco = novoPreco;
        };
    }

    public void atualizarEstoque(int estoque) {
        if (estoque <= 0) {
            System.out.println("Ensira uma quantidade superior a 0");
        }
        else {
            int novoEstoque = this.qtd + estoque;
            this.qtd = novoEstoque;
        }
    }

    public void venderProduto(int estoque) {
        if (estoque > this.qtd) {
            System.out.println("Não há essa quantidade em estoque");
        }
        else {
            int novoEstoque = this.qtd - estoque;
            this.qtd = novoEstoque;
        }
    }

    public String toString() {
        return "Código: " + this.codigo + " Descrição: " + this.descricao + " Fornecedor: " + this.fornecedor + " Preço: " + this.preco + " Quantidade: " + this.qtd;
    }

    public int compareTo (Produto p) {
        return this.codigo.compareTo(p.getCodigo());
    }
}
