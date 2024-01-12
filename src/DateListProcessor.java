/**
 * @class:  DateListProcessor
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: November 25, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Consider the follow ArrayList
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class DateListProcessor {
    public static void main(String[] args) {
        ArrayList<LocalDate> dateList = new ArrayList<>();
        dateList.add(LocalDate.of(1776, Month.JULY, 4));
        dateList.add(LocalDate.of(1876, Month.JULY, 4));
        dateList.add(LocalDate.of(1900, Month.JULY, 4));
        dateList.add(LocalDate.of(1976, Month.JULY, 4));
        dateList.add(LocalDate.of(2076, Month.JULY, 4));

        System.out.println("Before removal:");
        printDates(dateList);

        // Remove entry with the year 1900
        Iterator<LocalDate> iterator = dateList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getYear() == 1900) {
                iterator.remove();
            }
        }

        System.out.println("After removal:");
        printDates(dateList);
    }

    private static void printDates(ArrayList<LocalDate> dateList) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        for (LocalDate date : dateList) {
            System.out.println(formatter.format(date));
        }
        System.out.println("size = " + dateList.size());
    }
}
