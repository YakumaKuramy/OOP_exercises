import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Informe um texto: ");
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        System.out.println("Seu texcto aqui: " + palavra);
    }
}
