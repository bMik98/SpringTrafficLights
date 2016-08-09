package io.khasang.incubator.SpringTrafficLights.model.Light;

import org.springframework.stereotype.Component;

@Component("greenLight")
public class GreenLight extends Light {
    public GreenLight() {
        super(Colour.GREEN, Mode.CONTINUOUS);
    }
}
