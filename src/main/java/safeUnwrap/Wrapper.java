package safeUnwrap;

public class Wrapper extends Model{
	
    Model Wrapped;

    private Wrapper(Model wrapped) {
    	super(wrapped.getColor(), wrapped.getAmount());
        Wrapped = wrapped;
    }
}
