import java.util.Scanner;
//exer11
public class calcIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            System.out.println("Seu peso: ");
            Float peso = input.nextFloat();
        
            System.out.println("Sua altura: ");
            Float altura = input.nextFloat();
        
        Float resultIMC = peso / (altura * altura);

        System.out.println("Seu IMC é: " + resultIMC);

        if (resultIMC < 18.05 ) {
            System.out.println(consoleDeCores.BLUE + "Estas a baixo do peso, melhor nutrir-se!");
            System.out.println(consoleDeCores.RESET);
        }if ((resultIMC  > 18.5) && (resultIMC <= 25) ) {
            System.out.println(consoleDeCores.GREEN + "Estas de PARABÉNS!");
            System.out.println(consoleDeCores.RESET);
        }if ((resultIMC >= 25) && (resultIMC <= 30)) {
            System.out.println(consoleDeCores.BLACK + "Estas a cima do peso, melhor correr!");   
            System.out.println(consoleDeCores.RESET);         
        }if (resultIMC > 30) {
            System.out.println(consoleDeCores.RED + "Cuidado você corre risco de vida");
            System.out.println(consoleDeCores.RESET);
        }

        input.close();
    }
}
