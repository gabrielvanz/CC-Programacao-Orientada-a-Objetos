import java.util.Scanner;

class Atividade2 {
    public static void main(String[] args) {
        System.out.println("Help Java");
        System.out.println("1 - Instrucao IF Simples");
        System.out.println("2 - Instrucao IF com blocos de comandos");
        System.out.println("3 - Instrucao IF aninhado");
        System.out.println("4 - Instrucao SWITCH\n");
        System.out.println("Escolha uma opcao");
        Scanner lerTeclado = new Scanner(System.in);
        int valor = lerTeclado.nextInt();

        switch (valor) {
            case 1:
                System.out.println("\nESTRUTURA IF SIMPLES");
                System.out.println("if (condicao) instrucao;");
                System.out.println("else  instrucao;\n");
                break;
            case 2:
                System.out.println("\nESTRUTURA IF BLOCO");
                System.out.println("if (condicao) {");
                System.out.println("  instrucao1;");
                System.out.println("  instrucao2;");
                System.out.println("} else {");
                System.out.println("  instrucao3;");
                System.out.println("  instrucao4;");
                System.out.println("}\n");
                break;
            case 3:
                System.out.println("\nESTRUTURA IF ANINHADO");
                System.out.println("if (condicao) {");
                System.out.println("  instrucao1;");
                System.out.println("  instrucao2;");
                System.out.println("} else if (condicao2) {");
                System.out.println("  instrucao3;");
                System.out.println("  instrucao4;");
                System.out.println("} else {");
                System.out.println("  instrucao5;");
                System.out.println("}\n");
                break;
            case 4:
                System.out.println("\nSWITCH");
                System.out.println("switch (expressao) {");
                System.out.println("  case constante1:");
                System.out.println("    instrucao1;");
                System.out.println("    instrucao2;");
                System.out.println("    break;");
                System.out.println("  case constante2:");
                System.out.println("    instrucao3;");
                System.out.println("    instrucao4;");
                System.out.println("    break;");
                System.out.println("  default:");
                System.out.println("    instrucao5;");
                System.out.println("}\n");
                break;
            default:
                System.out.println("\nOpcao invalida\n");
        }
    }
}
