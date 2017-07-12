import narrowOrParallel.moveResponsibility.InvoiceService;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InvoiceShould {

    @Test
    public void calculate_net_amount() throws Exception {
        InvoiceService invoiceService = new InvoiceService();

        String result = new narrowOrParallel.moveResponsibility.Invoice()
                        .calculateNetAmount("100", "10");

        assertThat(result).isEqualTo("90.0");
    }
}
