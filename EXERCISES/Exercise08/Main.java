package EXERCISES.Exercise08;

import java.time.*;
import java.time.format.*;
public class Main {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

        String formatDate = date.format(formatObj);

        System.out.println(formatDate);

    }

}