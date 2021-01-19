import java.math.BigDecimal;

public class TaxService {
    public void payOut(String taxAmount) {
        System.out.printf("\nУплачен налог в размере " + taxAmount);
    }
}