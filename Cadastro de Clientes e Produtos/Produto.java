public class Produto {
    private String produto;
    private int codigo;
    private Double preco;

    //GETTERS//
    //Get Nome(Produto) do produto
    public String getProduto() {
        return this.produto;
    }
    
    //Get Código do produto
    public int getCodigo() {
        return this.codigo;
    }

    //Get Preço do produto
    public Double getPreco() {
        return this.preco;
    }

    //SETTERS//
    //Set Código do produto
    public void setCodigo(int codigoVar) { 
        this.codigo = codigoVar;
    }

    //Set Nome(Produto) do produto
    public void setProduto(String produtoVar) {
        this.produto = produtoVar;
    }

    //Set Preço do produto
    public void setPreco(Double precoVar) {
        this.preco = precoVar;
    }

    //Método Construtor
    public Produto(){
        this("Produto não informado");
    }

    public Produto(String produto){
        this(produto, 0);
    }

    public Produto(String produto, int codigo){
        this(produto, codigo, 0.);
    }

    public Produto(String produto, int codigo, Double preco){
        this.produto = produto;
        this.codigo = codigo;
        this.preco = preco;
    }

}
