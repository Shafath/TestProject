package designPattern.factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String RAM, String CPU, String HDD) {
        if(type.equals("PC")) {
            return new PC(RAM, CPU, HDD);
        } else if(type.equals("LAPTOP")) {
            return new Laptop(RAM, CPU, HDD);
        }

        return null;
    }
}
