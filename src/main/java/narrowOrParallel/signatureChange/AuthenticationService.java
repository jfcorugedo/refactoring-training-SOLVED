package narrowOrParallel.signatureChange;

public class AuthenticationService {
	
    public boolean isAuthenticated(Id uuid) {
        return uuid.getId() == 12345;
    }
}
