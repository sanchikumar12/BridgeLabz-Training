package Day_16_classroom;

public class StringBox<T> implements Container<T> {

    public T val;

    @Override
    public void setValue(T v) {
        this.val = v;
    }

    @Override
    public T getValue() {
        return val;
    }
}