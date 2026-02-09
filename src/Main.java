import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mini Java Hesap Makinesi");
        
        System.out.print("Birinci sayı: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("İşlem (+, -, *, /): ");
        String op = scanner.next();
        
        System.out.print("İkinci sayı: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        switch(op) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": 
                if(num2 != 0) result = num1 / num2;
                else {
                    System.out.println("Hata: 0 ile bölünemez!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }
        
        System.out.println("Sonuç: " + result);
    }
}
 
