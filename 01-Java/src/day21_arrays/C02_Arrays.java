package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali", "Veli","Ayse"};
        // array icindeki elementlere ulasabilmek icin index kullaniriz

        System.out.println(arr1[0]); // Ali

        arr1[1]="Esila";

        System.out.println(arr1[1]); // Esila

        // arrayin icindeki indexi kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]= new int[4];

        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
        // System.out.println(arr2[5]);// ArrayIndexOutOfBoundsException

        // Arrayin tamamini yazdirmak istersek

        System.out.println(arr2); // [I@58ceff1
                                    // array'ler non-primitive olduklarindan direk yazdirmak
                                    // istersek java referans bilgisini yazdirir

        for (int i = 0; i <4 ; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
        // array i yazdirmak icin Javadaki Arrays class'indan toString() kullanilir

        System.out.println(Arrays.toString(arr2)); // [0, 0, 0, 0]

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2)); // [0, 11, 0, 22]

        System.out.println(Arrays.toString(arr1)); // [Ali, Esila, Ayse]



    }
}
