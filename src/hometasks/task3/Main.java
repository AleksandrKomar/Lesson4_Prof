package hometasks.task3;

import java.text.ParseException;
import java.time.*;


public class Main {

    public static void main(String[] args) throws ParseException {

        LocalDate first = LocalDate.of(1987, 7, 7);
        LocalDate last = LocalDate.now();

        System.out.println(compare(first, last));

    }


    static String compare(LocalDate first, LocalDate last) throws ParseException {

        return "Вам исполнилось " + Period.between(first, last).getYears() + " лет" +
                ", " + Period.between(first, last).getMonths() + " месяцев" +
                ", " + Period.between(first, last).getDays() + " дней.";

    }


}
