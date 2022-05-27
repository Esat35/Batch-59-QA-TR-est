package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> myMap= new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K",5);

        // bir ekleme yapmak istedigimizde Key daha once eklenmemisse map'e eklsen
        // daha onceden eklenmisse , eskiyi silmemek icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A",6));

        if (myMap.putIfAbsent("K", 20) != null){
            System.out.println("Girdiginiz Key Map'de zaten var");
        }


        System.out.println(myMap);

       myMap.put("A",10);

        System.out.println(myMap);

        myMap.computeIfAbsent("A", v -> 20);
        System.out.println(myMap);

        myMap.compute("A" , (key,value) -> 20);
        System.out.println(myMap);

        // H'nin degerini 2 katinin 5 fazlasi yapalim

        myMap.compute("H", (m,n) ->(2*n+5));

        System.out.println(myMap);


    }
}
