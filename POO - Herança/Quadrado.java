public class Quadrado extends FormasGeometrica {
    private double aresta;

    @Override
    public double calculaArea(){
        return Math.pow(this.aresta,2);
    }

    @Override
    public double calculaPerimetro(){
        return this.aresta * 4; 
    }

    @Override
    public String toString() {
        String retorno = super.toString();
        retorno += String.format("Aresta: %.2f", this.aresta);
        return retorno;
    }

    public Quadrado(){
        this("Sem Informação", 0.0);
    }

    public Quadrado(String cor, double aresta){
        super("Quadrado", cor);
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    
}
