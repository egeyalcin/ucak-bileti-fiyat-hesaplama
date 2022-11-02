import java.util.Scanner;

public class Ucak {
    public static void main(String[] args) {
        int km,yas,yolculukTipi;
        double maliyet;

        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz :");
        km = inp.nextInt();
        System.out.println("Yasinizi giriniz :");
        yas = inp.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) :");
        yolculukTipi = inp.nextInt();

        maliyet = km * 0.10;

        if (km < 0 ) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        if (yas < 0 ) {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        if (yolculukTipi == 2 || yolculukTipi == 1) {
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        if (yas < 12 && yas >= 0) {
            maliyet = maliyet / 2;

        }
        else if (yas >= 12 && yas <= 24) {
            maliyet = maliyet - (maliyet * 10 / 100);

        }
        else if (yas > 65) {
            maliyet = maliyet - (maliyet * 30 / 100);

        }
        if (yolculukTipi == 2) {
            maliyet = (maliyet - (maliyet * 20 / 100)) * 2;

        }

        System.out.println("Toplam Tutar :"+ maliyet);

    }
}
