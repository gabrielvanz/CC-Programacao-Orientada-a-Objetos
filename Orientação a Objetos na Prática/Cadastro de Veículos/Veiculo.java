import java.util.Calendar;

class Veiculo{
    String marca;
    String modelo;
    int anoModelo;
    void calculaTempoUso(){
        Calendar calendario = Calendar.getInstance();
        int tempo = calendario.get(Calendar.YEAR) - this.anoModelo;
        System.out.println("Este veículo tem "+tempo+" anos de uso\n");
    }
}