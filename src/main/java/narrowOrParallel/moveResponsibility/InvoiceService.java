package narrowOrParallel.moveResponsibility;

import java.math.BigDecimal;

public class InvoiceService {
    public String calculateNetAmount(String amount, String tax, Invoice invoice2){
    	
        Invoice invoice = invoice2;
        invoice.grossAmount = new BigDecimal(amount);
        invoice.taxPercentage = new BigDecimal(tax);
        return invoice.grossAmount.subtract(
                invoice.grossAmount.multiply(
                        invoice.taxPercentage.divide(
                                new BigDecimal("100")
                        )))
                .toString();
    }
}
