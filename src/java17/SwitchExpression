package java17;

import java.time.Month;

public class SwitchExpression {

    public static void main(String[] args) {
        int days;
        Month month = Month.APRIL;

        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER :
                days = 31;
                break;
            case FEBRUARY :
                days = 28;
                break;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER :
                days = 30;
                break;
            default:
                throw new IllegalStateException();
        }
        System.out.printf("Days in %s are %d\n", month, days);

        //java 14
        days = switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
        };

        System.out.printf("Using switch expression : Days in %s are %d\n", month, days);

        //yield keyword
        days = switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> {
                System.out.println(month);
                yield  31;
            }
            case FEBRUARY -> {
                System.out.println(month);
                yield 28;
            }
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> {
                System.out.println(month);
                yield 30;
            }
        };
    }
}
