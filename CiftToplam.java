package donguler;

import java.util.Scanner;

public class CiftToplam {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Bir sayı giriniz: ");
            sayi = scanner.nextInt();
            if(sayi%4==0){
                toplam += sayi;
            }
        }while (sayi%2==0);
        System.out.print("Girilen sayılardan 4'e tam olarak bölünenlerin toplamı: " + toplam);
    }
}
