package io.khasang.incubator.SpringTrafficLights.model.Light;

import org.springframework.stereotype.Component;

@Component("redBlinkingLight")
public class RedBlinkingLight extends Light {
    public RedBlinkingLight() {
        super(Colour.RED, Mode.BLINKING);
    }
}
