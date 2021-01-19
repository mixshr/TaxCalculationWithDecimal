import java.math.BigDecimal;

public class Bill {
    private String amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(String amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxService = taxService;
        this.taxType = taxType;
    }

    public void payTaxes() {
        BigDecimal taxAmount = taxType.calculateTaxFor(new BigDecimal(amount));
        taxService.payOut(taxAmount.toString());
    }
}