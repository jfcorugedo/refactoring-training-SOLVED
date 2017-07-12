package safeUnwrap;

public class AnotherConsumer {

    public int getAmount(Model model){
        Wrapper wrapper = Wrapper.createWrapper(model);

        return wrapper.getWrapped().getWrapped().getAmount();
    }
}
