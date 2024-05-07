package ikm;

public enum Element {
    HELIUM("HE", "Gas");
    private String chemicalSymbol;
    private String test2;

    Element(String he, String gas) {
        chemicalSymbol = he;
        test2 = gas;
    }

    public String getChemicalSymbol() {
        return chemicalSymbol;
    }
    public String getTest2() {
        return test2;
    }
}
