public class Aplicativo {
    public static void main(String[] args){
        FormasGeometrica formas[] = new FormasGeometrica[4];
        formas[0] = new Circulo("Verde", 3.5);
        formas[1] = new Quadrado("Vermelho", 5);

        for (int i = 0; i < formas.length; i++){
            if(formas[i] != null){
                System.out.println(formas[i].toString());
                System.out.println("Área: " + formas[i].calculaArea());
                System.out.println("Perímetro: " + formas[i].calculaPerimetro());
            }
        }
    }

}
