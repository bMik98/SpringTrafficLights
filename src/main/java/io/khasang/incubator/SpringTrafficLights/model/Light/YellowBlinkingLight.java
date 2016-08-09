package io.khasang.incubator.SpringTrafficLights.model.Light;

import org.springframework.stereotype.Component;

@Component("yellowBlinkingLight")
public class YellowBlinkingLight extends Light {
    public YellowBlinkingLight() {
        super(Colour.YELLOW, Mode.CONTINUOUS);
    }
}
