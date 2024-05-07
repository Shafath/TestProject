package designPattern.factory;

public class PC extends Computer {
    private String RAM;
    private String CPU;
    private String HDD;

    public PC(String RAM, String CPU, String HDD) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.HDD = HDD;
    }

    @Override
    public String getRAM() {
        return RAM;
    }

    @Override
    public String getCPU() {
        return CPU;
    }

    @Override
    public String getHDD() {
        return HDD;
    }
}
