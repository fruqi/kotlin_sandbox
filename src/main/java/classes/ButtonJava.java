package classes;

import org.jetbrains.annotations.NotNull;

/**
 * Inner & nested classes implementation in Java
 */

public class ButtonJava implements View {

    public static void main(String[] args) {
        System.out.println("Java: has no output");
    }

    @Override
    public State getCurrentState() {
        return new ButtonJavaState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }

    public class ButtonJavaState implements State {

    }
}
