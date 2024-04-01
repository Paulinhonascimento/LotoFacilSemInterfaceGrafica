import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Ganhe_mais {
    public static void main(String[] args) throws IOException{
        int NumeroAposta = -1;
        char LetraAposta;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao;

        do {
            System.out.println("º-----------------------------°");
            System.out.println("°        BEM VINDO!           °");
            System.out.println("° 1) Aposta de 0 a 100        °");
            System.out.println("° 2) Aposta de A a Z          °");
            System.out.println("° 3) Aposta em PAR ou IMPAR   °");
            System.out.println("° 0) Desistir                 °");
            System.out.println("°-----------------------------°");

            System.out.println("Escolha uma opção:  ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você selecionou a opção 1 - Apostar de 0 á 100!");
                    System.out.println("Digite um numero de 0 a 100:  ");
                    int numeroAleatorio = 1 random.nextInt(96);
                    NumeroAposta = scanner.nextInt();
                    if (NumeroAposta < 0 || NumeroAposta > 100){
                        System.out.println("Aposta Invalida. \n");
                        break;
                    }
                    if(NumeroAposta == numeroAleatorio){
                        System.out.println("Você ganhou R$ 1,000,000,00 Reais, Parabéns!!");
                    }else{
                        System.out.printf("\nInfelizmente não foi desta vez, o numero sorteado era: %d \n", numeroAleatorio);
                    }
                    break;
                case 2:
                    System.out.println("Você selecionou a opção 2 - Apostar de A á Z!");
                    System.out.println("Digite uma Letra de A á Z:  ");
                    int entrada = System.in.read();
                    char letraDigitada = (char) entrada;
                    if (Character.isLetter(letraDigitada)) {
                        LetraAposta = Character.toUpperCase(letraDigitada);
                        char letraPremiada = 'P';
                        if (LetraAposta == letraPremiada) {
                            System.out.println("Você acabou de ganhar R$ 8,000,00 Reais, Parabéns!! \n");
                        }else{
                            System.out.printf("\n Infelizmente não foi desta fez, a letra sorteda foi: %s \n", letraPremiada);
                        }
                    }else{
                        System.out.println("Aposta inválida.");
                    }
                    break;
                case 3:
                    System.out.println("Você selecionou a opção 3 - Apostar em PAR ou IMPAR!");
                    System.out.println("Digite um numero inteiro: ");
                    NumeroAposta = scanner.nextInt();
                    if (NumeroAposta % 2 == 0) {
                        System.out.println("Você acaba de ganhar R$10,00,00 reais, Parabéns!!! \n");
                    }else {
                        System.out.println("Que pena! O número digitado foi IMPAR e a premiada foi para números PARES. \n");
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por participar do sorteio, Volte e Ganhe Mais !");
                    break;
            }
        }while (opcao != 0);
    }
}