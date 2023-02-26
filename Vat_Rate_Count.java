import  java.util.Scanner;
public class Vat_Rate_Count {
    public static void main (String[] args){
        double MoneyValue, KDVDahilFiyat, KDVHesaplama, Tutar;
        Scanner Input = new Scanner (System.in);
        System.out.println ("Hoşgeldiniz, para miktarini giriniz:");
        MoneyValue = Input.nextInt();
        KDVHesaplama = MoneyValue * 18 / 100;
        KDVDahilFiyat =  MoneyValue + KDVHesaplama;
        System.out.println("KDV fiyatı:" + KDVHesaplama);
        System.out.println("KDV dahil fiyatı:" + KDVDahilFiyat);
        /*System.out.println("KDV fiyatı:" + KDVHesaplama);
        Tutar = KDVHesaplama < 1000 ? MoneyValue / 100 * 18 : MoneyValue / 100 *8;
        System.out.println(Tutar);*/
    }

}
