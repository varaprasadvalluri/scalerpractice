package hacker.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Timeformate {
    public static void main(String[] args) throws ParseException {
        String d = "07:05:45PM";
//        DateFormat df = new SimpleDateFormat("hh:mm:ssa");
//        DateFormat out = new SimpleDateFormat("HH:mm:ss");
//        Date date = df.parse(d);
//        System.out.println(out.format(date));
        //
        LocalDate localDate = LocalDate.parse(d, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(localDate.format(formatter));


    }
}
