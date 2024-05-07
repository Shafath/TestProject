import javax.swing.text.html.Option;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) throws FileNotFoundException {
        String strA = "A";
        String strB = "B";

        String stringnull = null;
        StringBuilder stringBuilder = new StringBuilder("C");
        Formatter formatter = new Formatter(stringBuilder);

        formatter.format("%s%s", strA, strB);
        System.out.println(formatter);

        formatter.format("%-2s", strB);
        System.out.println(formatter);

        formatter.format("%b", stringnull);
        System.out.println(formatter);




    }

    /*public static void method1() {

    }*/
}
