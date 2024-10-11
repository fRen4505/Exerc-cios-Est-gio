import model.*;
import java.util.Scanner;

public class MainQuestões {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usOpt;
        String word;
        Integer num;

        do {
        System.out.println("\n PERGUNTAS DE 1 A 5 DO TESTE TÉCNICO \n \n Digite a opção que deseja ver: \n \n F.fibonacci \t MA.maiusculo/minusculo e quantidade de 'A's \t V.valores da questão 3) \t S.sair");
        System.out.println("digite em maisculo");
        usOpt = scan.nextLine();

        switch (usOpt) {
            case "F":
                System.out.println("Teste de Fibonacci \n Digite um numero:");
                num = scan.nextInt();
        
                Fibon fibonacci = new Fibon(num);
        
                if (fibonacci.testFibonacci() == true) {
                    System.out.println(num + " esta SIM na sequencia");
                } else {
                    System.out.println(num + " NÃO esta na sequencia");
                }
        
                System.out.println(fibonacci.getSequencia());
    
                break;
        
            case "MA":
                System.out.println("Digite uma palavra para testar se ela tem 'a' ");
                word = scan.nextLine();

                Stringtest verificar = new Stringtest(word);
                verificar.qntA();

                break;
            case "V":
                int indice = 12;
                int soma = 0;
                int k = 1;

                while (k < indice) {
                    k = k + 1;
                    soma = soma + k;
                    System.out.println(soma);
                }
                System.out.println("valor final é: "+soma);
            default:
                break;
        }
    } while (usOpt != "S");
        scan.close();
    }
}
