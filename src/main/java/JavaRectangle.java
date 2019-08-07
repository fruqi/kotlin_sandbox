public class JavaRectangle {
    private int height;
    private int width;

    public JavaRectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public boolean isSquare() {
        return height == width;
    }
}
