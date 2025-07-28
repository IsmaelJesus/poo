
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();

        System.out.print("Insira o numero que deseja ligar: ");
        String numero = scanner.nextLine();

        iphone.ligar(numero);
    }
}