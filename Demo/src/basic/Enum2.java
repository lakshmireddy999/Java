package basic;

enum DaysOfWeek
{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class Enum2 {
    public static void main(String[] args) {

        for (DaysOfWeek obj : DaysOfWeek.values()) {
            switch (obj) {
                case MONDAY:
                    System.out.println("It is a hectic day!");
                    break;
                case TUESDAY:
                    System.out.println("It is again a hectic day!");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday is a hectic day!");
                    break;
                case THURSDAY:
                    System.out.println("Thursday is cool!");
                    break;
                case FRIDAY:
                    System.out.println("Weekend coming!");
                    break;
                case SATURDAY:
                    System.out.println("Weekend!");
                    break;
            }
        }
    }
}