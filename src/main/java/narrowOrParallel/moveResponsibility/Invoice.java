package narrowOrParallel.moveResponsibility;

import java.math.BigDecimal;

public class Invoice {
    public BigDecimal grossAmount;
    public BigDecimal taxPercentage;
    public int numberOfItems;
	public String calculateNetAmount(String amount, String tax, InvoiceService invoiceService){
		
	    Invoice invoice = this;
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
