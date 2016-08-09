package io.khasang.incubator.SpringTrafficLights.model.Lighting;

import io.khasang.incubator.SpringTrafficLights.model.Light.Light;

public class Lighting {
    private final Light light;
    private long startTime;
    private long stopTime;

    public Lighting(final Light light, long startTime, long stopTime) {
        this.light = light;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public Light getLight() {
        return light;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public boolean isTurnedOnAt(long time) {
        return ((time >= startTime) && (time <= stopTime));
    }

    public long duration() {
        return stopTime - startTime + 1;
    }
}
