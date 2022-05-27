package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        // Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //		*
        //		* *
        //		* * *
        //		* * * *


        int input = 5;


        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                // nested for loop ya diktorgen veya ucgen formatinda olabilir
                // diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz
                // ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz

                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
