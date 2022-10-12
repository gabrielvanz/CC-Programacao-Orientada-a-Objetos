public class Circulo extends FormasGeometrica {
    private double raio;

    @Override
    public double calculaArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calculaPerimetro(){
        return 2 * (Math.PI * raio); 
    }

    @Override
    public String toString() {
        String retorno = super.toString();
        retorno += String.format("Raio: %.2f", this.raio);
        return retorno;
    }

    public Circulo(){
        this("Sem Informação", 0.0);
    }

    public Circulo(String cor, double raio){
        super("Círculo", cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    
}
