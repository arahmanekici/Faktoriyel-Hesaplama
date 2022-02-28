import java.util.Scanner;
public class Main {

    static public void main(String[] args) {

        Scanner input = new Scanner (System.in);
        String appInformation= ("Faktoriyel Hesaplama");

        System.out.println(appInformation);
        System.out.print("Sayi Girin: ");
        int sayi = input.nextInt();
        int total=1;
        for (int i=1; i<=sayi; i++){
            total=total*i;

        }
        System.out.println("Faktöriyel :"+ total);
    }
}
