package constructor;

public class Buildings extends Lego {
    int width;
    int height;
    int depth;

    @Override
    public String toString() {
        return "Building {" + "width='" + width + '\'' + ", height='" + height + '\'' + ", depth='" + depth + '\'' + '}';
    }
}
