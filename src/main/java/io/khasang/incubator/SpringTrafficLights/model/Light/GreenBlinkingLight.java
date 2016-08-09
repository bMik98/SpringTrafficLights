package io.khasang.incubator.SpringTrafficLights.model.Light;

import org.springframework.stereotype.Component;

@Component("greenBlinkingLight")
public class GreenBlinkingLight extends Light {
    public GreenBlinkingLight() {
        super(Colour.GREEN, Mode.BLINKING);
    }
}
