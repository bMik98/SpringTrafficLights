package io.khasang.incubator.SpringTrafficLights.model.Light;

public class Light {
    private final Light.Colour colour;
    private final Light.Mode mode;

    public enum Colour {
        RED, YELLOW, GREEN
    }

    public enum Mode {
        CONTINUOUS, BLINKING,
    }

    public Light(final Light.Colour colour, final Light.Mode mode) {
        this.colour = colour;
        this.mode = mode;
    }

    public Light.Colour getColour() {
        return colour;
    }

    public Light.Mode getMode() {
        return mode;
    }
}
