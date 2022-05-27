package day04_dataCasting_Increment;

public class C05_IncrementDecrement {

    public static void main(String[] args) {
        int sayi=20;

        System.out.println(sayi+ 10); // 30
        // bu satirda sayiyi 10 artirmadim
        // sayinin 10 fazlasini yazdirdim

        System.out.println(sayi); // 20

        // eger atama yapmazsak sayida yaptigimiz artirma veya azaltma kalici olmaz

        sayi=sayi+10;

        System.out.println(sayi);

        System.out.println(sayi=sayi+=10); // 40

        System.out.println(sayi); // 40


        System.out.println(sayi+=10); // 50
        System.out.println(sayi); // 50

        // bir variable'in degerini kalici olarak artirmak veya azaltmak isterseniz assignment sarttir

        System.out.println("30.satir : "+ sayi++); // 50
        System.out.println("31.satir : " + sayi); // 51


        System.out.println("34.satir : " + ++sayi); // 52
        System.out.println("35.satir : " + sayi); // 52
    }

}
