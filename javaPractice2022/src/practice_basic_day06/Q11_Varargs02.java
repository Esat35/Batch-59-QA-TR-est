package practice_basic_day06;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)
    public static void main(String[] args) {

        System.out.println(carpma(1.2,2.3,3.4,4.5,5.6));
    }


    public static double carpma(double... numbers) {
        int carpim = 1;
        for (int i = 0; i < numbers.length; i++)
            carpim *= numbers[i];

        return carpim;
    }


}
