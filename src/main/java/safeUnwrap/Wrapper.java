package safeUnwrap;

public class Wrapper extends Model{
	
    Model Wrapped;

    public Wrapper(Model wrapped) {
    	super(wrapped.getColor(), wrapped.getAmount());
        Wrapped = wrapped;
    }
}
