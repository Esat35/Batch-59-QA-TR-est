package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]

        // remove (istenenObject) method'u istenen elementi kaldirip
        // bize true/false doner.
        // eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        // method'u boolean bir variable'a atayabilirsiniz
        boolean sonuc= isimler.remove("Oguzhan"); // true

        // sonucu kullaniciya yazdirmak isterseniz
        // if/else ile istediginiz degerlendirmeyi yazabilirsiniz
        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }

        System.out.println(isimler); // [Aykut, Yusuf, Ilker]

        sonuc = isimler.remove("Berk");
        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }

        // remove(index) yazdigimizda sildim/silmedim ihtimali kalmaz
        // bize remove edilen elemneti doner

        //System.out.println(isimler.remove(1)); // Yusuf'u siler ve
        isimler.remove(1);                                          // delil olarak Yusuf ismini bize dondurur

        // yazdirsak da yazdirmasak da liste degisti ve 1.index'deki element silindi
        System.out.println(isimler);
        // [Aykut, Ilker]
    }
}
