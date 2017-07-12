package safeUnwrap;

public class Wrapper extends Model{
	
    public static Model createWrapper(Model wrapped) {
		return new Wrapper(wrapped);
	}

	Model Wrapped;

    private Wrapper(Model wrapped) {
    	super(wrapped.getColor(), wrapped.getAmount());
        Wrapped = wrapped;
    }
}
