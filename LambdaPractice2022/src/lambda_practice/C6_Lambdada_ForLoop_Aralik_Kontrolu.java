package lambda_practice;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {
        ilk30(30);
        System.out.println();
        ilk30Dahil(30);
        System.out.println();
        System.out.println("top(10,20) = " + top(10, 20));
        System.out.println("ort(20,30) = " + ort(20, 30));
        System.out.println();
        System.out.println("sekizeBolunen(325,468) = " + sekizeBolunen(325, 468));
        System.out.println();
        sekizeBolunenSayiariYaz(325, 468);
        System.out.println();
        System.out.println("sekizeBolunenSayiariToplam(325,468) = " + sekizeBolunenSayiariToplam(325, 468));
        System.out.println("carpim(7,15) = " + carpim(7, 15));
        ilk10(10);
        System.out.println();
        yedininKatlari(21);
        System.out.println();
        System.out.println("yedininKatlaritoplam(20) = " + yedininKatlaritoplam(20));

    }

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)
    public static void ilk30(int a) {
        IntStream.range(1, a).
                forEach(t -> System.out.print(t + " "));
    }

    //S2:  1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)
    public static void ilk30Dahil(int a) {
        IntStream.rangeClosed(1, a).
                forEach(t -> System.out.print(t + " "));
    }

    //S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim
    public static int top(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).sum();
        // return IntStream.rangeClosed(bas,bitis+1).sum();
    }

    //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim
    public static OptionalDouble ort(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).average();
    }

    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?
    public static long sekizeBolunen(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).
                filter(t -> t % 8 == 0).count();
    }

    //S6: 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim
    public static void sekizeBolunenSayiariYaz(int bas, int bitis) {
        IntStream.rangeClosed(bas, bitis).
                filter(t -> t % 8 == 0).forEach(t -> System.out.print(t + " "));
    }

    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim
    public static int sekizeBolunenSayiariToplam(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).
                filter(t -> t % 8 == 0).sum();
    }

    // S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim
    public static double carpim(int a, int b) {
        return IntStream.rangeClosed(a, b).filter(Methods::tekMi).reduce(1, (x, y) -> x * y);
    }

    //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim
    public static void ilk10(int a) {
        //  IntStream.rangeClosed(1,a).limit(10).
        //          filter(Methods::tekMi).forEach(Methods ::yazInteger);
        //  //1-10 arasındaki tek sayiları verir.. YANLIS
        IntStream.iterate(1, t -> t + 2).limit(10).
                forEach(Methods::yazInteger);

    }

    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim

    public static void yedininKatlari(int a){
        IntStream.iterate(21,t->t+7).
                filter(Methods::tekMi).limit(10).
                forEach(Methods ::yazInteger);
    }


    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim

    public static int yedininKatlaritoplam(int a){
      return  IntStream.iterate(21,t->t+7).
                limit(20).
                sum();
    }

}
//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belirliyoruz