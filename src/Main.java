import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        
        int km;
        double perKm = 2.20, total=10;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Mesafeyi kilometre cinsinden giriniz : ");
        km= scanner.nextInt();
        total += (km* perKm); 
        total= (total<20) ? 20 : total;
        System.out.println("Toplam ücret : "+ total);
    }
}
