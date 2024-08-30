package java17;

sealed class INGBank permits INGNetherlands, INGBelgium {
    public void printName() {
        System.out.println(getClass().getName());
    }
}

sealed class INGNetherlands extends INGBank permits INGServiceProvider {}
final class INGBelgium extends INGBank {}
non-sealed class INGServiceProvider extends INGNetherlands {}
class INGGermany extends INGServiceProvider{} //any class can extend non-sealed class but not final or sealed class

public class SealedClasses {
    public static void main(String[] args) {
        INGBank nl = new INGNetherlands();
        INGBank be = new INGBelgium();
        INGBank isp = new INGServiceProvider();
        INGBank de = new INGGermany();

        nl.printName();
        be.printName();
        isp.printName();
        de.printName();

        System.out.println("Using sealed classes in switch expression: " + getINGBankType(nl));
    }
    private static INGBank getINGBankType(INGBank bank){
        return switch (bank) {
            case INGNetherlands nl -> nl;
            case INGBelgium be -> be;
            case INGBank b -> b;
        };
    }
}

