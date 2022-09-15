public class HwExcepiton extends Exception {
    private final String message;

    public HwExcepiton(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
