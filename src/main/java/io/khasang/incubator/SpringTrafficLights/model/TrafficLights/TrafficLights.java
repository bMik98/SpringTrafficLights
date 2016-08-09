package io.khasang.incubator.SpringTrafficLights.model.TrafficLights;

import io.khasang.incubator.SpringTrafficLights.model.Light.Light;

public interface TrafficLights {
    public String getName();

    public Light getLightAt(long time);

    public Light getNextLight(long time);
}
