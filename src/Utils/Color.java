package Utils;

/**
 * This enum class is used to color our texts
 */
public enum Color {

    RED ("\u001B[31m"),
    GREEN ("\u001B[32m"),
    BLUE ("\u001B[34m"),
    YELLOW_BOLD("\033[1;33m"),
    PURPLE ("\u001B[35m"),
    WHITE ("\u001B[37m"),
    BLACK ("\u001B[30m");

    public final String color;

    /**
     * The color constructor
     * Initialize the color
     *
     * @param color the color of some data inside the enum
     */
    Color(String color){
        this.color=color;
    }
}
