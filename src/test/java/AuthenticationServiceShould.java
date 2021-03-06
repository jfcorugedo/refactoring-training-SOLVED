import narrowOrParallel.signatureChange.AuthenticationService;
import narrowOrParallel.signatureChange.Id;

import org.junit.Assert;
import org.junit.Test;

public class AuthenticationServiceShould {

    @Test
    public void distinguish_administrator_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int adminId = 12345;
        Assert.assertTrue(service.isAuthenticated(new Id(adminId)));
    }
    @Test
    public void distinguish_non_admin_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int normalUserId = 11111;
        Assert.assertFalse(service.isAuthenticated(new Id(normalUserId)));
    }
}
