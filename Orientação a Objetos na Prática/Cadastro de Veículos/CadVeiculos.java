class CadVeiculo{
    public static void main(String[] args){
        Veiculo mVeiculos = criaVeiculo("Chevrolet", "Corsa 1.0", 2018);
        Veiculo tVeiculos = criaVeiculo("Fiat", "Uno", 2020);        

        System.out.printf("O meu veículo é um %s, ano %d, da marca %s\n",
            mVeiculos.modelo,
            mVeiculos.anoModelo,
            mVeiculos.marca);
        mVeiculos.calculaTempoUso();
        
        System.out.printf("O teu veículo é um %s, ano %d, da marca %s\n",
            tVeiculos.modelo,
            tVeiculos.anoModelo,
            tVeiculos.marca);
        tVeiculos.calculaTempoUso();
    }

    static Veiculo criaVeiculo(String modelo, String marca, int ano){
        Veiculo veiculo = new Veiculo();
        veiculo.modelo = modelo;
        veiculo.marca = marca;
        veiculo.anoModelo = ano;
        return veiculo;
    }
}