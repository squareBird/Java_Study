package GOJ.Generic.Simple;

import java.io.Serializable;

public class CastingGenericDTO<T> implements Serializable {
    T object;
    public void setObject(T object){
        this.object = object;
    }
    public T getObject() {
        return object;
    }
}
