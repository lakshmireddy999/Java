package basic;

import java.time.*;

public class Timedate {
    public static void main(String[] args) {
    LocalDate ld=LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getYear());
        LocalDateTime l=LocalDateTime.now();
        System.out.println(l);
        // LocalDate ld= LocalDate.now();
        //LocalDate o=LocalDate.of(2012,7,24);
        //LocalDate o=LocalDate.of(2012,Month.FEBRUARY,24);
        // LocalDate ld=LocalDate.parse("2012-07-24");
    }
}
