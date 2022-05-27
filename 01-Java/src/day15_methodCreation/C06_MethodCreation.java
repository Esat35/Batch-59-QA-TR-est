package day15_methodCreation;

public class C06_MethodCreation {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        // iki variable'in degerlerini toplayan bir method olusturalim
        // 1.adim : method adini yazalim
        // 2.adim : method'a gondermem gereken argument var mi ?
        ikiSayiTopla(25,50);

        C04.dortHarfiTersineCevir("sema");
    }

    // bir method'u olusturmak calismasi icin yeterli degildir
    // method ancak cagrilirsa calisir
    // ayni class veya farkli class'da olmasinin hic bir onemi yoktur
    // Java main method'da yukaridan asagiya dogru calisir
    // ve geldigi satiri calistirir

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami : " + (a+b));
    }

}
