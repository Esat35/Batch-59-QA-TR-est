package day22_arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        String arr[]={"S","M","A","T"};

        System.out.println(Arrays.toString(arr));  // [S, M, A, T]

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [A, M, S, T]
        // Java da bu siralamaya Natural Order denir
        // sayi olursa kucukten buyuge
        // metin olursa alfabetik siralamaya gore

    }
}
