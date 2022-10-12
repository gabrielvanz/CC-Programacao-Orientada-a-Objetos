public class FormasGeometrica {
    private String nome;
    private String cor;

    public String toString() {
        return String.format("\n%-20s Cor: %-15s", this.nome, this.cor);
    }

    public double calculaArea(){
        return 0.0;
    }

    public double calculaPerimetro(){
        return 0.0;
    }

    public FormasGeometrica(){
        this("SemInformação","SemInformação");
    }

    public FormasGeometrica(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    

}