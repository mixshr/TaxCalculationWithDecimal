import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.doubleValue() > 100000) {
            return amount.multiply(new BigDecimal("0.15"));
        } else {
            return amount.multiply(new BigDecimal("0.10"));
        }
    }
}