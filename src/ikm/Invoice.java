package ikm;

public class Invoice {
    static String oldId = "0";

    protected static  String formatId(String oldId) {
        return oldId + "invoice";
    }
}
