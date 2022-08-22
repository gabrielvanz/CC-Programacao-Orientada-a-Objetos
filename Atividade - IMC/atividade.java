

import java.util.Scanner;

class Atividade {
    public static void main(String[] args){
        Scanner lerTeclado = new Scanner(System.in);
        String nome;
        char genero;
        double altura, peso;

        System.out.println("Digite seu nome: ");
        nome = lerTeclado.next();

        System.out.println("\nDigite sua altura: ");
        altura = lerTeclado.nextDouble();

        System.out.println("\nDigite seu peso: ");
        peso = lerTeclado.nextDouble();
    
        System.out.println("\nDigite seu genero: ");
        genero = lerTeclado.next().charAt(0);

        if (genero == 'm' | genero == 'M' | genero == 'f' | genero == 'F'){ 

        }else{
            genero = 'N';
        }

        //Calcular IMC
        double imc = peso / (altura*altura);
        System.out.println("Nome: "+nome);
        System.out.println("Gênero: "+genero);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
        System.out.println("IMC: "+Math.floor(imc));
    
        //Classificação IMC - Masculino / Feminino

        if (genero == 'm' | genero == 'M'){
            if(imc > 40){
                System.out.println("Classificação: Obesidade Mórbida");
            }else if(imc >= 30 && imc <= 39.9){
                System.out.println("Classificação: Obesidade Moderada");
            }else if(imc >=25 && imc <=29.9){
                System.out.println("Classificação: Obesidade Leve");
            }else if(imc >= 20 && imc <= 24.9){
                System.out.println("Classificação: Normal");
            }else{
                System.out.println("Classificação: Abaixo do Normal");
            }
        }else if (genero == 'f' | genero == 'F'){
            if(imc > 39){
                System.out.println("Classificação: Obesidade Mórbida");
            }else if(imc >= 29 && imc <= 38.9){
                System.out.println("Classificação: Obesidade Moderada");
            }else if(imc >=24 && imc <=28.9){
                System.out.println("Classificação: Obesidade Leve");
            }else if(imc >= 19 && imc <= 23.9){
                System.out.println("Classificação: Normal");
            }else{
                System.out.println("Classificação: Abaixo do Normal");
            }
        }

    }  
}