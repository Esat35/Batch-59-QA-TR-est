package day15_methodCreation;

public class C07_MethodCreation {

    public static void main(String[] args) {

        // string'i yazdiran method olusturalim
        // hosgeldiniz diyen bir method olusturun
        // kapanma mesaji yazn bir method olustur
        hosgeldinYazdir();

    }
    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }
    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("Boyle de olur");
    }
    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
