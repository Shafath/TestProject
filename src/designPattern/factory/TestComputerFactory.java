package designPattern.factory;

import java.text.NumberFormat;
import java.util.Arrays;

public class TestComputerFactory {
    public static void main(String[] args) {
        System.out.println(ComputerFactory.getComputer("LAPTOP", "8Gb", "2", "1000"));
        System.out.println(ComputerFactory.getComputer("PC", "8Gb", "2", "1000"));
//        Arrays.asList()
    }
}
