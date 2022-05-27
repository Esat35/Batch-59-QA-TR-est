package practice_basic_day06;

import java.time.LocalDate;
import java.time.Month;

public class Q04_LocalDate02 {
    public static void main(String[] args) {

        /*
       Which of the following can be inserted into the blank to create a date of June 21, 2014?
       21 Haziran 2014 tarihini olusturmak için bos bırakılan yere asagidakilerden hangisi veya hangileri getirilebilir?
       A. new LocalDate(2014, 5, 21); //new keywordu LocalDate de kullanilmaz
       B. new LocalDate(2014, 6, 21); //new keywordu LocalDate de kullanilmaz
       C. LocalDate.of(2014, 5, 21); //5.ay vermis  Mayis ayi..
       D. LocalDate.of(2014, 6, 21);  **cevap**
       F. LocalDate.of(2014, Month.JUNE, 21); **cevap**
         */


        LocalDate date1  = LocalDate.of(2014, Month.JUNE,21);
        System.out.println("date1 = " + date1); //date1 = 2014-06-21

        LocalDate date2  = LocalDate.of(2014, 6,21);
        System.out.println("date2 = " + date2); //date2 = 2014-06-21
    }
}
