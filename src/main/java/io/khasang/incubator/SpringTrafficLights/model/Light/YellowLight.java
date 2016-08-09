package io.khasang.incubator.SpringTrafficLights.model.Light;

import org.springframework.stereotype.Component;

@Component("yellowLight")
public class YellowLight extends Light {
    public YellowLight() {
        super(Colour.YELLOW, Mode.CONTINUOUS);
    }
}
