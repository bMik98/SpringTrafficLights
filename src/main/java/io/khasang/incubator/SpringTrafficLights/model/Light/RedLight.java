package io.khasang.incubator.SpringTrafficLights.model.Light;

import org.springframework.stereotype.Component;

@Component("redLight")
public class RedLight extends Light {
    public RedLight() {
        super(Colour.RED, Mode.CONTINUOUS);
    }
}
