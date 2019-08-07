class KotlinRectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return width == height
        }
}