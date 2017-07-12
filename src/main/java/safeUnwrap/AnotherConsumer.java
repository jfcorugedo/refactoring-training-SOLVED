package safeUnwrap;

public class AnotherConsumer {

    public int getAmount(Model model){
        Model wrapper = Wrapper.createWrapper(model);

        return wrapper.getWrapped().getWrapped().getAmount();
    }
}
