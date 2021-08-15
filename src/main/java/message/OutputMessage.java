package message;

public class OutputMessage {
    public static final String TAB = "\t";
    public static final String NEW_LINE = "\n";
    private static final String DIVIDER = "____________________________________________________________";
    private final String message;

    public OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getFormattedMessage() {
        return OutputMessage.TAB
                + OutputMessage.DIVIDER
                + OutputMessage.NEW_LINE
                + OutputMessage.TAB
                + this.getMessage()
                + OutputMessage.NEW_LINE
                + OutputMessage.TAB
                + OutputMessage.DIVIDER
                + OutputMessage.NEW_LINE;
    }
}

