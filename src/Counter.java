public class Counter {

    private int value;

    public Counter() {
        value = 0;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Counter(" + value + ")";
    }
}
