package safeUnwrap;

public class Consumer {

    public String getColor(Model model){
        Wrapper wrapper = Wrapper.createWrapper(model);

        return wrapper.getWrapped().getWrapped().getColor();
    }
}
