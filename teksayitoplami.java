import java.util.Scanner;

public class teksayitoplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        System.out.println("Bir sayı giriniz");
        sayi = input.nextInt();

        for(int i = 1; i <= sayi; i++){
            if(i % 2 != 0){
                toplam += i;


            }

        }
        System.out.println("1 ile" + sayi + "'e kadar olan tek sayıların toplamı=");
        System.out.println(toplam);

        input.close();

    }
}
