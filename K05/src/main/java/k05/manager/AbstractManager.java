package k05.manager;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager<T> extends ArrayList<T> {

    public AbstractManager(T[] t) {
        super(List.of(t));
    }
}
