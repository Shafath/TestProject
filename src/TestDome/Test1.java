package TestDome;

//import java.util.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Test1 {

    public static void main(String[] args) {
        // Commit 1

//        System.out.println(new LocalDate().format(DateTimeFormatter.ISO_LOCAL_DATE));
        Integer X = 3;
        Integer y = null;
        try {
            System.out.println(y.compareTo(null)==0 || true);
        } catch (Exception ex) {
            System.out.println(ex.getClass().toString());
        }
    }


//    public static void badMethod()
//    {
//        throw new RuntimeException();
//    }
}
