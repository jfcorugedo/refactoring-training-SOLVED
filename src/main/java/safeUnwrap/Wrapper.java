package safeUnwrap;

public class Wrapper extends Model{
	
    private Model Wrapped;

    public Wrapper(Model wrapped) {
    	super(wrapped.getColor(), wrapped.getAmount());
        Wrapped = wrapped;
    }

    public Model getWrapped() {
        return Wrapped;
    }
}
