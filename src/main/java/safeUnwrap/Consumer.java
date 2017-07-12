package safeUnwrap;

public class Consumer {

    public String getColor(Model model){
        Model wrapper = Wrapper.createWrapper(model);

        return wrapper.getWrapped().getWrapped().getColor();
    }
}
