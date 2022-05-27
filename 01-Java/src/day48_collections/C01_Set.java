package day48_collections;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // verilen bir array'in tekrar eden elementlerini
        // sadece bir kere yazdiran bir method olusturun

        Integer arr[]= {3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsizYazdir(arr);
    }

    private static void arrayiTekrarsizYazdir(Integer[] arr) {
        Set<Integer> tekrarsizElementKumesi= new HashSet<>();
        for (Integer each : arr
             ) {
            tekrarsizElementKumesi.add(each);
        }

        System.out.println(tekrarsizElementKumesi);
    }
}
